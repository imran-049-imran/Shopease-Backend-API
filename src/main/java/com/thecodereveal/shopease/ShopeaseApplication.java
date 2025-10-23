package com.thecodereveal.shopease;

import com.stripe.Stripe;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class ShopeaseApplication {

    @Value("${stripe.secret}")
    private String stripeSecret;

    public static void main(String[] args) {
        SpringApplication.run(ShopeaseApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Stripe.apiKey = stripeSecret;
        System.out.println("✅ Stripe API key initialized.");
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOriginPatterns(Collections.singletonList("*")); // Allow all origins
        config.setAllowedHeaders(Arrays.asList(
                "Origin", "Content-Type", "Accept", "responseType", "Authorization",
                "x-authorization", "content-range", "range"
        ));
        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH"));
        config.setExposedHeaders(Arrays.asList(
                "X-Total-Count", "content-range", "Content-Type", "Accept",
                "X-Requested-With", "remember-me"
        ));
        config.setAllowCredentials(true); 

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
