package registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import registration.model.Login;
import registration.service.LoginService;

@RestController
@CrossOrigin(allowedHeaders = "*",origins = "*")
public class LoginController {
    @Autowired
    private LoginService loginService;
    @PostMapping("/register")
    public Login register(@RequestBody Login login) throws Exception {
        String tempemail=login.getEmailId();
        Login userObj;
        if(tempemail!=null || !"".equals(tempemail)){
            userObj=loginService.fetchemail(tempemail);
            if (userObj!=null){
                throw new Exception("Already found");
            }
        }
        userObj=loginService.register(login);
        return userObj;
    }
    @PostMapping("/login")
    public Login login(@RequestBody Login login) throws Exception {
        String tempemail=login.getEmailId();
        String temppass=login.getPassword();
        Login userObj = null;
        if(tempemail!=null && temppass!=null){
            userObj=loginService.fetchEmailAndPass(tempemail,temppass);
            if(userObj==null){
                throw new Exception("User not Exists");
            }
        }
        return userObj;
    }
}
