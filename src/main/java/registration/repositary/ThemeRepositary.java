package registration.repositary;

import org.springframework.data.repository.CrudRepository;
import registration.model.Theme;

public interface ThemeRepositary extends CrudRepository<Theme,Integer> {
}
