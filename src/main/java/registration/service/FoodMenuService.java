package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.common.UserNotFoundException;
import registration.model.Addon;
import registration.model.Food;
import registration.repositary.FoodMenuRepositary;

import java.util.List;

@Service
public class FoodMenuService {
    @Autowired
    private FoodMenuRepositary foodMenuRepositary;
    public Food saveMenu(Food food) {
        return  foodMenuRepositary.save(food);

    }

    public List<Food> viewMenu() {
       return (List<Food>) foodMenuRepositary.findAll();
    }

    public Food viewById(Integer id) throws UserNotFoundException {
        Food food=foodMenuRepositary.findById(id).orElseThrow(()-> new UserNotFoundException("Menu does exists with the id:"+id));
        return food;
    }

    public void deleteMenu(Integer id) throws UserNotFoundException {
        Food food=foodMenuRepositary.findById(id).orElseThrow(()-> new UserNotFoundException("Menu does exists with the id:"+id));
        foodMenuRepositary.deleteById(id);
    }

    public Food editMenu(Integer id,Food food) throws UserNotFoundException {
        Food food1=foodMenuRepositary.findById(id).orElseThrow(()-> new UserNotFoundException("Menu does exists with the id:"+id));
        food1.setFood_name(food.getFood_name());
        food1.setFood_category(food.getFood_category());
        food1.setFood_img_url(food.getFood_img_url());
        food1.setFood_price(food.getFood_price());
        return foodMenuRepositary.save(food1);
    }
}
