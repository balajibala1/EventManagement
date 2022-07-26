package registration.model;

import javax.persistence.*;

@Entity
public class Addon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer addon_id;
    private String addon_name;
    private Integer addon_price;
    private String addon_img_url;

    public Addon() {
    }

    public Addon(Integer addon_id, String addon_name, Integer addon_price, String addon_img_url) {
        this.addon_id = addon_id;
        this.addon_name = addon_name;
        this.addon_price = addon_price;
        this.addon_img_url = addon_img_url;
    }

    public Integer getAddon_id() {
        return addon_id;
    }

    public void setAddon_id(Integer addon_id) {
        this.addon_id = addon_id;
    }

    public String getAddon_name() {
        return addon_name;
    }

    public void setAddon_name(String addon_name) {
        this.addon_name = addon_name;
    }

    public Integer getAddon_price() {
        return addon_price;
    }

    public void setAddon_price(Integer addon_price) {
        this.addon_price = addon_price;
    }

    public String getAddon_img_url() {
        return addon_img_url;
    }

    public void setAddon_img_url(String addon_img_url) {
        this.addon_img_url = addon_img_url;
    }
}
