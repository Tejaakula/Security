package Akula.Security.auth;

import Akula.Security.Service.AuthenticateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticateService authenticateService;
    @PostMapping("register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request){
        return ResponseEntity.ok(authenticateService.register(request));
    }

    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticateRequest request){
        return ResponseEntity.ok(authenticateService.authenticate(request));
    }

}
