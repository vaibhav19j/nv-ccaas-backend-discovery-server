package com.jci.nv.cemm.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class LogginFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        log.info("Request is hitting to API gateway now "+exchange.getRequest().getPath().value());
        log.info("Toke is "+exchange.getRequest().getHeaders().get("Authorization"));
        return chain.filter(exchange);
    }
}
