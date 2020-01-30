package services;

import dao.UserDao;
import model.User;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao){
        this.userDao = userDao;
    }

    public boolean checkUserPresence(User user) throws Exception {
        User u = userDao.getUserByUserName(user.getUsername());
        return u!=null;
    }
}
