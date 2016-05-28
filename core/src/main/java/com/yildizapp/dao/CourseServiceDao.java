package com.yildizapp.dao;

import com.yildizapp.domain.CourseService;

import java.util.List;

public interface CourseServiceDao extends BaseDao<CourseService> {
    void addCourse(CourseService courseService);
    List<CourseService> getAllCourses();
    List<CourseService> findCourseByCourseName(String courseName);
    List<CourseService> findCourseByCourseCode(String courseCode);

}
