package com.cognizant.pas.application.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// model for username password request
public class UsernamePasswordRequest {

    private String username;
    private String password;
}
