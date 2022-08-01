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
    @RequestMapping("/userDetail")
    public String userDeatil(Model model,Integer id){
        User user = userService.queryUserById(id);
        Integer allUserCount = userService.queryAllUserCount();
        model.addAttribute("allUserCount",allUserCount);
        model.addAttribute("user",user);
        return "userDetail";
    }

}
