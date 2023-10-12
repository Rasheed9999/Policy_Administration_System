package com.cognizant.pas.policy.restclients;


import com.cognizant.pas.policy.payload.request.UsernamePasswordRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "AuthorizationServer", url = "http://authorizationserver-env.eba-vdzzqd2m.ap-southeast-1.elasticbeanstalk.com")
public interface FeignAuthorizationServer {

    @PostMapping(value = "/account/login")
    public ResponseEntity<Object> authenticateUser(@RequestBody UsernamePasswordRequest usernamePasswordRequest);
}
