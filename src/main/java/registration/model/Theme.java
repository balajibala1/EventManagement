package registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer theme_id;
    private String theme_name;
    private Integer theme_cost;
    private String theme_imgUrl;

    public Integer getTheme_id() {
        return theme_id;
    }

    public void setTheme_id(Integer theme_id) {
        this.theme_id = theme_id;
    }

    public String getTheme_name() {
        return theme_name;
    }

    public void setTheme_name(String theme_name) {
        this.theme_name = theme_name;
    }

    public String getTheme_imgUrl() {
        return theme_imgUrl;
    }

    public void setTheme_imgUrl(String theme_imgUrl) {
        this.theme_imgUrl = theme_imgUrl;
    }

    public Integer getTheme_cost() {
        return theme_cost;
    }

    public void setTheme_cost(Integer theme_cost) {
        this.theme_cost = theme_cost;
    }

    public Theme() {
    }

    public Theme(Integer theme_id, String theme_name, String theme_imgUrl, Integer theme_cost) {
        this.theme_id = theme_id;
        this.theme_name = theme_name;
        this.theme_imgUrl = theme_imgUrl;
        this.theme_cost = theme_cost;
    }
}
