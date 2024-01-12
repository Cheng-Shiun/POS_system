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
        return"Franchise";
    }
    @GetMapping("/member")
    public String getMember()
    {
        return"Member";
    }
    @GetMapping("/qna")
    public String getQnA()
    {
        return"QandA";
    }

    @GetMapping("/news/open")
    public String getOpen()
    {
        return"news_open";
    }




















}
