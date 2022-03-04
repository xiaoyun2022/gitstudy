package com.at.spring5;

public class VipUser extends User {

    private int vipnumber;

    public void setVipnumber(int vipnumber) {
        this.vipnumber = vipnumber;
    }

    public int getVipnumber() {
        return vipnumber;
    }

    @Override
    public String toString() {
        return "VipUser{" +
                "vipnumber=" + vipnumber +
                '}';
    }


}
