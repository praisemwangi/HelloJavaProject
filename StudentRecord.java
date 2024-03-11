public class StudentRecord {
    //Instance Variables
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    // Static/Class variable(s)
    private static int studentCount;

    /**
     *
     * changes the name of the student (Mutator method)
     * @param
     */
    public String getName(){
    return name;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    public void setName(String temp) {
        name = temp;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public String getAddress() {return address;}

    public void setAddress(String temp) {name = temp;}

    public int  getAge() {return age;}

    public void setAge(int temp) {
    }

    public void print(String temp){
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name: " + name);
        System.out.println("Math Grade: " + mGrade);
        System.out.println("English Grade: " + eGrade);
        System.out.println("Science Grade: " + sGrade);
    }


    // we'll add more code here
}

