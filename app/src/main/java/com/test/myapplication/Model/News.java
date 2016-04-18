package com.test.myapplication.Model;
import java.util.Date;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class News {
    private int newsID;
    private int ownerID;
    private String title;
    private String date;
    private String text;

    public News(int id, int oid, String ti, String d, String te){
        newsID = id; ownerID = oid; title = ti; date = d; text = te;
    }

    int getNewsID(){
        return newsID;
    }
    int getOwnerID(){
        return ownerID;
    }
    String getTitle(){
        return title;
    }
    String getDate(){
        return date;
    }
    String getText(){
        return text;
    }

}
