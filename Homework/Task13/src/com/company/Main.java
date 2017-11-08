package com.company;

import java.sql.*;
import java.util.Scanner;

public class Main  {


    public static void main(String[] args)throws SQLException {
        String name = "postgres";
        String password = "gfnhbrldtqy";
        String url = "jdbc:postgresql:" +
                "//localhost:5432/Homework1";

        ConsoleMenu consoleMenu = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);
        Connection connection = DriverManager.getConnection(url,name,password);
        Statement statement = connection.createStatement();

        while (true){
                consoleMenu.Menu();
                int command = scanner.nextInt();
                switch (command){
                    case 0: {
                        String nameOwner = scanner.next();
                        int ageOwner = scanner.nextInt();
                        int heightOwner = scanner.nextInt();
                        PreparedStatement preparedStatement = connection.prepareStatement("INSERT  INTO owner(name, age,height) VALUES (?,?,?)");
                        preparedStatement.setString(1,nameOwner);
                        preparedStatement.setInt(2, ageOwner);
                        preparedStatement.setInt(3,heightOwner);
                        preparedStatement.execute();
                    }
                    case 1: {
                        int numberCar = scanner.nextInt();
                        String modelCar = scanner.next();
                        String colorCar = scanner.next();
                        int idCar = scanner.nextInt();
                        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO car(number, model, color, owner_id) VALUES (?,?,?,?)");
                        preparedStatement.setInt(1,numberCar);
                        preparedStatement.setString(2,modelCar);
                        preparedStatement.setString(3,colorCar);
                        preparedStatement.setInt(4,idCar);

                    }
                    case 2: {
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM owner ORDER BY id");
                        while (resultSet.next()){
                            System.out.println(resultSet.getString("id") + " | " + resultSet.getString("name") + " | " + resultSet.getInt("age") + " | " + resultSet.getInt("height"));
                        }
                    }
                    case 3: {
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM car JOIN owner ON car.owner_id = owner.id");
                        while (resultSet.next()){
                            System.out.println(resultSet.getString("id") + " | " + resultSet.getString("number") + " | " + resultSet.getString("model") + " | " + resultSet.getString("color") + " | " + resultSet.getString("name"));

                        }
                    }
                    case 4: {
                        String nameOwner = scanner.next();
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM car " +" \n" +
                                "JOIN owner WHERE name = "+ nameOwner +" car.owner_id = owner.id; ");
                        while (resultSet.next()){
                            System.out.print(resultSet.getString("number") + " | " + resultSet.getString("model") + " | " + resultSet.getString("color"));
                        }
                    }
                    case 5: {
                        String colorCar = scanner.next();
                        ResultSet resultSet = statement.executeQuery("SELECT * FROM car JOIN owner ON owner_id = car.owner_id WHERE car.color='"+ colorCar+"'");
                        while (resultSet.next()){
                            System.out.println(resultSet.getString("id") + " | " + resultSet.getString("model") + " | " + resultSet.getString("color") + " | " + resultSet.getString("number") + " | " + resultSet.getString("name"));
                        }
                    }
                    case 6: {
                       System.exit(0);
                    }
                }


            }
    }
}
