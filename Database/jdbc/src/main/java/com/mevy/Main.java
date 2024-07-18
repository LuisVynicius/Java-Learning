package com.mevy;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        try (Connection connection = Conn.getConnection();) {

            UserService userService = new UserService(connection);
            // userRepository.printAllUsers();

            System.out.println("User: " + userService.findById(3));

        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }
    }

}