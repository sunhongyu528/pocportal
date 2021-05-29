package com.changhongit.controller;

import com.changhongit.service.UserService;
import com.changhongit.vo.DataVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Map;

//@RestController
@Controller
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping("/list")
    @ResponseBody
    public DataVo list(Integer page,Integer limit){
        return userService.findData(page,limit);
    }

    @RequestMapping("/{url}")
    public String redirect(@PathVariable("url") String url){
        return url;
    }

    @RequestMapping("/login")
    public String login1(){
        return "login";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @PostMapping("/login")
    //@RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map,
                        HttpSession session){
        if (!StringUtils.isEmpty(username)&&"Avaya123".equals(password)){
            //return "dashboard";

            session.setAttribute("loginUser",username);
            return "redirect:/admin.html";
        }else {
            map.put("msg","用户名或密码错误！！！");
            return "index";
        }


    }

}
