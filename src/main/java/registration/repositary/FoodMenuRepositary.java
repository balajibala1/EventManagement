package registration.repositary;

import org.springframework.data.repository.CrudRepository;
import registration.model.Food;

public interface FoodMenuRepositary extends CrudRepository<Food,Integer> {
}
