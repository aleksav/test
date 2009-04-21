package com.aleksav.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author aleksav
 */
@Controller
public class IndexController {

    @RequestMapping("/index.do")
    public void indexHandler(HttpServletResponse response) throws Exception{
        PrintWriter writer = response.getWriter();
        writer.write("Aleksa test");
        writer.flush();;
    }
}
