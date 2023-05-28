/*
package com.LeePark.shop.config;

import com.Idu.band.domain.model.Member;
import com.Idu.band.fo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {

    @Autowired
    private MemberService memberService;
    @Autowired
    private BCryptPasswordEncoder encoder;

    */
/**
     * DB에 없는 사용자면 회원가입 처리
     * @param userRequest
     * @return
     * @throws OAuth2AuthenticationException
     *//*

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2User oAuth2User = super.loadUser(userRequest);

        String provider = userRequest.getClientRegistration().getRegistrationId();
        String providerId = oAuth2User.getAttribute("sub");
        String userName = provider+"_"+providerId;
        String uuid = UUID.randomUUID().toString().substring(0,6);
        String password = encoder.encode(uuid);
        String email = oAuth2User.getAttribute("email");

        boolean isEmpty = memberService.getLoginId(userName) == null ? true : false;

        return registerOauth2(isEmpty,provider,providerId,userName,uuid,password,email);
    }

    private Member registerOauth2(boolean isEmpty, String provider, String providerId, String userName, String uuid, String password, String email) {

        if(isEmpty){
            Member member = Member.builder()
                    .id(userName)
                    .name(uuid)
                    .password(password)
                    .providerID(providerId)
                    .provider(provider).build();

            memberService.registerMember(member);

        }

        return memberService.getLoginId(userName);
    }
}
*/
