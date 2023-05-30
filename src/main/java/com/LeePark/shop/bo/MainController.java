package com.LeePark.shop.bo;

import com.LeePark.shop.bo.dao.TestDao;
import com.LeePark.shop.domain.model.entity.Member;
import com.LeePark.shop.domain.model.request.RequestLoginMember;
import com.LeePark.shop.domain.model.request.RequsetSearchModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.http.HttpResponse;

@Slf4j
@Controller
@RequestMapping("/")
@RequiredArgsConstructor
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
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public ResponseEntity<?> SearchModel(@ModelAttribute RequsetSearchModel search){
        Member member = search.toEntity();
        return new ResponseEntity<>(member, HttpStatus.OK);
    }
}
