package com.golfzon.gatewayservice.filter;

import com.golfzon.gatewayservice.utils.FilterUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GfieldServiceAuthFilter extends AbstractGatewayFilterFactory<GfieldServiceAuthFilter.Config> {

    public GfieldServiceAuthFilter(FilterUtils filterUtils) {
        super(Config.class);
    }
    public static class Config {
        // 필터 설정 관련 필드 (필요에 따라 추가)
    }

    @Override
    public GatewayFilter apply(GfieldServiceAuthFilter.Config config) {
        return (exchange, chain) -> {
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("g-field-service filter: {}", request.getId());

            return chain.filter(exchange);
        };
    }
}
