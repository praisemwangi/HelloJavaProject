import java.util.Scanner;

public class RepititionStructures {
    /**
     * Repitition Control Structures
     *
     * are java statements that allow us to execute specific blocks of code a number of times
     *
     * there are 3 types
     *
     * 1. while-loop
     * 2. do-while loop
     * 3. for-loop
     */

    public static void main(String[] args) {
        // 1. While-Loop -> is a statement of a block of code that is repeated as long as some condition is satisfied.

        // while-loop has the form (syntax)

        // while (boolean_expression) {
        //    statement1;
        //    statement2;
        // }

        // The statements inside the while loop are executed as long as the boolean expression evaluates to true.

        // Example:
        // Write a while-loop that prints the integers 1 2 3 4 5 6 7 8 9 10


        int x = 1;

        // repeat as long as the value of x is loess than 10 or equal to 10
        while (x < 11) {
            System.out.println(x);
            x++;
        //    x += 1;
        //    x = x + 1;
        }
        System.out.println("===========================================================");

        // output: 0 2 4 6 8 10 12 14 16 18 20
        int y = 0;
        while (y < 21) {
            System.out.println(y);
            y += 2;
        }
        System.out.println("====================================================");

            // output: 15 12 9 6 3 0 -3 -6 -9 -12 -15
            int i = 15;
            while (i >= -15) {
                System.out.println(i);
                i -= 3;
            }

        // 2. do ... while
        //  statements inside a do-while loop are executed several times as long as the condition is satisfied.
        // it is similar to a while-loop. Main difference is that statements inside a do-while loop are executed at least once.


        // syntax
        // do {
        //    statement1;
        //    statement2;
        // } while (boolean_expression);

        // output 1 2 3 4 5 6 7 8 9 10
        int m = 1;
            do {
        System.out.println(m);


            m++;
        } while ( m <= 10);

        // 0 5 10 15 20 25 30 35 40 45 50
        // 50 45 40 35 25 20 15 10 5 0



        System.out.println("================================================================");

        // 3. for loop
        // A  for-loop allows execution of the same code a number of times.

        // for-loop syntax
        // for (InitializationExpression; LoopCondition; StepExpression) {
        //    statement1;
        //    statement2;
        // }

        // where;
        // -> InitializationExpression: initialize the loop variable.
        // -> LoopCondition: compares the loop variable to some limit.
        // -> StepExpression: updates yhe loop variable.

        // Example:
        // output: 1 2 3 4 5 6 7 8 9 10
        for (int c = 1; c < 11; c++) {
            System.out.println(c);
        }

        System.out.println("================================================================");

        // output: 10 20 30 40 50 60 70 80 90 100
        for (int l = 10; l < 101; l += 10) {
            System.out.println(l);
        }
        System.out.println("================================================================");

        // Branching statements.
        // Branching statements allow us to redirect the flow of program execution.


        // Java offers 3 programming statements.
        // i. break
        // ii. continue
        /// iii. return


        // i. break statement
        // terminates the enclosing switch statement, and flow of control tranfers to the statement immediately following the switch
        // this can be used to terminate a for, while or do-while loop

        String[] studentNames = {"Joanoah", "Bradley","Muzna", "Hamza", "Ian", "Benson", "Praise", "Ephraim", "Frank", "Ryan", "Nathan", "Yasmin","Dominic", "Phill", "Brenda"};

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for the name they want to search in the class
        System.out.println("Enter the name of the student you wish to search for: ");

        String searchName = sc.next();
        boolean foundName = false;

        for (int idx = 0; idx < studentNames.length; idx++) {
            if (studentNames[idx] .equals(searchName)) {
                foundName = true;
                break;
            }
        }

        if (foundName == true) {
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found!");
        }
        System.out.println("================================================================");

        // ii. Continue Statement
        //skips to the end of the innermost loops body and evaluates the boolean expression that controls the loop basically skipping the remainder of this iteration of the loop

        // Example:
        String[] names = {"Beah", "Bianca", "Lance", "Beah"};

        int count= 0;

        for (int p = 0; p < names.length; p++){
            if (names[p].equals("Beah")){
                continue; // skip next statement
            }
            count++;
        }
        System.out.println("There are " + count + " Beahs in this list");

        System.out.println("================================================================");

        //nested for loop
        // create a times table for a user provided number

        // ask the user for the times table number
        System.out.print("Enter the times table number: ");
        int timesTable = sc.nextInt();

        for (int times = 1; times <= 12; times++){
            System.out.println(timesTable + " X " + times + " = "  + (timesTable * times));
        }
        System.out.println("================================================================");

        // Create the whole times table

        for (int  q = 1; q <=12; q++) {
            for (int r = 1; r <= 12; r++) {
                System.out.println(q + " X " + r + " = " + (q * r));
            }
            System.out.println("-------------------------------------------------------------------------------------------------");
        }

        System.out.println("================================================================");

        // iii. Return Statement
        // is used to exit from the current method
        // flow of control returns to the statement that follows the original method call.
        // to return, simply put the value (or an expression that calculates the value) after the return keyword
        // For example:
        // return count++; or return "Java";
        // the type of data declared by the method must match the type of value returned by the return statement.
        // When a method is declared void, use the form of return that doesn't return a value.
        // For example return;








        System.out.println("================================================================");

        sc.close();
    }
}
