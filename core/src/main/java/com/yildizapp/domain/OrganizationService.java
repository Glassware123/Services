package com.yildizapp.domain;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="Etkinlikler")
public class OrganizationService {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer organizationId;

    @Column(name = "title")
    public String title;

    @Column(name = "content")
    public String content;

    @Column(name = "date")
    public String date;

    @Column(name = "time")
    public String time;

    @Column(name = "place")
    public String place;

    @Column(name = "type")
    public String type;

  //  @Column(name = "picture")
  //  public Blob picture;

    @Column(name = "organizator")
    public String organizator;


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
    //}

    //public void setPicture(Blob picture) {
   //     this.picture = picture;
  //  }

    public String getOrganizator() {
        return organizator;
    }

    public void setOrganizator(String organizator) {
        this.organizator = organizator;
    }
}
