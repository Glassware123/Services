package tr.com.desa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoService;
import tr.com.desa.request.AutoServiceRequest;

import java.util.List;

@Controller
@RequestMapping(value="/auto")
public class AutoServiceController {
    @Autowired
    private AutoServiceDao autoServiceDao;

    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    void addAuto(@RequestBody AutoServiceRequest autoServiceRequest) {
        AutoService autoService = new AutoService();
        autoService.setPlate(autoServiceRequest.getPlate());
        autoService.setDeparturePoint(autoServiceRequest.getDeparturePoint());
        autoService.setDestinationPoint(autoServiceRequest.getDestinationPoint());
        autoService.setCarry(autoServiceRequest.getCarry());
        autoServiceDao.addAuto(autoService);
    }
    @RequestMapping(value = "/find", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<AutoService> findAuto(@RequestBody AutoServiceRequest autoServiceRequest) {
        List<AutoService> auto = autoServiceDao.findAutoByPlate(autoServiceRequest.getPlate());
        return auto;
    }
}
