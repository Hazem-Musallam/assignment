package assignment1;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static assignment1.Gender.FEMALE;
import static assignment1.Gender.MALE;
import static java.util.Arrays.asList;


public class AssignmentStreams {

    static Student[] students = new Student[]{
            new Student("Ahmad", 22, MALE, true, asList(Course.MATH, Course.JAVA, Course.ARABIC)),
            new Student("Mohammad", 35, MALE, true, asList(Course.MATH, Course.ARABIC)),
            new Student("Emad", 25, MALE, false, asList(Course.ENGLISH, Course.ARABIC)),
            new Student("Zain", 30, FEMALE, true, asList(Course.ENGLISH, Course.CHEMISTRY)),
            new Student("Heba", 22, FEMALE, false, asList(Course.JAVA, Course.MATH, Course.ENGLISH, Course.CHEMISTRY)),
            new Student("Hazem", 45, MALE, true, asList(Course.JAVA, Course.MATH, Course.ENGLISH, Course.CHEMISTRY))
    };

    public static List<Student> getMaleStudent() {
        //add your implementation here
        //use stream to achieve the result
        return null;
    }

    public static List<Student> getActiveStudent() {
        //add your implementation here
        //use stream to achieve the result
        return null;
    }

    public static List<Student> getStudentsWhoTakeChemistry() {
        //add your implementation here
        //use stream to achieve the result
        return null;
    }

    public static Map<Gender, Map<Boolean, List<Student>>> groupStudentByGenderAndStatus() {
        //add your implementation here
        //use stream to achieve the result
        return null;
    }

    public static Map<Boolean, List<String>> activeAndInactiveGroup() {
        //add your implementation here
        //use stream to achieve the result
        return null;
    }


    public static void main(String[] args) {

    }
}