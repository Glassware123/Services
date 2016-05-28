package com.yildizapp.controller;

import com.yildizapp.dao.CourseServiceDao;
import com.yildizapp.domain.CourseService;
import com.yildizapp.request.CourseServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value="/course")
public class CourseServiceController {
    @Autowired
    private CourseServiceDao courseServiceDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    void addCourse(@RequestBody CourseServiceRequest courseServiceRequest) {
        CourseService courseService = new CourseService();
        courseService.setCourseName(courseServiceRequest.getCourseName());
        courseService.setCourseCode(courseServiceRequest.getCourseCode());
        courseService.setDepartmentId(courseServiceRequest.getDepartmentId());
        courseService.setCourseCredit(courseServiceRequest.getCourseCredit());
        courseServiceDao.addCourse(courseService);
    }
    @RequestMapping(value = "/findbyname", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<CourseService> findCourseByName(@RequestBody CourseServiceRequest courseServiceRequest) {
        List<CourseService> course = courseServiceDao.findCourseByCourseName(courseServiceRequest.getCourseName());
        return course;
    }
    @RequestMapping(value = "/findbycode", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<CourseService> findCourseByCode(@RequestBody CourseServiceRequest courseServiceRequest) {
        List<CourseService> course = courseServiceDao.findCourseByCourseCode(courseServiceRequest.getCourseCode());
        return course;
    }
    @RequestMapping(value = "/getallcourses", method = RequestMethod.GET, consumes = "application/json")
    @ResponseBody
    List<CourseService> getAllCourses() {
        return courseServiceDao.getAllCourses();
    }
}
