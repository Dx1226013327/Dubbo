package edu.cque.controller;

import edu.cque.model.User;
import edu.cque.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user")
    public String userDeatil(Model model,Integer id){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "userDetail";
    }

}
