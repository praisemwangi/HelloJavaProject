public class DecisionControlStructures {
    /**
     * Decision Control Structures
     * <p>
     * These are Java statements that allow us to select and execute specific blocks of code while skipping other sections.
     * <p>
     * They are three types:
     * <p>
     * i. if-statement.
     * ii. if-else statement.
     * iii. if-else-if statement
     */

    public static void main(String[] args) {
        // i. if statement
        // specifies that a statement (or block code) will be executed if and only if a certain boolean statement is true.

        // syntax
        // if (boolean_expression)
        //     statement;

        // or

        // if (boolean_expression) {
        //    statement1;
        //    statement2;

        // where;
        //-> boolean_expression is either a boolean expression or boolean variable.

        // Example:
        int grade = 68;

        // Print congratulations if grade is greater than 60
        if (grade > 60) {
            System.out.println("Congratulations");
        }
        // Print congratulations if grade is greater than 60 and also print you've passed.
        if (grade > 60) {
            System.out.println("Congratualtions");
            System.out.println("You Passed");
        }

        System.out.println("====================================");

        // ii. if-else statement
        // used when we want to execute a certain statement if a condition is true and a different statement if a condition is false.

        // syntax
        // if (boolean_expression) {
        //    statement1;
        //    statement2;
        // } else {
        //    statement3;
        //    statement4;
        // }
        if (grade > 80) {
            System.out.println("Congratulations");
            System.out.println("You Passed");
        } else {
            System.out.println("You failed");
        }

        // iii. if-else-if-else statement
        // The statement in the else clause of an if-else block can be treated as another if-else structures
        // This cascading of structures allow us to make more complex selections.
        // Used to execute multiple courses of action.

        // syntax
        // if (condition1) {
        //    statement will execute if condition1 is true
        // } else if (condition2){
        //    statement will execute if condition1 and condition2 are false and condition3 is true
        // }else {
        //    will execute if all conditions are false
        // }

        // Example:

        // print "Excellent" if grade is greater than 90, "Very Good" if it is greater than 60, otherwise "sorry,you failed".

        if (grade > 90) {
            System.out.println("Excellent");

        } else if (grade > 60) {
            System.out.println("Very Good");

        } else {
            System.out.println("Sorry You failed");
        }

}
}


