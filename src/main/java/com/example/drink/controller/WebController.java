package com.example.drink.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebController
{

    @GetMapping("/")
    public String getLoading()
    {
        return "loading";
    }

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
    @GetMapping("/aboutus")
    public String getAboutUs()
    {
        return"AboutUs";

    }
    @GetMapping("/latestnews")
    public String getLatestNews()
    {
        return"LatestNews";

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
