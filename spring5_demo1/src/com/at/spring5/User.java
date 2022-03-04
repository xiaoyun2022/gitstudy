package com.at.spring5;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String username;
    private String password;
    @Autowired
    private VipUser vipUser;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVipUser(VipUser vipUser) {
        this.vipUser = vipUser;
    }

    public VipUser getVipUser() {
        return vipUser;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void add(){
        System.out.println("add");
    }
}
