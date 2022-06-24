package co.develhope.firstapi4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.*;

@RestController
public class HeaderController {

    @Autowired
    private HttpServletRequest request;

    @GetMapping("/headers")
    public String[] getHeaders(){
        String name = "Server Name: " + request.getServerName();
        String port = "Server Port: " + request.getServerPort();
        String string = "Header String: " + request.getHeader("host");
        String host[] = new String[]{name,port,string};
        return host;
    }
}
