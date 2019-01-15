package nchu.software.soccer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrimaryTurnController {
    @RequestMapping("/")
    public String host(){
        return "index.html";
    }
}
