package registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registration.common.UserNotFoundException;
import registration.model.Food;
import registration.service.FoodMenuService;

import java.util.List;

@RestController
@RequestMapping("/admin")

public class FoodMenuController {
    @Autowired
    private FoodMenuService foodMenuService;

    //saving the food menu
    @PostMapping("/savemenu")
    public Food saveMenu(@RequestBody Food food){
       return foodMenuService.saveMenu(food);
    }

    //viewing the saved food menu
    @GetMapping("/viewmenu")
    public List<Food> viewMenu(){
       return foodMenuService.viewMenu();
    }

    //viewing the saved food menu using their id
    @GetMapping("/viewmenu/{id}")
    public Food viewById(@PathVariable Integer id) throws UserNotFoundException {
        return foodMenuService.viewById(id);
    }

    //deleting the saved food menu using their id
    @DeleteMapping("/deletemenu/{id}")
    public String deleteMenu(@PathVariable Integer id) throws UserNotFoundException {
        foodMenuService.deleteMenu(id);
        return "Menu Deleted Successfully";
    }

    //editing the saved food menu using their id
    @PutMapping("/editmenu/{id}")
    public  Food editMenu(@PathVariable Integer id,@RequestBody Food food) throws UserNotFoundException {
       return foodMenuService.editMenu(id,food);
    }
}
