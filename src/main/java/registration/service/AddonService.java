package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.common.AddonNotFoundException;
import registration.model.Addon;
import registration.repositary.AddonRepositary;

import java.util.List;

@Service
public class AddonService {
    @Autowired
    private AddonRepositary addonRepositary;

    public Addon add(Addon addon) {
        return addonRepositary.save(addon);
    }

    public List<Addon> viewAddon(){
        return (List<Addon>) addonRepositary.findAll();
    }

    public Addon viewById(Integer id) throws AddonNotFoundException {
        Addon addon= addonRepositary.findById(id).orElseThrow(()-> new AddonNotFoundException("Addon Does not exist with the id:"+id));
        return addon;
    }

    public void deleteById(Integer id) throws AddonNotFoundException {
        Addon addon= addonRepositary.findById(id).orElseThrow(()-> new AddonNotFoundException("Addon Does not exist with the id:"+id));
        addonRepositary.deleteById(id);
    }

    public Addon editAddon(Integer id, Addon addon) throws AddonNotFoundException {
        Addon addon1 = addonRepositary.findById(id)
                .orElseThrow(() -> new AddonNotFoundException("Addon does not exist with id :" + id));
        addon1.setAddon_name(addon.getAddon_name());
        addon1.setAddon_price(addon.getAddon_price());
        addon1.setAddon_img_url(addon.getAddon_img_url());
        return addonRepositary.save(addon);
    }
}
