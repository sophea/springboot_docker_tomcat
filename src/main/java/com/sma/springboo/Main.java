package com.sma.springboo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Main extends SpringBootServletInitializer {

    @RequestMapping("/")
    public List<String> home() throws UnknownHostException {
        return Arrays.asList(
                "Update Springboot war deployment in Tomcat Docker container successfully",
                InetAddress.getLocalHost().toString());
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }
}
