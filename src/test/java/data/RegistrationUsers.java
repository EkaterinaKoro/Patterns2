package data;

import lombok.Data;

@Data
public class RegistrationUsers {
    private final String login;
    private final String password;
    private final String status;
}

