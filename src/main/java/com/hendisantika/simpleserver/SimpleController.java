package com.hendisantika.simpleserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/17/17
 * Time: 8:09 AM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@EnableAutoConfiguration
public class SimpleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hendi Santika - Simple Server! " + new Date();
    }
}
