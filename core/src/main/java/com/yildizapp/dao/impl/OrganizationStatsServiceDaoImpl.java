package com.yildizapp.dao.impl;

import com.yildizapp.dao.OrganizationStatsServiceDao;
import com.yildizapp.domain.OrganizationStatsService;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class OrganizationStatsServiceDaoImpl extends BaseDaoImpl<OrganizationStatsService> implements OrganizationStatsServiceDao {

    @Override
    public void addUserData(OrganizationStatsService organizationStatsService) {
        getSessionFactory().getCurrentSession().save(organizationStatsService);
    }

    @Override
    public void updateUserData(OrganizationStatsService organizationStatsService) {
        OrganizationStatsService oldOrganizationStatsService= (OrganizationStatsService) sessionFactory.getCurrentSession().createCriteria(OrganizationStatsService.class).add(Restrictions.eq("userID",organizationStatsService.getUserID())).add(Restrictions.eq("organizationID",organizationStatsService.organizationID));
        oldOrganizationStatsService.setStatus(oldOrganizationStatsService.getStatus());
        saveOrUpdate(oldOrganizationStatsService);
    }

    @Override
    public List<Integer> getParticipantCount(Integer organizationID) {
        List<Integer> statusList = new ArrayList<>();
        statusList.add(sessionFactory.getCurrentSession().createCriteria(OrganizationStatsService.class).add(Restrictions.eq("organizationID",organizationID)).add(Restrictions.eq("status",1)).list().size());
        statusList.add(sessionFactory.getCurrentSession().createCriteria(OrganizationStatsService.class).add(Restrictions.eq("organizationID",organizationID)).add(Restrictions.eq("status",0)).list().size());
        statusList.add(sessionFactory.getCurrentSession().createCriteria(OrganizationStatsService.class).add(Restrictions.eq("organizationID",organizationID)).add(Restrictions.eq("status",-1)).list().size());
        return statusList;
    }
}
