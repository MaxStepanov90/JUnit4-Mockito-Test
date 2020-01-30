package dao;

import model.User;

import java.util.List;

public interface UserDao {

    User getUserByUserName(String username) throws Exception;
    List<User> findAllUsers();
}
