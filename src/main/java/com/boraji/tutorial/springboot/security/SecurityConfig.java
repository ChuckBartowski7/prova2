package com.boraji.tutorial.springboot.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	  @Override
	    protected void configure(HttpSecurity http) throws Exception {
		  
		  http.authorizeRequests().antMatchers("/resources/**", "/js/**", "/images/**").permitAll();
		 
		  http.authorizeRequests()
              .antMatchers("/", "/home","/teams","/indexx","/evkids","/evnature","/evanim").permitAll()
              .anyRequest().authenticated()
              .and()
          .formLogin()
              .loginPage("/login")
              .permitAll()
              .and()
          .logout()
              .permitAll();
	               
	    }
	
	
}
