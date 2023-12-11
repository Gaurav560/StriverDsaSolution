package LearnTheBasics;

import java.util.Scanner;

public class Q1UserInputOutput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the character please:");
        String str= scanner.next();
        if (str.charAt(0)>=97 &&str.charAt(0)<=122){
            System.out.println("small alphabet");
        } else if (str.charAt(0)>=65 &&str.charAt(0)<=90) {
            System.out.println("capital letter alphabet");
            
        }else {
            System.out.println("-1");
        }
    }
}
