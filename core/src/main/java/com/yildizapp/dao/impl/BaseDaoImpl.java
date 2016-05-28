package com.yildizapp.dao.impl;

import com.yildizapp.domain.UserService;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.yildizapp.dao.BaseDao;

import javax.transaction.Transactional;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
@Transactional
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<T> type;

    protected BaseDaoImpl() {
        this.type =  (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(type).list();

    }

    @Override
    public void saveOrUpdate(T t) {
        sessionFactory.getCurrentSession().saveOrUpdate(t);
    }

    @Override
    public List<UserService> findUserByEmail(String email){
        return sessionFactory.getCurrentSession().createCriteria(UserService.class).add(Restrictions.eq("email",email)).list();
    }
    @Override
    public List<UserService> findUserByUsername(String username){
        return sessionFactory.getCurrentSession().createCriteria(UserService.class).add(Restrictions.eq("username",username)).list();
    }
    @Override
    public  void delete(T t){
        sessionFactory.getCurrentSession().delete(t);
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
