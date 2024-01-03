package com.golfzon.gatewayservice.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

//    @Bean
//    public RouteLocator gfieldRoute(RouteLocatorBuilder builder, AdminServiceAuthFilter adminServiceAuthFilter, GfieldServiceAuthFilter gfieldServiceAuthFilter) {
//        return builder.routes()
//                .route("g-field-service", r -> r.path("/g-field-service/**")
//                        .filters(f -> f
//                                .rewritePath("/g-field-service/(?<segment>.*)", "/${segment}")
////                                .filter(gfieldServiceAuthFilter.apply(new GfieldServiceAuthFilter.Config()))
//                                .retry(retryConfig -> retryConfig
//                                .setRetries(3)
//                                .setStatuses(HttpStatus.BAD_GATEWAY, HttpStatus.GATEWAY_TIMEOUT, HttpStatus.NOT_FOUND)
//                                .setMethods(HttpMethod.GET)))
//                        .uri("lb://G-FIELD-SERVICE"))
//
//                .route("admin-service", r -> r.path("/admin-service/**")
//                        .filters(f -> f
//                                .rewritePath("/admin-service/(?<segment>.*)", "/${segment}")
////                                .filter(adminServiceAuthFilter.apply(new AdminServiceAuthFilter.Config()))
//                                .retry(retryConfig -> retryConfig
//                                .setRetries(3)
//                                .setStatuses(HttpStatus.BAD_GATEWAY, HttpStatus.GATEWAY_TIMEOUT, HttpStatus.NOT_FOUND)
//                                .setMethods(HttpMethod.GET)))
//                        .uri("lb://ADMIN-SERVICE"))
//
//                .route("location-service", r -> r.path("/location-service/**")
//                        .filters(f -> f
//                                .rewritePath("/location-service/(?<segment>.*)", "/${segment}")
//                                .retry(retryConfig -> retryConfig
//                                .setRetries(3)
//                                .setStatuses(HttpStatus.BAD_GATEWAY, HttpStatus.GATEWAY_TIMEOUT, HttpStatus.NOT_FOUND)
//                                .setMethods(HttpMethod.GET)))
//                        .uri("lb://LOCATION-SERVICE"))
//                        .build();
//    }
}
