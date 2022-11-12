package com.jamal.gyminformation;

import com.jamal.gyminformation.model.Inquiry;
import com.jamal.gyminformation.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService = new HomeService();

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/blog")
    public String blog(Model model){

        model.addAttribute("inquiry", new Inquiry());

        return "blog";
    }

    @PostMapping("/team")
    public String team(Model model, @ModelAttribute Inquiry inquiry){

        String trainerName = inquiry.getSearchString();
        model.addAttribute("trainers", homeService.searchTrainer(trainerName));
        return "team";
    }

    @GetMapping("/team")
    public String team(Model model){

        model.addAttribute("trainers", homeService.getTrainers());
        return "team";
    }

    @GetMapping("/class")
    public String classes(){
        return "class";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }
    @GetMapping("/testimonial")
    public String testimonial(){
        return "testimonial";
    }



}
