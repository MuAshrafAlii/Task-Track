package com.muashrafalii.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello what are you doing today?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        return """
                <html>
                <head>
                <title> my title </title>
                </head>

                <body>
                <h1> my header </h1>
                </body>
                </html>
                """;
    }

    @RequestMapping("say-hello-jsp")
//    @ResponseBody
    public String sayHelloJsp() {
        return "sayHello";
    }
}
