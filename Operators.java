 public class Operators {
    /**
     * Operators in java
     *
     * We have different types of operators in java:
     * 1. Arithmetic operators
     * 2. Relation operators
     * 3. Logical operators
     * 4. Conditional operators
     *
     * They follow a certain precedence so that the compiler can know which operator to evaluate first in case multiple operators are used in the statement
     */

    public static void main(String[] args){
        // create a variable
        double x = 20;
        double y = 6;

        // 1. Arithmetic operators
        // Addition -> +
        System.out.println(x + y); // returns 26

        // Subtraction -> -
        System.out.println(x - y); // returns 14

        // Multiplication *
        System.out.println(x * y); // returns 120

        // Division -> /
        System.out.println(x / y); // returns 3

        // Modulus -> % (finds the remainder of a division)
        System.out.println(x % y); // returns 2

        // 2. Increment and Decrement Operators (++, --)
        // increment and decrement operators increase and decrease a value stored by 1.
        // unary increment operator ++

        // For example: count = count + 1; increment the value of count by 1
        // the above example is equivalent to: count++

        // operator        Use             Description
        // ++              x++             Increment x by 1; evaluates to the value of x before it was incremented
        // ++              ++x             Increment x by 1; evaluates to the value of x after it was incremented
        // --              x--             Decrements x by 1; evaluates to the value of x before it was decremented
        // --              --x             Decrements x by 1; evaluates to the value of x after it was decremented


        // The increment and decrement operators can be placed before or after the operand.
        // When used before an operand, it causes the variable to be incremented or decremented by 1, and then the new value is used in the expression in which it appears.

        // For example
        int i = 10;
        int j = 3;
        int k = 0;

      //  k = ++j + i; // will result to k = 4 + 10 = 14
     //   System.out.println("The value of k is: " + k);

       // k = j++ + i; //
       // System.out.println("The value of k is: "+ k);

        int op = 1;
        op++;
        System.out.println(op++); // 1
        System.out.println(op); // 2


        // 3. Relational Operators
        // compare two values and determines the relationship between those two values.
        // the output of evaluation is a boolean value -> true or false

        // Operator              Name                             Use            Description
        // >                     greater than                     x > y          x is greater than y
        // >=                    greater than or equal to x       x >= y         x is greater than or equal to y
        // <                     less than                        x < y          x is less than y
        // <=                    less than or equal to x          x <= y         x is less than or equal to x
        // ==                    equal to                         x == y         x is equal to y
        // !=                    not equal to                     x != y         x is not equal to y

        int a = 20;
        int b = 6;

        // Greater than
        System.out.println("20 > 6? " + (a > b));
        // Greater than or equal to
        System.out.println("20 >= 6? " + (a >= b));

        // 4. Logical Operators
        // have two or more boolean operands that yield a boolean result
        // There are 3 logical operators

        int c = 2;
        int d = 1;
        // i. logical AND Truth table - > when using logical AND operator both expressions must evaluate to true to get a true result
        // x1       x2        Result
        // TRUE     TRUE      TRUE
        // TRUE     FALSE     FALSE
        // FALSE    TRUE      FALSE
        // FALSE    FALSE     FALSE

        // Examples
        System.out.println((c > d) && (c < d));
        System.out.println((c > d) && ( d < c));

        System.out.println( (c <= d) && (d != c));

        // ii. logical OR -> when working with logical OR, you only need one operands(expressions) to evaluate to true to get the result  as true.
        // symbol -> ||

        // Logical OR Truth table

        // x1       x2        Result
        // TRUE     TRUE      TRUE
        // TRUE     FALSE     TRUE
        // FALSE    TRUE      TRUE
        // FALSE    FALSE     FALSE

        // Example
        System.out.println((2== 1) || (2 > 2));
        System.out.println((2 != 1) || (2 != 2));

        // iii. logical NOT
        // takes in one argument, wherein that argument can be an expression, variable or constant
        // symbol -> !

        // Here is the Truth table for !
        // x1             Result
        // TRUE           FALSE
        // FALSE          TRUE
         boolean isRainning = true;
         boolean isRunning = false;

         System.out.println(!isRainning);
         System.out.println(!isRunning);


         // a login program

        // user login credentials
        String username = "Praise";
        String password = "p@$$word";

        // correct user login credentials
        String correctUserName = "Praise";
        String correctPassword = "p@$$word";

        // check if the user entered the correct credentials
        if ((username == correctUserName) && (password == correctPassword)){
            // if user credentials do not match(meaning true), login the user
            System.out.println("Logged in Successfully!");
        } else {
            // if user credentials do not match(meaning false), throw an error
            System.out.println("Invalid Username or Password, please try again");
        }

       // 5. Conditional Operators
        // symbol -> ?:
        // is also called a ternary operator
        // the structure or syntax of an expression using a conditional operator is
        //exp1 ? exp2 : exp3

        //wherein:
        // exp1 -> is a boolean expression whose result must either be true or false.

        //Result:
        //if exp1 is true, exp2 is the result returned
        // if exp1 is false, then exp3 is the result returned

        String status = "";
        int grade = 80;

        // get the status of the student
        status = (grade >= 60) ? "Passed" : "Failed";

        //print status
        System.out.println(status);
    }
}


