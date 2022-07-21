package server.service;

import server.entity.Users;

public interface UsersService {
    Users login(String email, String password);

    void register(Users user);

    Users changePhoneNumber(String email);

    Users changeFirstName(String email);

    Users changeSecondName(String email);

    Users changeAge(String email);

    Users changePassword(String email);
}
