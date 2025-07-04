package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

          User user = new User();
//        user.setUserName("janek");
//        user.setEmail("janek@mail.com");
//        user.setPassword("janek1234");

        //UserDao.createUser(user);

        //System.out.println(user.getUserName());

        User readUserResult = UserDao.readUser(4);
        System.out.println(readUserResult.getUserName());
        System.out.println(readUserResult.getPassword());



    }
}