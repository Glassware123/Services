package tr.com.desa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.com.desa.dao.AutoServiceDao;
import tr.com.desa.domain.AutoService;
import tr.com.desa.request.AutoSeviceRequest;

@Controller
@RequestMapping(value="/auto")
public class AutoServiceController {
@Autowired
    private AutoServiceDao autoServiceDao;
    @RequestMapping(value = "/add",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    void addAuto(@RequestBody AutoSeviceRequest autoSeviceRequest){
        AutoService autoService = new AutoService();
        autoService.setPlate(autoSeviceRequest.getPlate());
        autoService.setDeparturePoint(autoSeviceRequest.getDeparturePoint());
        autoService.setDestinationPoint(autoSeviceRequest.getDestinationPoint());
        autoService.setCarry(autoSeviceRequest.getCarry());
        autoServiceDao.addAuto(autoService);
    }
}
