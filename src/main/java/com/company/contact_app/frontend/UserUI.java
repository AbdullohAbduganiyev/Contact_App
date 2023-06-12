package com.company.contact_app.frontend;

import com.company.contact_app.backend.service.UserService;
import com.company.contact_app.backend.service.UserServiceImpl;
import com.company.contact_app.frontend.util.ScannerUtil;

public class UserUI {

    public static void window() {
        while (true){
            System.out.println("""
                    \n1. Call contact
                    2. Save contact
                    3. Find Number
                    0. Exit""");
            String operation = ScannerUtil.getInputAsString("Choose: ");

            if (operation.equals("0")) return;
            switch (operation) {
                case "1" -> callContact();
                case "2" -> saveContact();
                case "3" -> findNumber();
            }
        }
    }

    private static void callContact() {
        System.out.println("\nWho would you like to call?");
        String name = ScannerUtil.getInputAsString("Enter full name or username: ");
        UserService userService = new UserServiceImpl();
        userService.findNumber(name);

    }

    private static void saveContact() {
        String name = ScannerUtil.getInputAsString("Enter name: ");
        String phoneNumber = ScannerUtil.getInputAsString("Enter phone number: ");

        UserService userService = new UserServiceImpl();
        userService.saveContact(name,phoneNumber);

    }

    private static void findNumber() {
        String name = ScannerUtil.getInputAsString("Enter name: ");

        UserService userService = new UserServiceImpl();
        userService.findNumber(name);
    }
}
