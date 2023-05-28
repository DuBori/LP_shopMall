/*
package com.LeePark.shop.config;

import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration // IoC 빈(bean)을 등록
@EnableWebSecurity //Spring MVC 통합을 제공 필터 체인 관리 시작 어노테이션
@RequiredArgsConstructor
public class WebSecurityConfig {
	//Spring Security의 웹 보안 지원을 활성화
	private final PrincipalOauth2UserService principalOauth2UserService;
	private final static Logger LOG = LogManager.getLogger(WebSecurityConfig.class);

	*/
/**
	 * 내부 로그인 및 Oauth2 로그인
	 * @param http
	 * @return
	 * @throws Exception
	 *//*

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf().disable() // ? csrf????
			.authorizeHttpRequests()
			.requestMatchers("/band/**").authenticated()
			.anyRequest().permitAll() // 그 이외에 꺼는 누구나 접속 가능
			.and()
				.formLogin()
					.loginPage("/loginForm")
					.failureUrl("/loginForm?error")
					.loginProcessingUrl("/login_proc")
					.usernameParameter("id")		// 로그인 시 form에서 가져올 값(id, email 등이 해당)
					.passwordParameter("password")
					.successHandler(getSuccessHandler())
					.failureHandler(getFailureHandler())
				.and()
				.logout()
				.logoutUrl("/logout")			// 로그아웃을 처리할 URL 입력
				.logoutSuccessUrl("/")

				.and()
				.oauth2Login()
					.loginPage("/loginForm")
					.defaultSuccessUrl("/band/main")
					.failureUrl("/loginForm?error")
					.userInfoEndpoint() // 로그인 성공 후 사용자 정보를 가져온다
					.userService(principalOauth2UserService);


		return http.build();
	}

	private static AuthenticationFailureHandler getFailureHandler() {
		return (request, response, exception) -> {
			LOG.info("에러발생 : " + exception.getMessage());
			response.sendRedirect("/loginForm");
		};
	}

	private static AuthenticationSuccessHandler getSuccessHandler() {
		return (request, response, authentication) -> {
			SecurityContextHolder.getContext().setAuthentication(authentication);
			response.sendRedirect("/band/main");
		};
	}

}*/
