package com.MarvellousInfosystems.first;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Laptop
{
    @GetMapping("LaptopDetails")
    public  String DisplayLaptopDetails()
    {
        return "Its Core i7 2ned gen laptop";
    }
}
