package com.yildizapp.request;

import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

/**
 * Created by ubuntu on 18.05.2016.
 */
public class OrganizationServiceRequest {

    public Integer organizationId;
    public String title;
    public String content;
    public String date;
    public String time;
    public String place;
    public String type;
 //   public Blob picture;
    public String organizator;

    public String getOrganizator() {
        return organizator;
    }

    public void setOrganizator(String organizator) {
        this.organizator = organizator;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

   // public Blob getPicture() {
    //    return picture;
   // }

   // public void setPicture(Blob picture) {
   //     this.picture = picture;
   // }
}
