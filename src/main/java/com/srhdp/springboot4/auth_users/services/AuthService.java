package com.srhdp.springboot4.auth_users.services;

import com.srhdp.springboot4.auth_users.dtos.LoginRequest;
import com.srhdp.springboot4.auth_users.dtos.LoginResponse;
import com.srhdp.springboot4.auth_users.dtos.RegistrationRequest;
import com.srhdp.springboot4.auth_users.dtos.ResetPasswordRequest;
import com.srhdp.springboot4.res.Response;

public interface AuthService {
    Response<String > register(RegistrationRequest request);
    Response<LoginResponse> login(LoginRequest loginRequest);
    Response<? > forgetPassword(String email);
    Response<? > updatePasswordViaResetCode(ResetPasswordRequest resetPasswordRequest);
}

