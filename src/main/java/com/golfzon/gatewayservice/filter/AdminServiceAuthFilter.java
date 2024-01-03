package com.golfzon.gatewayservice.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class AdminServiceAuthFilter extends AbstractGatewayFilterFactory<AdminServiceAuthFilter.Config> {
    public AdminServiceAuthFilter() {
        super(Config.class);
    }

    public static class Config {
        // 필터 설정 관련 필드 (필요에 따라 추가)
    }

    @Override
    public GatewayFilter apply(Config config) {
//        return (exchange, chain) -> {
//            ServerHttpRequest request = exchange.getRequest();
//            ServerHttpResponse response = exchange.getResponse();
//
//            // 로그인 토큰 체크
//            String s = request.getHeaders().get("Authorization").get(0);
//
//            if(s.startsWith("Bearer ")) {
//                return chain.filter(exchange);
//            }
//            return chain.filter(exchange);
//        };
        return null;
    }
}
