package ru.netology.springbootapp.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springbootapp.profile.SystemProfile;

@Setter
@Getter
@RestController
@RequestMapping("/")
public class ProfileController {

    private SystemProfile profile;

    public ProfileController(SystemProfile profile) {
        this.profile = profile;
    }

    @RequestMapping("profile")
    public String getProfile(){
        return profile.getProfile();
    }



}
