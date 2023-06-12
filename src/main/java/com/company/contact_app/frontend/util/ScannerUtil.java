package com.company.contact_app.frontend.util;

import java.util.Scanner;

public class ScannerUtil {
    public static String getInputAsString(String title) {
        System.out.print(title);
        return new Scanner(System.in).nextLine();
    }
    public static Integer getInputAsInteger(String title) {
        System.out.print(title);
        return new Scanner(System.in).nextInt();
    }
}
