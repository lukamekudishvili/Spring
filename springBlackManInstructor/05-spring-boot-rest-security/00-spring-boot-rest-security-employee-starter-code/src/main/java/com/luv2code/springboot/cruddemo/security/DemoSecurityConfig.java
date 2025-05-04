package com.luv2code.springboot.cruddemo.security;

import com.luv2code.springboot.cruddemo.security.enums.Roles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails john = User.builder()
                .username("john")
                .password("{noop}john123")
                .roles(Roles.EMPLOYEE.name())
                .build();

        UserDetails marry = User.builder()
                .username("marry")
                .password("{noop}marry123")
                .roles(Roles.EMPLOYEE.name(), Roles.MANAGER.name())
                .build();

        UserDetails susan = User.builder()
                .username("susan")
                .password("{noop}susan123")
                .roles(Roles.EMPLOYEE.name(), Roles.MANAGER.name(), Roles.ADMIN.name())
                .build();

        return new InMemoryUserDetailsManager(john, marry, susan);
    }
}