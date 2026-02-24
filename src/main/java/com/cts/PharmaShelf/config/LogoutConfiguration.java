package com.cts.PharmaShelf.config;

import com.cts.PharmaShelf.auth.CustomLogoutHandler;
import com.cts.PharmaShelf.auth.CustomLogoutSuccessHandler;
import com.cts.PharmaShelf.repository.TokenRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;


@Configuration
public class LogoutConfiguration {

    @Bean
    public CustomLogoutHandler logoutHandler(TokenRepo tokenRepo, JwtService jwtService) {
        return new CustomLogoutHandler(tokenRepo, jwtService);
    }

    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new CustomLogoutSuccessHandler();
    }
}
