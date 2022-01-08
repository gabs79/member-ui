package com.gehouseexc.memberui.controller;

import com.gehouseexc.memberui.service.MemberService;
import com.gehouseexc.memberui.vo.TitleInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class WebMainController {

    @Autowired
    private final MemberService memberService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/title-info")
    public TitleInfo getTitleInfo() {
        return memberService.getTitleInfo();
    }
}

