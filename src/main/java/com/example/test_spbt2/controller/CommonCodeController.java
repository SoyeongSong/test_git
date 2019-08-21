package com.example.test_spbt2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CommonCodeController {
    @RequestMapping(value = "/commonCode/{action}")
    public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action, ModelAndView modelandView) {
        String viewName = "/commonCode/";

        Map<String, Object> resultMap = new HashMap<String, Object>();

        if ("read".equals(action)) {
            viewName = viewName + action;
            resultMap = paramMap;
        }

        List<Object> resultList = new ArrayList<Object>();

        if ("list".equals(action)) {
            viewName = viewName + action;
            Map<String, Object> data01 = new HashMap<String, Object>();
            data01.put("NAME", "name 01");
            data01.put("COMMON_CODE_ID", "490293232849");
            data01.put("DESCRIPTION", "anything DESCRIPTION 01");
            data01.put("USERNO", "00000001");
            resultList.add(data01);
        }

        modelandView.setViewName(viewName);
        modelandView.addObject("resultMap", resultMap);
        modelandView.addObject("resultList", resultList);

        return modelandView;
    }
}