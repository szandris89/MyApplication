package com.test.myapplication.Model;
import java.util.Date;

/**
 * Created by mobsoft on 2016. 04. 18..
 */
public class NewsModel {
    private int newsID;
    private int ownerID;
    private String title;
    private Date date;
    private String text;

    NewsModel(int id, int oid, String ti, Date d, String te){
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
    Date getDate(){
        return date;
    }
    String getText(){
        return text;
    }

}
