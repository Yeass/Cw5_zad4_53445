package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.print("Podaj pierwszy ciag znakow: ");
        String ciag1 = myObj.nextLine();
        System.out.print("Podaj drugi ciag znakow: ");
        String ciag2 = myObj.nextLine();

        String result1 = ciag1.concat(ciag2);
        System.out.println("Drugi ciag dodany do pierwszego: " + result1);
        String result2 = ciag2.concat(ciag1);
        System.out.println("Pierwszy ciag dodany do drugiego: " + result2);

        System.out.println("Porownanie:");
        System.out.println(result1.equals(result2));
        System.out.println(result2.equals(result1));
    }
}
