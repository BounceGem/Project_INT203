package model;

import java.sql.*;

public class User {

    private int memId;
    private String fname;
    private String lname;
    private String phone;
    private String user;
    private String password;
    private String address;
    private String email;
    private boolean isAdmin;

    public void login(String usern, String pass) {
        try {
            Connection con = ConnectionBuilder.getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM Meepooh.member WHERE username=? AND password=?");
            ps.setString(1, usern);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                User.orm(rs, this);
                con.close();
            } else {
                con.close();
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }

    public void logout() {
        this.setMemId(0);
        this.fname = "";
        this.lname = "";
        this.phone = "";
        this.user = "";
        this.password = "";
        this.email = "";
        this.address = "";
        this.setIsAdmin(0);
    }

    public void register(String user, String password, String fname, String lname, String address, String phone, String email) throws SQLException {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement regis
                    = con.prepareStatement("INSERT INTO Meepooh.member (`mem_id`, `username`, `password`, `fname`, `lname`, `address`, `phone`, `email`, `isadmin`) "
                            + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?);");
            regis.setString(1, user);
            regis.setString(2, password);
            regis.setString(3, fname);
            regis.setString(4, lname);
            regis.setString(5, address);
            regis.setString(6, phone);
            regis.setString(7, email);
            regis.setInt(8, 0);
            regis.executeUpdate();
            con.close();
        }
    }

    public void editPass(String password, int mem_id) throws SQLException {
        try (Connection con = ConnectionBuilder.getConnection()) {
            PreparedStatement editPass = con.prepareStatement("UPDATE Meepooh.member SET password=? WHERE userid=? ");
            editPass.setString(1, password);
            editPass.setInt(2, mem_id);
            editPass.executeUpdate();
            con.close();
        }
    }

    public static void orm(ResultSet rs, User user) throws SQLException {
        user.setMemId(rs.getInt("mem_id"));
        user.setUser(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setFname(rs.getString("fname"));
        user.setLname(rs.getString("lname"));
        user.setAddress(rs.getString("address"));
        user.setMobile(rs.getString("phone"));
        user.setEmail(rs.getString("email"));
        user.setIsAdmin(rs.getInt("isAdmin"));
    }

    public int getMemId() {
        return memId;
    }

    public void setMemId(int memId) {
        this.memId = memId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMobile() {
        return phone;
    }

    public void setMobile(String mobile) {
        this.phone = mobile;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        boolean a = false;
        if (isAdmin == 1) {
            a = true;
        }
        this.isAdmin = a;
    }

    @Override
    public String toString() {
        return "User{" + "memId : " + memId + ", fname : " + fname + ", lname : " + lname + ", phone : " + phone + ", user : " + user + ", password : " + password + ", address : " + address + ", email : " + email + ", isAdmin : " + isAdmin + '}';
    }

}
