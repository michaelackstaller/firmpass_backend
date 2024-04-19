package de.acksmi.firmapp.firmpassbackend.registration;

import de.acksmi.firmapp.firmpassbackend.AppUser.AppUser;
import de.acksmi.firmapp.firmpassbackend.AppUser.AppUserRole;
import de.acksmi.firmapp.firmpassbackend.AppUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;


    public void register(RegistrationRequest registrationRequest) {
        appUserService.signUpUser(new AppUser(registrationRequest.getFirstName() + " " + registrationRequest.getLastName(), registrationRequest.getLastName(), registrationRequest.getPassword(), AppUserRole.USER, false));
    }
}
