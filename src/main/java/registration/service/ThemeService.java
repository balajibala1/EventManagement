package registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import registration.common.UserNotFoundException;
import registration.model.Theme;
import registration.repositary.ThemeRepositary;

import java.util.List;

@Service
public class ThemeService {
    @Autowired
    private ThemeRepositary themeRepositary;

    public Theme saveTheme(Theme theme) {
        return themeRepositary.save(theme);
    }

    public List<Theme> viewTheme() {
        return (List<Theme>) themeRepositary.findAll();
    }

    public Theme viewById(Integer id) throws UserNotFoundException {
        Theme theme = themeRepositary.findById(id).orElseThrow(() ->
                new UserNotFoundException("Theme not exist with id :" + id));
        return theme;
    }

    public Theme deleteById(Integer id) throws UserNotFoundException {
        Theme theme = themeRepositary.findById(id).orElseThrow(() ->
                new UserNotFoundException("Theme not exist with id :" + id));
        themeRepositary.deleteById(id);
        return theme;
    }

    public Theme editById(Integer id, Theme theme) throws UserNotFoundException {
        Theme theme1 = themeRepositary.findById(id).orElseThrow(() ->
                new UserNotFoundException("Theme not exist with id :" + id));
        theme1.setTheme_name(theme.getTheme_name());
        theme1.setTheme_cost(theme.getTheme_cost());
        theme1.setTheme_imgUrl(theme.getTheme_imgUrl());
        return themeRepositary.save(theme1);
    }
}

