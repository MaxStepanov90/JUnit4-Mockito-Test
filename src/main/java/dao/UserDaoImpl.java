package dao;

import model.User;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {

    private List<User> users;

    public UserDaoImpl() {
        this.users = Arrays.asList(
                (new User("olesya@gmail.com", "GUEST")),
                (new User("kirill@gmail.com", "ADMIN")),
                (new User("remy@gmail.com", "USER"))
        );
    }

    @Override
    public User getUserByUserName(String username) throws Exception {
        return users.stream().filter(user -> user.getUsername().equals(username))
                .findAny().orElse(null);
    }
}
