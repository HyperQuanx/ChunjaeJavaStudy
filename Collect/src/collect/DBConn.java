package collect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
    // JDBC URL, 사용자 이름, 비밀번호
    private static final String JDBC_URL = "jdbc:mariadb://localhost:3306/books";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        // Connection 객체를 생성
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            System.out.println("MariaDB에 성공적으로 연결되었습니다.");
            
            // 1. INSERT 쿼리 실행
            String insertQuery = "INSERT INTO tbl_member (id, name) VALUES (?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
            

            int rowsInserted = insertStatement.executeUpdate(); // INSERT 실행
            if (rowsInserted > 0) {
                System.out.println("새로운 데이터가 성공적으로 삽입되었습니다.");
            }

            // 2. SELECT 쿼리 실행 (전체 조회)
            String selectQuery = "SELECT * FROM tbl_member";
            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = selectStatement.executeQuery();

            // 결과 처리
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
            }

        } catch (SQLException e) {
            System.err.println("MariaDB에 연결할 수 없습니다.");
            e.printStackTrace();
        }
    }
}
