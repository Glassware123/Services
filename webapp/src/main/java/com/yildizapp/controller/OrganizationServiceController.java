package com.yildizapp.controller;

import com.yildizapp.dao.CourseServiceDao;
import com.yildizapp.dao.OrganizationServiceDao;
import com.yildizapp.domain.CourseService;
import com.yildizapp.domain.OrganizationService;
import com.yildizapp.request.CourseServiceRequest;
import com.yildizapp.request.OrganizationServiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/organization")
public class OrganizationServiceController {
    @Autowired
    private OrganizationServiceDao organizationServiceDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    void addOrganization(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        OrganizationService organizationService = new OrganizationService();
        organizationService.setTitle(organizationServiceRequest.getTitle());
        organizationService.setContent(organizationServiceRequest.getContent());
        organizationService.setDate(organizationServiceRequest.getDate());
        organizationService.setTime(organizationServiceRequest.getTime());
        organizationService.setPlace(organizationServiceRequest.getPlace());
        organizationService.setType(organizationServiceRequest.getType());
   //     organizationService.setPicture(organizationServiceRequest.getPicture());
        organizationService.setOrganizator(organizationServiceRequest.getOrganizator());
        organizationServiceDao.addOrganization(organizationService);

    }
    @RequestMapping(value = "/findbyname", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
        List<OrganizationService> findOrganizationsByName(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        List<OrganizationService> organizations = organizationServiceDao.findOrganizationByOrganizationName(organizationServiceRequest.getTitle());
        return organizations;
    }
    @RequestMapping(value = "/findbyorganizator", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<OrganizationService> findOrganizationsByOrganizator(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        List<OrganizationService> organizations  = organizationServiceDao.findOrganizationByOrganizator(organizationServiceRequest.getOrganizator());
        return organizations;
    }
    @RequestMapping(value = "/getallorganizations", method = RequestMethod.GET)
    @ResponseBody
    List<OrganizationService> getAllOrganizations() {
        return organizationServiceDao.getAllOrganizations();
    }


    @RequestMapping(value = "/findorganizationbytype", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<OrganizationService> findOrganizationsByType(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        return organizationServiceDao.findOrganizationByType(organizationServiceRequest.getType());
    }
    @RequestMapping(value = "/deleteorganizationbyid", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    void deleteOeganizationById(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        organizationServiceDao.deleteOrganizationById(organizationServiceRequest.getOrganizationId());
    }
    @RequestMapping(value = "/updateorganizationbyid", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    void updateOrganzationById(@RequestBody OrganizationServiceRequest organizationServiceRequest) {
        OrganizationService organizationService = organizationServiceDao.findOrganizationById(organizationServiceRequest.getOrganizationId());
        organizationService.toString();
        organizationService.setTitle(organizationServiceRequest.getTitle());
        organizationService.setContent(organizationServiceRequest.getContent());
        organizationService.setDate(organizationServiceRequest.getDate());
        organizationService.setTime(organizationServiceRequest.getTime());
        organizationService.setType(organizationServiceRequest.getType());
        organizationService.setPlace(organizationServiceRequest.getPlace());
        organizationService.setOrganizator(organizationServiceRequest.getOrganizator());
        organizationServiceDao.updateOrganization(organizationService);
    }
}
