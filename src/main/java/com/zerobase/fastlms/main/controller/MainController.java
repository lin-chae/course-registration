package com.zerobase.fastlms.main.controller;


import com.zerobase.fastlms.components.MailComponents;
import com.zerobase.fastlms.course.repository.BannerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final MailComponents mailComponents;
    private final BannerRepository bannerRepository;
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("bannerList",bannerRepository.findAllByUsingYnIsTrue());
        /*
        String email = "oumuamua@naver.com";
        String subject = " 안녕하세요. 제로베이스 입니다. ";
        String text = "<p>안녕하세요.</p><p>반갑습니다.</p>";
        
        mailComponents.sendMail(email, subject, text);
        */
        
        return "index";
    }
    
    
    
    @RequestMapping("/error/denied")
    public String errorDenied() {
        
        return "error/denied";
    }
    
    
    
}
