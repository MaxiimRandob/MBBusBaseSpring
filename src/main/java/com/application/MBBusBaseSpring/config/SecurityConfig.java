package com.application.MBBusBaseSpring.config;

import com.application.MBBusBaseSpring.security.AuthenticationSuccessHandlerImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger LOG = LogManager.getLogger(SecurityConfig.class);

    @Resource
    UserDetailsService userDetailsService;


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        LOG.info("BCrypt encoder is set");
        return new BCryptPasswordEncoder();
    }


    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        LOG.info("inside dao auth provider");
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(bCryptPasswordEncoder());
        LOG.info("provider has been initialized");
        return authProvider;
    }


    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler(){
        return new AuthenticationSuccessHandlerImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        LOG.info("auth provider configuration");
        auth.authenticationProvider(authenticationProvider());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/css/**", "/js/**", "/images/**", "/fonts/**", "/registration").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/driver/**").hasRole("DRIVER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .failureUrl("/login?error")
                .successHandler(myAuthenticationSuccessHandler())
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .permitAll()
                .and().csrf().disable();
    }
}
