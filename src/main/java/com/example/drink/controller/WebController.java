package com.example.drink.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebController
{

    @GetMapping("/index")
    public String getHomePage()
    {
        return "index";
    }
    @GetMapping("/t")
    public String getTest()
    {
        return "test";
    }
    @GetMapping("/menu")
    public String getMenu()
    {
        return "Menu";

    }
    @GetMapping("/login")
    public String getAboutUs()
    {
        return"login";

    }
    @GetMapping("/contactus")
    public String getContactUs()
    {
        return"ContactUs";
    }
    @GetMapping("/coordinates")
    public String getCoordinates()
    {
        return"Coordinates";
    }
    @GetMapping("/franchise")
    public String getFranchise()
    {
        return"franchise";
    }
    @GetMapping("/member")
    public String getMember()
    {
        return"Member";
    }
    @GetMapping("/qa")
    public String getQnA()
    {
        return"QA";
    }

}
