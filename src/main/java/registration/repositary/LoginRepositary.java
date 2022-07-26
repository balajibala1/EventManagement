package registration.repositary;

import org.springframework.data.repository.CrudRepository;
import registration.model.Login;

public interface LoginRepositary extends CrudRepository<Login,Integer> {
    Login findAllByEmailId(String email);

    Login findAllByEmailIdAndPassword(String email, String pass);
}
