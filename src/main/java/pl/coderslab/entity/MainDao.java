package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

          User user = new User();


//        user.setUserName("lolo");
//        user.setEmail("lolo@mail.com");
//        user.setPassword("lolo1234");

//        UserDao.createUser(user);
//
//        //System.out.println(user.getUserName());
//
//        User readUserResult = UserDao.readUser(8);
//        System.out.println(readUserResult.getUserName());
//        System.out.println(readUserResult.getPassword());

        // UserDao.deleteUser(5);

        User user2 = UserDao.readUser(2);

        user2.setPassword("hdehduehfuefhuefuihe");

        UserDao.updateUser(user2);


//        updateUser.setPassword("updatedPassword8");
//        updateUser.setEmail("updatedEmail8");
//
//        UserDao.updateUser(updateUser);

        User [] userList = UserDao.findAll();
        System.out.println(userList[2].getPassword());





    }
}