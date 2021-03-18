package com.cache.controller;

import com.cache.Cache;
import com.cache.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    Cache cache = new Cache();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String getUserData(@RequestParam int id) throws InterruptedException {
        if (cache.has(id)) {
            return cache.get(id);
        } else {
            cache.set(id);
        }
        return cache.get(id);
    }

    @GetMapping("/delete")
    @ResponseBody
    public String deleteUserData(@RequestParam int id) {
        cache.delete(id);

        return "Your data has been deleted.";
    }
}