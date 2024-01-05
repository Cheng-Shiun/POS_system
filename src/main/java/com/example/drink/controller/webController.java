package com.example.drink.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webController
{


        @GetMapping("/Homepage")
        public String getHomepage()
        {
            return "HomePage";
        }


        @GetMapping("/menu")
        public String getMenu()
        {
            return "Menu";

        }
        @GetMapping
        public String getAboutUs()
        {
            return"AboutUs";

        }
        @GetMapping
        public String getLatestNews()
        {
            return"LatestNews";

        }
        @GetMapping
        public String getContact()
        {
            return"ContactUs";
        }
        @GetMapping
        public String getCoordinates()
        {
            return"Coordinates";
        }
        @GetMapping
        public String getFrancise()
        {
            return"Franchise";
        }
        @GetMapping
        public String getMember()
        {
            return"Member";
        }
        @GetMapping
        public String getQnA()
        {
            return"QandA";
        }

        



}
