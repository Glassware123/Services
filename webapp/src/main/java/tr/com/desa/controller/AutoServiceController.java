package tr.com.desa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoMobile;
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
        System.out.print("dasdadsa");
        AutoMobile autoMobile = new AutoMobile();
        autoMobile.setPlate(autoServiceRequest.getPlate());
        autoMobile.setDeparturePoint(autoServiceRequest.getDeparturePoint());
        autoMobile.setDestinationPoint(autoServiceRequest.getDestinationPoint());
        autoMobile.setCarry(autoServiceRequest.getCarry());
        autoServiceDao.addAuto(autoMobile);
    }
    @RequestMapping(value = "/find", method = RequestMethod.POST, consumes = "application/json")
    @ResponseBody
    List<AutoMobile> findAuto(@RequestBody AutoServiceRequest autoServiceRequest) {
        List<AutoMobile> auto = autoServiceDao.findAutoByPlate(autoServiceRequest.getPlate());
        return auto;
    }
}
