package com.yildizapp.controller;

import com.yildizapp.dao.OrganizationStatsServiceDao;
import com.yildizapp.domain.OrganizationStatsService;
import com.yildizapp.request.OrganizationStatsServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/organizationStats")
public class OrganizationStatsServiceController {
    @Autowired
    private OrganizationStatsServiceDao organizationStatsServiceDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    void addStatusValue(@RequestBody OrganizationStatsServiceRequest organizationStatsServiceRequest){
        OrganizationStatsService organizationStatsService = new OrganizationStatsService();
        organizationStatsService.setUserID(organizationStatsServiceRequest.getUserID());
        organizationStatsService.setOrganizationID(organizationStatsServiceRequest.getOrganizationID());
        organizationStatsService.setStatus(organizationStatsServiceRequest.getStatus());
        organizationStatsServiceDao.addUserData(organizationStatsService);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    void updateStatusValue(@RequestBody OrganizationStatsServiceRequest organizationStatsServiceRequest){
        OrganizationStatsService organizationStatsService = new OrganizationStatsService();
        organizationStatsService.setUserID(organizationStatsServiceRequest.getUserID());
        organizationStatsService.setOrganizationID(organizationStatsServiceRequest.getOrganizationID());
        organizationStatsService.setStatus(organizationStatsServiceRequest.getStatus());
        organizationStatsServiceDao.updateUserData(organizationStatsService);
    }

    @RequestMapping(value = "/getOrganizationStats", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    public List<Integer> getOrganizationStats(@RequestBody OrganizationStatsServiceRequest organizationStatsServiceRequest){
        return organizationStatsServiceDao.getParticipantCount(organizationStatsServiceRequest.getOrganizationID());
    }

}
