package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.model.Login;
import registration.repositary.LoginRepositary;

@Service
public class LoginService {
    @Autowired
    private LoginRepositary loginRepositary;
    public Login register(Login login){
        return loginRepositary.save(login);

    }
    public Login fetchemail(String email){
        return loginRepositary.findAllByEmailId(email);
    }
    public Login fetchEmailAndPass(String email,String pass){
       return loginRepositary.findAllByEmailIdAndPassword(email,pass);
    }
}
