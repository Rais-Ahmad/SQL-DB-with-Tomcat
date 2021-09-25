//package com.example.firstproject;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class H2JDBCUtils {
//    /*private static String jdbcURL = "jdbc:h2:~/db1";
//    private static String jdbcUsername = "rais";
//    private static String jdbcPassword = "";*/
//
//    public static Connection  getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName("org.h2.Driver");
//            connection = DriverManager.getConnection("jdbc:h2:~/order-management");
//            System.out.println("Connection Established");
//
//        } catch (SQLException | ClassNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return connection;
//    }
//
//
//    public static void printSQLException(SQLException ex) {
//        for (Throwable e: ex) {
//            if (e instanceof SQLException) {
//                e.printStackTrace(System.err);
//                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
//                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
//                System.err.println("Message: " + e.getMessage());
//                Throwable t = ex.getCause();
//                while (t != null) {
//                    System.out.println("Cause: " + t);
//                    t = t.getCause();
//                }
//            }
//        }
//    }
//}
//
