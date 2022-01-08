package com.gehouseexc.memberui.service;

import com.gehouseexc.memberui.vo.TitleInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MemberService {

    @Autowired
    private RestTemplate restTemplate;

    public TitleInfo getTitleInfo() {
        return restTemplate.getForObject("http://members-api:8081/members/title-info", TitleInfo.class);
    }
    
}
