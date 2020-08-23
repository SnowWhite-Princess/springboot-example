package com.smart.navi.controller;

import com.smart.navi.domain.entity.Navi;
import com.smart.navi.service.NaviService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/navi")
public class NaviController {
    @Resource
    NaviService naviService;

    @GetMapping("/list")
    public List<Navi> getNavi(){
        return naviService.selectAll();
    }

}
