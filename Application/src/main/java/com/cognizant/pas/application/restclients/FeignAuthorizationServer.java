package com.cognizant.pas.application.restclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.pas.application.model.UsernamePasswordRequest;

@FeignClient(name = "AuthorizationServer", url = "http://authorizationserver-env.eba-vdzzqd2m.ap-southeast-1.elasticbeanstalk.com")
// provides connection to using authorization server
public interface FeignAuthorizationServer {

    @PostMapping(value = "/account/login")
    public ResponseEntity<Object> authenticateUser(@RequestBody UsernamePasswordRequest usernamePasswordRequest);

}
