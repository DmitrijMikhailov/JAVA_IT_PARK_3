package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RemoteController remoteController = new RemoteController();
        Menu menu = new Menu();
        while (true){
                menu.showMenu();
                int x = scanner.nextInt();
                remoteController.remoteController(x);
            }
    }
}

