package eu.karols.myfirstblog.model;

import java.util.Date;

public class Article {
	 
    private int id;
    private String title;
    private String text;
    private Date date;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getText() {
        return text;
    }
 
    public void setText(String text) {
        this.text = text;
    }
    
    public Date getDate() {
        return date;
    }
 
    public void setDate(Date date) {
        this.date = date;
    }
}
