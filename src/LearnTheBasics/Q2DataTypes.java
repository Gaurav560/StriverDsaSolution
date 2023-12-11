package LearnTheBasics;

import java.util.Scanner;

public class Q2DataTypes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the data type to give the value");
        String str=scanner.next();
        switch (str) {
            case "Long" -> System.out.println("8 bytes");
            case "Float" -> System.out.println("4 bytes");
            case "int" -> System.out.println("4 bytes ");
            case "char" -> System.out.println("2 bytes");
            default -> System.out.println("8 bytes  ");
        }
    }
}
