package com.checkclass.android.db;

import android.app.PendingIntent;

import java.security.PrivateKey;
import java.util.PriorityQueue;

public class Student {
    private  int ID;
    private  String PassWord;
    private  String xuehao;
    private  String Name;
    private  int Type;
    private  String  Banji;
    private  String  Tel;
    private  String latitude;
    private  String longitude;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getBanji() {
        return Banji;
    }

    public void setBanji(String banji) {
        Banji = banji;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
}
