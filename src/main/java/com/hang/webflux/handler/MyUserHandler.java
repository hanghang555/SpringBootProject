package com.hang.webflux.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class MyUserHandler {

    public Mono<ServerResponse> getUser(ServerRequest request) {
        return null;
    }

    public Mono<ServerResponse> getUserCustomers(ServerRequest request) {
        System.out.println("=============customers coming======================");
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue("Hi,this is SpringWebFlux"));
    }

    public Mono<ServerResponse> deleteUser(ServerRequest request) {
        return null;
    }
}
