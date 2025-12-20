package Basic;

public class javaDataType {
/*
=============================================
🔹 Categories of Data Types in Java
=============================================

1️⃣ Primitive Data Types (8 total)
---------------------------------------------
These are the most basic types, directly stored in memory.

| Type     | Size           | Example                  |
|-----------|----------------|--------------------------|
| byte     | 8-bit          | byte b = 10;             |
| short    | 16-bit         | short s = 200;           |
| int      | 32-bit         | int age = 25;            |
| long     | 64-bit         | long views = 1_000_000L; |
| float    | 32-bit (decimal) | float pi = 3.14f;      |
| double   | 64-bit (decimal) | double price = 99.99;  |
| char     | 16-bit Unicode | char grade = 'A';        |
| boolean  | 1-bit (true/false) | boolean isActive = true; |

2️⃣ Non-Primitive Data Types
---------------------------------------------
Examples: String, Arrays, Classes, Interfaces
These are created by the programmer or Java itself.
*/

    public static void main(String[] args) {

        String name = "Dhiraj";
        char a = 'A';
        boolean b = true;

        byte b1 = 127;

        float pi = 3.14165161565f;
        double price = 99.994155165165;
        System.out.println(pi);
        System.out.println(price);

        short s1 = 32767;
        char uniCodeDemo ='\u0033';
        System.out.println(uniCodeDemo);

        // Arrays
        int[] marks ={1,2,3,4,5};
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    }
}
