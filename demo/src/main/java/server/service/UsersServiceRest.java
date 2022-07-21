package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import server.entity.Users;

public class UsersServiceRest {

    @Autowired
    private UsersService usersService;


    @PostMapping
    public void register(@RequestBody Users user) {
        usersService.register(user);
    }
}
