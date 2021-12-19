package cn.elvea.jakarta.mvc.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
        System.out.println("UserService.UserServiceImpl...");
    }

    @Override
    public void test() {
        System.out.println("Hello World!");
    }

}
