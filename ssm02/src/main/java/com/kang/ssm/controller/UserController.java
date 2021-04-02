package com.kang.ssm.controller;

import com.kang.ssm.entity.User;
import com.kang.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/**
 * @author kanseer
 * @create 2021-03-01 18:07
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add")
    public String addUser(User user){
        try {
            userService.addUser(user);
            return "redirect:/user/findAll";
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:add.jsp";
        }
    }

    @RequestMapping("findAll")
    public String findAll(HttpServletRequest req,Model model){
            List<User> list = userService.findAll();
            //req.setAttribute("users",list);
            model.addAttribute("users",list);
            return "findAll";
    }
}
