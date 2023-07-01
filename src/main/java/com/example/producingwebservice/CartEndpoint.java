package com.example.producingwebservice;

import io.spring.guides.gs_producing_web_service_cart.PostCartRequest;
import io.spring.guides.gs_producing_web_service_cart.PostCartResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class CartEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service-cart";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postCartRequest")
    @ResponsePayload
    public PostCartResponse postCart(@RequestPayload PostCartRequest request) {
        PostCartResponse response = new PostCartResponse();
        response.setMessage("This is a success");
        response.setCartSubmissionRequest(request.getCartSubmissionRequest());
        return response;
    }
}