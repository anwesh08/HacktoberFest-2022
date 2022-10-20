package com.alvin;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch (empID) {
            case 1 -> System.out.println("Alvin");
            case 2 -> System.out.println("Sophia");
            case 3 -> {
                System.out.println("Emp ID -> 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
