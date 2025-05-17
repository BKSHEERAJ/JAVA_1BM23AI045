package BM23AI045;

import java.util.Scanner;
import java.io.PrintStream;

public class Strings {
    public Strings() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        PrintStream var10000 = System.out;
        boolean var10001 = str1.equals(str2);
        var10000.println("Equals (case-sensitive): " + var10001);
        System.out.println("Equals (case-insensitive): " + areEqualIgnoreCase);
        var10000 = System.out;
        String var7 = str1.concat(str2);
        var10000.println("Concatenated: " + var7);
        String copy1 = String.valueOf(str1);
        System.out.println("Copy of str1: " + copy1);
        scanner.close();
    }
}

//output:
Enter string 1: Eren
Enter string 2: Yeager
Equals (case-sensitive): false
Equals (case-insensitive): false
Concatenated: ErenYeager
Copy of str1: Eren

Process finished with exit code 0
//output2:
Enter string 1: hello
Enter string 2: HeLlO
Equals (case-sensitive): false
Equals (case-insensitive): true
Concatenated: helloHeLlO
Copy of str1: hello

Process finished with exit code 0
