package com.gamesShop.controller;

import com.gamesShop.dao.UserDao;
import com.gamesShop.model.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @Autowired
    UserDao userDao;

   

    @RequestMapping("/Page")
    public String login(HttpServletRequest request, ModelMap model,HttpSession session) {
        List<User> user = userDao.find();
        String mail = null;
        String pass = null;
        int userNumb = 2;
        int adminNumb = 1;
        for (User u : user) {
             pass = u.getPassword();
             mail = u.getEmail();
            if (request.getParameter("mail").equals(u.getEmail())
                    && request.getParameter("password").equals(u.getPassword())
                    && userNumb == u.getAccountAccess()) {
                model.addAttribute("mail", u.getName());
                session.setAttribute("name", u.getName());
                return "WelcomePage";
            }
            if (request.getParameter("mail").equals(u.getEmail())
                    && request.getParameter("password").equals(u.getPassword())
                    && adminNumb == u.getAccountAccess()) {
                 session.setAttribute("name", u.getName());
                model.addAttribute("mail", u.getName());
                return "AdminPage";
            }
        }
        if (!request.getParameter("mail").equals(mail) || !request.getParameter("password").equals(pass)) {
            model.addAttribute("error", "Invalid password or email address");
            return "Register-LoginPage";
        }
        return "Register-LoginPage";
    }

    @RequestMapping("/index")
    public String register(ModelMap model, HttpServletRequest request) {
        List<User> user = userDao.find();
        String mail = null;
        for (User u : user) {
            mail = u.getEmail();
        }
        if (request.getParameter("email").equals(mail)) {
            model.addAttribute("regError", "Email address in use!");
            return "Register-LoginPage";
        } else {
            userDao.insertUser(request.getParameter("name"), request.getParameter("lastname"), request.getParameter("country"),
                    request.getParameter("email"), request.getParameter("password"), 2);
            model.addAttribute("success", "Thank your for registration!");
            return "index";
        }
    }

    @RequestMapping("/Home") 
        public String Home()
        {
            return "WelcomePage";
        }
    @RequestMapping("/#")
    
        public String Home2()
        {
            return "index";
        }
    @RequestMapping("/")
    public String index(ModelMap model) {

        return "index";
    }
    @RequestMapping("/About")
    public String about()
    {
        return "about";
    }
    @RequestMapping("/About1")
    public  String about1()
    {
        return "aboutLoged";
    }
    
}
