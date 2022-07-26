package registration.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer food_id;
    private String food_name;
    private String food_category;
    private String food_img_url;
    private Integer food_price;

    public Food() {
    }

    public Food(Integer food_id, String food_name, String food_category, String food_img_url, Integer food_price) {
        this.food_id = food_id;
        this.food_name = food_name;
        this.food_category = food_category;
        this.food_img_url = food_img_url;
        this.food_price = food_price;
    }

    public Integer getFood_id() {
        return food_id;
    }

    public void setFood_id(Integer food_id) {
        this.food_id = food_id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_category() {
        return food_category;
    }

    public void setFood_category(String food_category) {
        this.food_category = food_category;
    }

    public String getFood_img_url() {
        return food_img_url;
    }

    public void setFood_img_url(String food_img_url) {
        this.food_img_url = food_img_url;
    }

    public Integer getFood_price() {
        return food_price;
    }

    public void setFood_price(Integer food_price) {
        this.food_price = food_price;
    }
}
