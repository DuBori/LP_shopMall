package com.LeePark.shop.bo;

import com.LeePark.shop.bo.dao.TestDao;
import com.LeePark.shop.domain.model.request.RequestLoginMember;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping("/")
@NoArgsConstructor
public class MainController {


    private TestDao dao;

    public String mainPage(){
        log.info("하이");
        return "index";
    }

    @RequestMapping(value = "/logn",method = RequestMethod.GET)
    public String abc(@ModelAttribute RequestLoginMember member){
        boolean myMember = dao.isMyMember();
        if (myMember){
            return "mainPage";
        }
        return "loginPage";
    }
}
