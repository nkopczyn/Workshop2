package pl.coderslab.entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDao {

    private static final String CREATE_QUERY = "INSERT INTO workshop2 (email, username, password) VALUES (?, ?, ?)";

    public static void createUser(User user) {

        try {
            Connection connection = DbUtil.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(CREATE_QUERY);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
