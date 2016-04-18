package com.test.myapplication.Model;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class UserModel {

    private int ID;
    private String userName;
    private String userPassword;

    public UserModel(int id, String un, String up){
        ID = id; userName = un; userPassword = up;
    }
    public String getUserName(){
        return userName;
    }

    public java.lang.String getUserPassword() {
        return userPassword;
    }

    public int getID(){
        return ID;
    }


}
