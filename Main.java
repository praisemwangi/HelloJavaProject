public class Main {
    // use this to run StudentRecord class

    public static void main(String[] args) {
        // create three objects for student record class
        StudentRecord praiseRecord = new StudentRecord();
        StudentRecord ianRecord = new StudentRecord();
        StudentRecord lisaRecord = new StudentRecord();

        // set the names of the students
        praiseRecord.setName("Praise");
        ianRecord.setName("Ian");
        lisaRecord.setName("Lisa");


        System.out.println(praiseRecord.getName());

        // print number of students



        System.out.println("Count =  " + StudentRecord.getStudentCount());

        // set info for student1
        praiseRecord.setAddress("Nairobi");
        praiseRecord.setName("Praise");
        praiseRecord.setAge(Integer.parseInt("19"));
        praiseRecord.setMathGrade
    }
}
