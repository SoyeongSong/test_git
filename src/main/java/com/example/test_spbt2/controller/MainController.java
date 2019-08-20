package com.example.test_spbt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
@RequestMapping(value = "/main", method=RequestMethod.GET)
public String main(){
return "main";
}

@RequestMapping(value = "/user/login", method=RequestMethod.GET)
public String memberAction5(){
    return "/user/login";
}

@RequestMapping(value = "/user/logout", method=RequestMethod.GET)
public String memberAction6(){
    return "/user/logout";
}

@RequestMapping(value = "/user/signup", method=RequestMethod.GET)
public String memberAction7(){
    return "/user/signup";
}

// @RequestMapping(value = "/member/list", method=RequestMethod.GET)
// public String memberAction1(){
//     return "/member/list";
// }


// @RequestMapping(value = "/member/edit", method=RequestMethod.GET)
// public String memberAction2(){
//     return "/member/edit";
// }

// @RequestMapping(value = "/member/delete", method=RequestMethod.GET)
// public String memberAction3(){
//     return "/member/delete";
// }

// @RequestMapping(value = "/member/view", method=RequestMethod.GET)
// public String memberAction4(){
// return "/member/view";
// }

}