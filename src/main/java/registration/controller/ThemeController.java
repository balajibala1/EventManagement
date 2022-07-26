package registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registration.common.UserNotFoundException;
import registration.model.Theme;
import registration.service.ThemeService;
import java.util.List;


@RequestMapping("/admin")
@CrossOrigin(allowedHeaders = "*",origins = "*")
@RestController
public class ThemeController {
    @Autowired
    private ThemeService themeService;

    //saving the theme
    @PostMapping("/savetheme")
    public String saveTheme(@RequestBody Theme theme){
         themeService.saveTheme(theme);
        return "Saved Successfully";

    }

    //viewing the theme
    @GetMapping("/viewtheme")
    public List<Theme> viewTheme(){
       return themeService.viewTheme();
    }

    //viewing the theme using their id
    @GetMapping("/viewtheme/{id}")
    public Theme viewbyId(@PathVariable Integer id) throws UserNotFoundException {
        return themeService.viewById(id);
    }

    //deleting the theme using their id
    @DeleteMapping("/deletetheme/{id}")
    public String deleteById(@PathVariable Integer id) throws UserNotFoundException {
        themeService.deleteById(id);
        return "Deleted SucessFully";
    }

    //editing the theme using their id
    @PutMapping("/edittheme/{id}")
    public Theme editById(@PathVariable Integer id,@RequestBody Theme theme) throws UserNotFoundException {
        return themeService.editById(id,theme);
    }
}
