package registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import registration.common.AddonNotFoundException;
import registration.model.Addon;
import registration.service.AddonService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AddonController {
    @Autowired
    private AddonService addonService;

    //saving the addon
    @PostMapping("/addaddon")
    public Addon saveAddon(@RequestBody Addon addon){
        return addonService.add(addon);
    }

    //viewing the addon
    @GetMapping("/viewaddon")
    public List<Addon> viewAddon(){
       return addonService.viewAddon();
    }

    //viewing the addon by using their id
    @GetMapping("/viewaddonbyid/{id}")
    public Addon viewById(@PathVariable Integer id) throws AddonNotFoundException {
        return addonService.viewById(id);
    }

    //deleting the addon by using their id
    @DeleteMapping("/deleteaddon/{id}")
    public String deleteaddon(@PathVariable Integer id) throws AddonNotFoundException {
        addonService.deleteById(id);
        return "Deleted Successfully";
    }

    //editing the addon by using their id
    @PutMapping("/editaddon/{id}")
    public Addon editAddon(@PathVariable Integer id,@RequestBody Addon addon) throws AddonNotFoundException {
        return addonService.editAddon(id,addon);
    }
}
