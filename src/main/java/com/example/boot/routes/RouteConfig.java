package com.example.boot.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

import com.example.boot.handler.UserHandler;


@Configuration
@EnableWebFlux
public class RouteConfig {

	@Bean
	public RouterFunction<ServerResponse> routes(UserHandler userHandler) {	
		return route(GET("/users"),userHandler::getAllUsers);	
	}
}
