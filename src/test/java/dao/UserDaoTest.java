package dao;

import model.User;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserDaoTest {

    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        this.userDao = new UserDaoImpl();
    }

    @Test
    public void getUserByUserName_Should_Return_True() throws Exception {
        User remy = userDao.getUserByUserName("remy@gmail.com");
        assertThat(remy).isNotNull();
        assertThat(remy.getUsername()).isEqualTo("remy@gmail.com");
    }

    @Test
    public void getUserByUserName_Null_user() throws Exception {
         User alex = userDao.getUserByUserName("alex@gmail.com");
         assertThat(alex).isNull();
    }
}