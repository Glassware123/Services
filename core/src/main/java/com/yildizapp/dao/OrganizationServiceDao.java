package com.yildizapp.dao;

import com.yildizapp.domain.CourseService;
import com.yildizapp.domain.OrganizationService;

import java.util.List;


public interface OrganizationServiceDao extends BaseDao<OrganizationService> {
    void addOrganization(OrganizationService organizationService);
    List<OrganizationService> getAllOrganizations();
    List<OrganizationService> findOrganizationByOrganizationName(String organizationName);
    List<OrganizationService> findOrganizationByOrganizator(String organizator);
    List<OrganizationService> findOrganizationByType(String type);
    OrganizationService findOrganizationById(Integer Id);
    void deleteOrganizationById(Integer id);
    void updateOrganization(OrganizationService organizationService);
}
