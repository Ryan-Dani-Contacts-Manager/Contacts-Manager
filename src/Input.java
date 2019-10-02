

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public boolean yesNo() {
        System.out.println("Y/N?");
        String answer = this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");

    }

    private String getString() {

        return this.scanner.nextLine();
    }

    public String getString(String prompt) {
        if (prompt.isEmpty()) {
            System.out.println("enter message");
        } else {
            System.out.println(prompt);
        }
        return getString();
    }


    public int getInt(int min, int max) {
        int number = getInt();
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getInt(min, max);
    }


    double getDouble(double min, double max) {
        Double number = getDouble();
        if (number >= min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getDouble(min, max);
    }

//    public int getInt (String prompt) {
//        System.out.println(prompt);
//       return Integer.parseInt(this.scanner.nextLine());
//
//    }

    public int getInt() {
        try {
            return Integer.valueOf(getString("Enter a number"));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
//            e.printStackTrace();
            return getInt();
        }

    }

//    public double getDouble (String prompt) {
//        System.out.println(prompt);
//        return Double.parseDouble(this.scanner.nextLine());
//    }

    public double getDouble() {

        try {
            return Double.valueOf(getString("Enter a decimal number"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
//         e.printStackTrace();
            return getDouble();
        }
    }

    public int getBinary() {
        int num;
        try {
            num = Integer.valueOf(getString("Enter a binary number"), 2);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getBinary();
        }
        System.out.print("Your number is: ");
        return num;

    }

    public int getHex() {
        int num;
        try {
            num = Integer.valueOf(getString("Enter a hexadecimal number"), 16);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return getHex();
        }
        System.out.print("Your number is: ");
        return num;
    }
}


