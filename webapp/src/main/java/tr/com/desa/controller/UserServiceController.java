package tr.com.desa.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import tr.com.desa.dao.UserServiceDao;
import tr.com.desa.domain.UserService;
import tr.com.desa.request.UserServiceRequest;
import java.util.List;
@Controller
@RequestMapping(value= "/user")
public class UserServiceController {
    @Autowired
    private UserServiceDao userServiceDao;
    @RequestMapping(value = "/register",method = RequestMethod.POST,consumes = "application/json")
    @ResponseBody
    public void saveUser(@RequestBody UserServiceRequest userServiceRequest){
        UserService userService=new UserService();
        userService.setUsername(userServiceRequest.getUserName());
        userService.setPassword(userServiceRequest.getPassWord());
        userService.setEmail(userServiceRequest.geteMail());
        userServiceDao.save(userService);
    }
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public List<UserService> users(){
       return  userServiceDao.users();
    }
}