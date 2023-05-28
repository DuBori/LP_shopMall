/*
package com.LeePark.shop.config;

import com.Idu.band.domain.model.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationProvider  implements AuthenticationProvider{
	

	private final UserDetailsService userDetailsService;

	private final BCryptPasswordEncoder encoder;

	*/
/*
	*
	*//*

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String username=(String) authentication.getPrincipal();
		String password= (String) authentication.getCredentials();

		Member member = (Member)userDetailsService.loadUserByUsername(username);

		// 인증 로직
		if (member==null) {
			throw new BadCredentialsException("해당 회원은 존재하지 않습니다.");
		}

		passAndStateMatch(password, member);
		return new UsernamePasswordAuthenticationToken(username,member.getPassword(),member.getAuthorities());
	}

	*/
/*
	*  비밀번호 일치 및 계정 활성화 유무
	*//*

	private void passAndStateMatch(String password, Member member) {
		if(!encoder.matches(password, member.getPassword())) {
			throw new BadCredentialsException("비밀번호 안맞음!!!!!");
		}

		if(!member.isEnabled()) {
			throw new BadCredentialsException("계정활성화 안되있음!!!!!");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

}*/
