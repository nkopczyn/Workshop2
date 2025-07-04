package pl.coderslab.entity;

public class MainDao {
    public static void main(String[] args) {

          User user = new User();


//        user.setUserName("bobo");
//        user.setEmail("bobo@mail.com");
//        user.setPassword("bobo1234");
//
//        UserDao.createUser(user);

        //System.out.println(user.getUserName());

        User readUserResult = UserDao.readUser(8);
        System.out.println(readUserResult.getUserName());
        System.out.println(readUserResult.getPassword());

        // UserDao.deleteUser(5);

//        User updateUser = UserDao.readUser(8);
//
//        updateUser.setUserName("updatedUser8");

//        System.out.println(updateUser.getUserName());
//        System.out.println(updateUser.getPassword());

//        updateUser.setPassword("updatedPassword8");
//        updateUser.setEmail("updatedEmail8");
//
//        UserDao.updateUser(updateUser);

        User [] userList = UserDao.findAll();
        System.out.println(userList[2].getUserName());





    }
}