package Database.jdbc.src.main.java.com.mevy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

public class UserRepository {
    
    private Connection connection;

    public UserRepository(Connection connection) {
        this.connection = connection;
    }

    public Optional<User> findById(int id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM tb_user where id = ?");
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
            return Optional.of(user);
        }
        return Optional.empty();
    }

    public void printAllUsers() throws SQLException {
        PreparedStatement statement = connection.prepareStatement("SELECT * FROM tb_user");
        ResultSet rs = statement.executeQuery();
        while(rs.next()) {
            System.out.println(rs.getInt(1) + "|" + rs.getString(2) + "|" + rs.getString(3));
        }
    }
}
