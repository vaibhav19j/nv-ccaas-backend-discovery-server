package com.jci.nv.cemm.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {

    @Bean
    public RouteLocator getLocator(RouteLocatorBuilder builder){
        return builder.routes().route(p->
            p.path("/push-notifications/**").uri("lb://cemm-push-notifications")
        ).build();

    }
}
