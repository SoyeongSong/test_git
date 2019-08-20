package com.example.test_spbt2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// @Controller
// public class MemberController {
// @RequestMapping(value = "/member/list", method=RequestMethod.GET)
//     public String memberAction1(){
//         return "/member/list";
//     }

// @RequestMapping(value = "/member/edit", method=RequestMethod.GET)
//     public String memberAction2(){
//         return "/member/edit";
//     }

// @RequestMapping(value = "/member/delete", method=RequestMethod.GET)
//     public String memberAction3(){
//         return "/member/delete";
//     }

// @RequestMapping(value = "/member/view", method=RequestMethod.GET)
// public String memberAction4(){
//     return "/member/view";
// }
// }

@Controller
@RequestMapping(value = "/member")
public class MemberController{
    @RequestMapping(value={"/edit","/read","/list"}, method={RequestMethod.GET, RequestMethod.POST})
    public void actionMethod(){}
}





