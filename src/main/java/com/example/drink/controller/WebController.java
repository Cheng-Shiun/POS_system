package com.example.drink.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class WebController
{
    @GetMapping("/")
    public String getLoading(){
        return "loading";
    }

    @GetMapping("/index")
    public String getHomePage()
    {
        return "index";
    }

    @GetMapping("/news/open")
    public String getOpen()
    {
        return"news_open";
    }

    @GetMapping("/news/activity")
    public String getActivity()
    {
        return"news_activity";
    }

    @GetMapping("/news/product")
    public String getProduct()
    {
        return"news_product";
    }


    @GetMapping("/aboutUs")
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
    @GetMapping("/member")
    public String getMember()
    {
        return"Member";
    }
    @GetMapping("/qa")
    public String getQA()
    {
        return"QA";
    }






















}
