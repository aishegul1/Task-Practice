package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students");
        int numStd = input.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i <numStd ; i++) {
            System.out.println("Name: ");//enes
            String name=input.next();
            System.out.println("Gender: ");//e
            String gender =input.next().toUpperCase().trim().substring(0,1);

            System.out.println("Height: ");//1.80
            double height =input.nextDouble();
            System.out.println("Weight: ");//80
            double weight =input.nextDouble();

            Student student = new Student(name,gender,height,weight);
            students.add(student);
        }//for i

        List<Student> selectedStudents = new ArrayList<>();
        long time1 = System.nanoTime();
        for (Student student :students ) {
            if (student.getGender().equals("F") && student.getHeight() > 1.50 && student.getWeight() > 50 && student.getWeight() < 70) {
                selectedStudents.add(student);
            } else if (student.getGender().equals("M") && student.getHeight() > 1.60 && student.getWeight() > 70 && student.getWeight() < 90) {
                selectedStudents.add(student);
            }
        }//for each

        System.out.println(" =================== Students Selected to the Course=================");

        if(selectedStudents.size() == 0){
            System.out.println( "Sorry, no students who meet the course requirements were found..");
        }else{
            for (Student student :selectedStudents
            ) {
                System.out.println(student.toString());
            }
        }

        long time2 = System.nanoTime();
        long structuredProgramming = time2-time1;
        System.out.println("functionalProgramming"+ " = " + structuredProgramming /1000+ " nano saniye");//39532

    }
}

