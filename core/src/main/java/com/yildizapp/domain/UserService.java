package com.yildizapp.domain;
import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "Kullanici")
public class UserService {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "isim")
    public String name;
    @Column(name = "soyisim")
    public String surname;
    @Column(name="kullanici_adi")
    public String username;
    @Column(name="sifre")
    public String password;
    @Column(name="telefon")
    public String phoneNumber;
    @Column(name="mail")
    public String email;
    @Column(name="bolum")
    public String department;
    @Column(name="isOnline")
    public boolean isOnline;
    @Column(name="biyografi")
    public String bio;
    @Column(name="userImagePath")
    public String userImagePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getUserImagePath() {
        return userImagePath;
    }

    public void setUserImagePath(String userImagePath) {
        this.userImagePath = userImagePath;
    }
}
