package com.slowcity.eureka.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
@RequestMapping("admin/comments")
public class Controller  {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    
    @GetMapping(value = "")
    public String index( ) {
    	logger.info("test=========0000");
        return "admin/comment_list";
    }

    
}
 