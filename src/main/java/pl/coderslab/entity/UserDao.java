package pl.coderslab.entity;

import java.sql.*;

public class UserDao {

    private static final String CREATE_QUERY = "INSERT INTO workshop2 (email, username, password) VALUES (?, ?, ?)";
    private static final String CHECK_ID = "SELECT * FROM workshop2 WHERE id = ?";


    // creating new user
    public static User createUser(User user) {

        try
                (Connection connection = DbUtil.getConnection()) {

            PreparedStatement preparedStatement1 = connection.prepareStatement(CREATE_QUERY, Statement.RETURN_GENERATED_KEYS);
            preparedStatement1.setString(1, user.getEmail());
            preparedStatement1.setString(2, user.getUserName());
            preparedStatement1.setString(3, user.getPassword());
            preparedStatement1.executeUpdate();

            ResultSet resultSet1 = preparedStatement1.getGeneratedKeys();
            if (resultSet1.next()) {
                user.setId(resultSet1.getInt(1));
            }
            return user;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }


    // reading existing user form database, taking in a row from table and turning it into na object
    public static User readUser(int idUser) {

        // check connection
        try
                (Connection connection = DbUtil.getConnection();
                 PreparedStatement preparedStatement2 = connection.prepareStatement(CHECK_ID)) {

            preparedStatement2.setInt(1, idUser); // setting value for prepared statement

            try (ResultSet resultSet2 = preparedStatement2.executeQuery()) {
                if (resultSet2.next()) {
                    // if id is in the database, checks if the sql query returned at least one row
                    // there is a row with the given id

                    System.out.println("ID found in database");

                    // retrieve info
                    User userResult = new User();
                    userResult.setId(resultSet2.getInt("id"));
                    userResult.setEmail(resultSet2.getString("email"));
                    userResult.setUserName(resultSet2.getString("username"));
                    userResult.setPassword(resultSet2.getString("password"));

                    // print info, need to call getter to see user's info
                    return userResult;

                } else {
                    System.out.println("ID not found in database");
                    return null;
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
