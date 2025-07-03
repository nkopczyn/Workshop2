package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

        User user = new User();
        user.setUserName("basia");
        user.setEmail("basia@mail.com");
        user.setPassword("basia1234");

        UserDao.createUser(user);

    }
}