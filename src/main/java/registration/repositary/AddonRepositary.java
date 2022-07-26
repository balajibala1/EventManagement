package registration.repositary;

import org.springframework.data.repository.CrudRepository;
import registration.model.Addon;

public interface AddonRepositary extends CrudRepository<Addon,Integer> {
}
