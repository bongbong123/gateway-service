package com.golfzon.gatewayservice.handler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class GlobalHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalHandler.class);

    public Mono<ServerResponse> helloWorld(ServerRequest request) {
        logger.info("start to get healthcheck");
        return ServerResponse.ok().body(Mono.just("hello"), String.class);
    }
}
