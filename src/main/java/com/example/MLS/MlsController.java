package com.example.MLS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MlsController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }
}
