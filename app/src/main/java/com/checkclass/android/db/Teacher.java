package com.checkclass.android.db;

public class Teacher {
    private  int ID;
    private  String PassWord;
    private  String GongHao;
    private  String Name;
    private  int Type;
    private  String  kecheng;
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

    public String getGongHao() {
        return GongHao;
    }

    public void setGongHao(String gongHao) {
        GongHao = gongHao;
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

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
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
