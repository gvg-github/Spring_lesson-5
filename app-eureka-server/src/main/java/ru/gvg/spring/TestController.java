package ru.gvg.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Valeriy Gyrievskikh
 * @since 15.08.2018.
 */
//@RefreshScope
//@RestController
public class TestController {

    @Value("${developer.email}")
    private String email;

    @RequestMapping(value="/test")
    public String test(){
        return email;
    }
}
