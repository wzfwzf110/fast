package com.speed.fast.Domain;

import java.util.Objects;

public class User {
    /*用户名*/
    private String userName;

    /*用户编码*/
    private String userCode;

    /*密码*/
    private String password;

    /*邮箱*/
    private String mail;

    /*联系电话*/
    private String phone;

    /*地址*/
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserName().equals(user.getUserName()) &&
                getUserCode().equals(user.getUserCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getUserCode());
    }
}
