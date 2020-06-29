package com.chucknoris.springframework.chucknorisjokeapp.controller;

import com.chucknoris.springframework.chucknorisjokeapp.services.JokeInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    JokeInterface jokeInterface;
    public JokeController(JokeInterface jokeInterface) {
        this.jokeInterface = jokeInterface;
    }

    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke",jokeInterface.getRandomJoke());
        return "joke";
    }

}
