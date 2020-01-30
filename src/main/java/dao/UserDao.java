package dao;

import model.User;

public interface UserDao {

    User getUserByUserName(String username) throws Exception;
}
