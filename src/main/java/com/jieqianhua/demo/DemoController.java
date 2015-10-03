/**
 * Copyright (c) 2014 http://www.jieqianhua.com
 */
package com.jieqianhua.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Demo - com.jieqianhua.demo
 *
 * @author zhouqiang
 * @date 15/10/3 PM8:59
 * @since JDK1.6
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public void test(HttpServletResponse response) throws IOException {
        response.setStatus(200);
        response.getWriter().println("Test");
    }
}
