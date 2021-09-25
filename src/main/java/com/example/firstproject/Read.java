//package com.example.firstproject;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class Read {
//    // private static final String QUERY = "select orderId,orderStatus from ORDERS where orderId =?";
//    private static final String QUERY3 = "select quantity from ITEM where Id =?";
//    private static final String QUERY4 = "select price from ITEM where Id =?";
//    private static final String QUERY = "select * from ITEM";
//    private static final String QUERY1 = "select * from ORDERS where ORDERId =?";
//    private static final String QUERY2 = "select * from ORDERITEMS where ORDERId =?";
//    public void readData()
//    {
//        try (Connection connection = H2JDBCUtils.getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement(QUERY);) {
//
//            ResultSet rs = preparedStatement.executeQuery();
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                int id = rs.getInt("ID");
//                String name = rs.getString("NAME");
//                int price = rs.getInt("PRICE");
//                int quantity = rs.getInt("QUANTITY");
//
//                System.out.println("Id is: " + id + "  Name is: " + name + "  Price are: " + price + "  Quantity is: " + quantity );
//
//            }
//        } catch (SQLException e) {
//            H2JDBCUtils.printSQLException(e);
//        }
//        // Step 4: try-with-resource statement will auto close the connection.
//    }
//
//
//    public int readQunatityData(int idd)
//    {
//        try (Connection connection = H2JDBCUtils.getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement(QUERY3);) {
//
//            preparedStatement.setInt(1, idd);
//            // System.out.println(preparedStatement);
//            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                int quantity = rs.getInt("QUANTITY");
//                int quant = quantity;
//
//                return quant;
//            }
//        } catch (SQLException e) {
//            H2JDBCUtils.printSQLException(e);
//        }
//        // Step 4: try-with-resource statement will auto close the connection.
//        return idd;
//    }
//
//
//
//    public int readPriceData(int idd)
//    {
//        try (Connection connection = H2JDBCUtils.getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement(QUERY4);) {
//
//            preparedStatement.setInt(1, idd);
//            // System.out.println(preparedStatement);
//            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                int price = rs.getInt("PRICE");
//                int amount = price;
//
//                return amount;
//            }
//        } catch (SQLException e) {
//            H2JDBCUtils.printSQLException(e);
//        }
//        // Step 4: try-with-resource statement will auto close the connection.
//        return idd;
//    }
//
//
//
//
//
//
//    public void readOrderData(int idd)
//    {
//        try (Connection connection = H2JDBCUtils.getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement(QUERY1);) {
//            preparedStatement.setInt(1, idd);
//            //System.out.println(preparedStatement);
//            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                int orderid = rs.getInt("ORDERID");
//                int orderstatus = rs.getInt("ORDERSTATUS");
//
//                System.out.println("Id is: " + orderid + "  Status is: " + orderstatus + "" );
//            }
//        } catch (SQLException e) {
//            H2JDBCUtils.printSQLException(e);
//        }
//        // Step 4: try-with-resource statement will auto close the connection.
//    }
//
//
//    public void readOrderItemData(int idd)
//    {
//        try (Connection connection = H2JDBCUtils.getConnection();
//
//
//             PreparedStatement preparedStatement = connection.prepareStatement(QUERY2);) {
//            preparedStatement.setInt(1, idd);
//
//            ResultSet rs = preparedStatement.executeQuery();
//
//            while (rs.next()) {
//                int orderid = rs.getInt("ORDERID");
//                int price = rs.getInt("PRICE");
//                int quantity = rs.getInt("QUANTITY");
//
//                System.out.println("Order Id is: " + orderid  + "  Price is: " + price + "," +  "");
//            }
//        } catch (SQLException e) {
//            H2JDBCUtils.printSQLException(e);
//        }
//        // Step 4: try-with-resource statement will auto close the connection.
//    }
//
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
