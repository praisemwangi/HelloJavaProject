public class OOP {
    /**
     * CREATING YOUR OWN CLASSES
     *
     * At the end of this lecture, you should be able to
     *
     * -> Create your own classes
     * -> Declare properties(fields) and methods(actions) for your classes
     * -> Use the "this" keyword to access instance data
     * ->Create and call "overload" methods
     * -> Use access modifiers to control access to class members
     *
     * Defining your own Class
     * In Java, a class is a blueprint or template for creating objects.
     * It defines the structure and behavior of objects.
     * They encapsulate data(attributes) and methods(functions) that operate on that data.
     * Encapsulation involves bundling the attributes and functions together within a class.
     * Encapsulation helps in hiding the internal implementation details of a class and exposing only necessary functionalities through well-defined interfaces.
     * It also ensures data integrity  and improves code maintainability  by restricting direct access to class members from outside the class.
     * Methods also called member functions define the behavior of an object. They perform operations on the objects data or provide functionality.
     * Both attributes and methods are declared within the class definition.
     */

    // Things to take note of for the syntax defined in this section
    // * -> means that there may be 0 or more occurrences of the line where it was applied.
    // <description> indicates that you have to substitute an actual value for this part instead of typing it as it is.
    // [] -> indicates that this part is optional

    // <modifier>class<name> {
    //    <attributeDeclaration>*
    //    <constructorDeclaration>*
    //    <methodDeclaration>*
    // }

    // where:
    // -> <modifier> is an access modifier, which may be combined with other types modifier

    // Example:
    // public class StudentRecord {

    // }


    // where:
    // public -> means that our class is accessible to other class outside the package.
    // class -> is the keyword used to create a class in java
    // StudentRecord -> is a unique identifier that describes our class.

    // Coding Guidelines

    // i. Think of an appropriate name for your class. Don't just call your class XYZ or ABC or any random names you can think of.
    // ii. Class names starts with a Capital letter - not a requirement, however.
    // iii. The filename of your class must have the SAME NAME as of your class name.

    // Instance Variables Versus Static Variables

    // Instance Variables(Properties) vs Class (static) Variables.

    // Instance Variables
    // Belong to an object instance
    // Value of an object instance is different from the ones of other object instances.

    // Class Variables
    // Variables that belong to the whole class
    // This means that they// where :
    //    // private here means that variables are only accessible within the class. Other objects cannot access these variables directly.
    //
    //    // Methods
    //    // To declare methods, we write
    //
    //    // <modifier> <returnType> <name> (<parameter>*) {
    //    //        <statement>*
    //    //   }
    //
    //    // Where:
    //    // <modifier> - can carry a number of different modifiers
    //    // <returnType> - can be any data type (including void)
    //    // <name> can be any valid identifier
    //    // <Parameter> - <parameter_type><parameter_name>
    //
    //    // Accessor (Getter) Methods
    //    // Used to read values from our class variables ( instance/static).
    //    // Usually written as
    //    // get<NameOfInstanceVariable>
    //    // It also returns a value
    //
    //    // public String getName(){
    //    //      return name
    //    // }
    //
    //
    //    // where:
    //    // public - means that the method can be called from objects outside the class.
    //    // String - is the return type of the method. This means that the method should return a value of type String.
    //    // getName - the name of the method.
    //    // () - this means that our method does not have any parameters.
    //} have the same value for all the object instances in the same class.

    // Instance Variables
    // Declaring Properties (attributes)
    // To declare a certain attribute for our class we write

    // <modifier> <type> <name> [=default_value];
    // Coding Guidelines
    // i. Declare all instance variables right after "public" class.
    // ii. Declare one variable for each line.
    // iii. Used an appropriate data type for each variable you declare.
    // iv. Declare instance variable as private so only class methods can access them directly (encapsulation)



    // Static Variables (class variables)
    // We use the keyword "static" to indicate that a variable is a static variable.


    // Static Methods
    // public static int getStudentCount() {
    //    return studentCount;
    // }

    // Where:
    // static - means that thew method is static and should be called by typing, [Class.MethodName]. For example: in this case, we call the method StudentRecord.getStudentCount()
    //


    // Overloading Methods
    // Method overloading allows a method with the same name but different parameters to have different implementations and return values of different types
    // Can be used when the same operation has different implementations.

    // Always remember that overload methods have the following properties:
    // -> the same method name
    // -> different parameters or different number of parameters
    // -> return types can be different or the same

    // add two methods in StudentRecord class

    // Constructors
    // Constructor Methods
    // Constructors are important in instantiating an object.
    // It is a method where all initializations are placed
    // the following are properties of a constructor
    // -> Constructors have the same name as the class
    // -> A constructor is just like an ordinary method, however only the following information can be placed inside the header of a constructor
    // -> Scope or accessibility  identifier (like public...), constructor's name and parameters if it has any
    // You cannot call a constructor directly, it can only  be called by using the "new" operator during class instantiation.

    // to declare a constructor, we write
    // <modifier> <className> (<parameter(s)) {
    //      <statement>*
    // }

    // Default Constructor (Method)
    // The default constructor (no-arg constructor)
    // -> is the constructor without any parameters
    // if the class does not specify any constructors, then an implicit constructor is created.

    // Example of a Default constructor

    // public Student () {
         // some code here
    // }

    // Overloading Constructor Methods
    // public Student () {
    //      some code here
    // }

    // public Student (String temp) {
    //      this.name = temp;
    // }

    // public Student (String name, String address) {
    //  this.name = name;
    // }


    // public Student ( double mGrade, double eGrade, double sGrade) {
    // mathGrade = mGrade;
    // englishGrade = eGrade;
    // scienceGrade = sGrade;
    // }

    // this constructor call
    // constructors call can be chained, meaning, you can call another constructor from inside another constructor.
    // we can use this() method call for this
    // There are a few things to remember when using the this(), constructor call
    // -> when using the this constructor call, IT MUST OCCUR AS THE FIRST STATEMENT in a constructor
    // -> It can ONLY BE USED IN A CONSTRUCTOR DEFINITION. The this() call then can be followed by any another relevant statements


    // "this" Reference
    // The this reference refers to current object instance itself.
    // used to access the instance variables shadowed by the parameters
    // To use the "this" reference, we type,
    // this.<nameOfInstanceVariable>
    // You can only use the "this" reference for instance variable and Not static or class variables

    // Access Modifiers
    // there are four different types of member access modifiers in Java:
    // i. public (least restrictive)
    // ii. protected
    // iii. default
    // iv. private (Most Restrictive)


    // The first three access modifiers are explicitly written in the code to indicate the access type, for the 3rd one "default", no keyboard is used.

    // i. public accessibility
    // specifies that class members (variables or members) are accessible to anyone, both inside and outside the class and outside the package.
    // Any object that interacts with the class can have access to the public members of the class
    // keyword: public
    // example: public int userAge;, public String userName;

    // ii. protected accessibility
    // specifies that the class members are accessible only to methods in that class and the subclasses of the class.
    // keyword: protected
    //Example: protected String name;

    // iii. default accessibility
    // specifies that only classes in the same package can have access to the class variables and methods
    // no actual keyword for the default modifier - it is applied in the absence of an access modifier
    // Example: String name;

    // iv. private accessibility
    //specifies that the class members are only accessible by the class they are defined in
    // keyword: private
    // example: private int accountNumber;

    // NB:
    // The instance variables of a class should normally be declared  "private", and the class will just provide accessor and mutator methods to these variables


}
