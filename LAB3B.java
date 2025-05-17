package BM23AI042;

import java.util.Scanner;

public class StringBufferExample {
    public StringBufferExample() {
    }

    public static void main(String[] args) {
        // Task i: Checking capacity of StringBuffer objects
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of string buffer object sb1: " + sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of string buffer object sb2: " + sb2.capacity());
        // Task ii: Reversing the contents of string and converting to uppercase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        StringBuffer reversedBuffer = new StringBuffer(inputString);
        reversedBuffer.reverse();
        // Convert reversed string to uppercase and replace buffer content
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase: " + reversedUpperCase);
        reversedBuffer = new StringBuffer(reversedUpperCase);
        // Task iii: Reading a string from console and appending it
        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending: " + reversedBuffer);
        scanner.close();
    }
}

//output:
Capacity of string buffer object sb1: 16
Capacity of string buffer object sb2: 21
Enter a string: thgil
Reversed string in uppercase: LIGHT
Enter a string to append: Yagami
String after appending: LIGHTYagami

Process finished with exit code 0
