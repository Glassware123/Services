package com.yildizapp.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import com.yildizapp.dao.CourseServiceDao;
import com.yildizapp.domain.CourseService;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CourseServiceDaoImpl extends BaseDaoImpl<CourseService> implements CourseServiceDao {

    @Override
    public void addCourse(CourseService courseService) {
        getSessionFactory().getCurrentSession().save(courseService);
    }

    @Override
    public List<CourseService> getAllCourses() {
        List<CourseService> courses = findAll();
        return courses;
    }

    @Override
    public List<CourseService> findCourseByCourseName(String courseName) {
        List<CourseService> course=getSessionFactory().getCurrentSession()
                .createCriteria(CourseService.class)
                .add(Restrictions.eq("courseName", courseName))
                .list();
        return course;
    }

    @Override
    public List<CourseService> findCourseByCourseCode(String courseCode) {
        List<CourseService> course=getSessionFactory().getCurrentSession()
                .createCriteria(CourseService.class)
                .add(Restrictions.eq("courseCode", courseCode))
                .list();
        return course;
    }
}