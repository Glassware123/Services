package com.yildizapp.domain;
import javax.persistence.*;

@Entity
@Table(name="Ders")
public class CourseService {
    @Id
    @Column(name = "DersID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer courseId;

    @Column(name = "BolumID")
    public Integer departmentId;

    @Column(name = "DersAdi")
    public String courseName;

    @Column(name = "DersKodu")
    public String courseCode;

    @Column(name = "DersKredi")
    public Integer courseCredit;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Integer courseCredit) {
        this.courseCredit = courseCredit;
    }
}
