package com.hjz.todolist_pro.model;

import java.util.Date;




public class Note {
    private String content;
    private Priority pirority; //1 for low, 2 for middle, 3 for high
    private int state; //0 for normal, 1 for checked
    private Date createdate;
    public long id;

    public Note(long id){
        this.id = id;
    }

    public void setContent(String c){
        this.content = c;
    }

    public void setPriority(Priority p){
        this.pirority = p;
    }

    public void setStates(int s){
        this.state = s;
    }

    public void setDate(Date d){
        this.createdate = d;
    }

    public String getContent(){
        return content;
    }

    public Priority getPriority(){
        return pirority;
    }

    public int getStates(){
        return state;
    }

    public Date getDate(){
        return createdate;
    }

}
