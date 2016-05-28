package com.yildizapp.dao.impl;

import com.yildizapp.dao.OrganizationServiceDao;
import com.yildizapp.domain.OrganizationService;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
@Transactional
public class OrganizationServiceDaoImpl extends BaseDaoImpl<OrganizationService> implements OrganizationServiceDao {
    @Override
    public void addOrganization(OrganizationService organizationService) {
        getSessionFactory().getCurrentSession().save(organizationService);
    }

    @Override
    public List<OrganizationService> getAllOrganizations() {
        List<OrganizationService> organizations = findAll();
        return organizations;
    }

    @Override
    public List<OrganizationService> findOrganizationByOrganizationName(String organizationName) {
        List<OrganizationService> organizations=getSessionFactory().getCurrentSession()
                .createCriteria(OrganizationService.class)
                .add(Restrictions.eq("title", organizationName))
                .list();
        return organizations;
    }

    @Override
    public List<OrganizationService> findOrganizationByOrganizator(String organizator) {
        List<OrganizationService> organizations=getSessionFactory().getCurrentSession()
                .createCriteria(OrganizationService.class)
                .add(Restrictions.eq("organizator", organizator))
                .list();
        return organizations;
    }

    @Override
    public List<OrganizationService> findOrganizationByType(String type) {
        List<OrganizationService> organizations=getSessionFactory().getCurrentSession()
                .createCriteria(OrganizationService.class)
                .add(Restrictions.eq("type", type))
                .list();
        return organizations;
    }

    @Override
    public OrganizationService findOrganizationById(Integer Id) {
        OrganizationService organizationService = (OrganizationService) getSessionFactory().getCurrentSession().createCriteria(OrganizationService.class).add(Restrictions.eq("id",Id)).uniqueResult();
        return organizationService;
    }

    @Override
    public void deleteOrganizationById(Integer id) {
        OrganizationService organizationService = findOrganizationById(id);
        getSessionFactory().getCurrentSession().delete(organizationService);
    }

    @Override
    public void updateOrganization(OrganizationService organizationService) {
        OrganizationService organization = (OrganizationService) sessionFactory.getCurrentSession().createCriteria(OrganizationService.class).add(Restrictions.eq("organizationId", organizationService.getOrganizationId())).uniqueResult();
        organization.setTitle(organizationService.getTitle());
        organization.setContent(organizationService.getContent());
        organization.setDate(organizationService.getDate());
        organization.setTime(organizationService.getTime());
        organization.setType(organizationService.getType());
        organization.setPlace(organizationService.getPlace());
        organization.setOrganizator(organizationService.getOrganizator());
        saveOrUpdate(organization);
    }
}
