public class JavaLiterals {
    public static void main(String[] args){
        /**
         * Java Literals
         * There are different types of literals
         * i. Integer Literals
         * ii. Floating-point Literals
         * iii. Boolean Literals
         * iv. Character Literals
         * V. String Literals
         */

        // 1. Integer Literals
        // They come in different formats
        // -> decimal (base 10)
        // it doesn't have a special notation e.g. 12
        System.out.println("Example of a decimal literal is:" + 12);

        // -> hexadecimal (base 16)
        // Preceded by 0x or 0x e.g. 0xC
        System.out.println("Example of a Hexadecimal literal is:" + 0xC);

        // -> octal (base 8)
        // Preceded by 0 e.g. 014
        System.out.println("Example of a octal literal is:" + 015);


        // 2. Floating-point Literals
        // Represents decimals with fractional parts e.g. 3.1416
        // Can be expressed in scientific notation
        // e.g. 583.45 (standard) or 5.8345e2
        System.out.println("Example of a Standard Float Literal is:" +583.45);
        System.out.println("Example of a Scientific Float Literal is:" +5.8345e2);

        // 3. Boolean Literals
        // have only 2 values, true or false.
        System.out.println("Example of Boolean Literal is: true and false");

        // 4. Character Literals
        // represents single unicode characters
        // A unicode character set replaces the 8-bit ASCII set.
        // Unicode allows the inclusion of symbols and special characters from other languages.
        //  To use a character literal, enclose the character in single quote.
        //e.g. letter a is represented as 'a'
        System.out.println('a');

        System.out.println("This is a paragraph with a new line or line break");

        // 5. String Literals
        // represent multiple characters and are enclosed by double qoutes example: "Hello World"
        System.out.println("Hello world!!!");



    }
}
