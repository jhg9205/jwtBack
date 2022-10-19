package login.web;


import jwt.service.JwtService;
import login.service.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
@RequestMapping(value = "/login")
public class loginController {


    @Autowired
    private static JwtService jwtService;

    private static final Logger LOGGER = LoggerFactory.getLogger(loginController.class);

    @RequestMapping(value = "/jwt", method = RequestMethod.POST)
    @ResponseBody
    public String createJWT(ModelMap modelMap, @RequestBody Object vo) throws Exception {
        System.out.println(vo);
        return "";
    }

}