package com.yildizapp.dao;

import com.yildizapp.domain.OrganizationStatsService;
import java.util.List;

public interface OrganizationStatsServiceDao extends BaseDao<OrganizationStatsService> {

    void addUserData(OrganizationStatsService organizationStatsService);

    void updateUserData (OrganizationStatsService organizationStatsService);

    List<Integer> getParticipantCount(Integer organizationID);

}
