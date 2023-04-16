package selectstudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectStudentLambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of students.");
        int numStd = input.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i <numStd ; i++) {
            System.out.println("Name: ");
            String name=input.next();
            System.out.println("Gender: ");
            String gender =input.next().toUpperCase().trim().substring(0,1);

            System.out.println("Height: ");
            double height =input.nextDouble();
            System.out.println("Weight: ");
            double weight =input.nextDouble();

            Student student = new Student(name,gender,height,weight);
            students.add(student);
        }//for i
        long time1 = System.nanoTime();
        List <Student> selectedStudent = Stream.concat( students.
                                stream().
                                filter(t->t.getGender().equals("F") && t.getHeight()>1.50 && t.getWeight()>50 && t.getWeight()<70),
                        students.
                                stream().
                                filter(t->t.getGender().equals("M") && t.getHeight()>1.60 && t.getWeight()>70 && t.getWeight()<90)).
                collect(Collectors.toList());

        if(selectedStudent.isEmpty()){
            System.out.println( "Unfortunately, no students were found who met the course requirements.");
        }else{
            System.out.println(" =================== Students Selected to the Course =================");
            selectedStudent.forEach(t-> System.out.println("Name : "+t.getName()+
                    " Gender : "+t.getGender()+
                    " Height: "+t.getHeight()+
                    " Weight :"+t.getWeight()));
        }
        long time2 = System.nanoTime();
        long functionalProgramming = time2-time1;
        System.out.println("functionalProgramming"+ " = " + functionalProgramming /1000+ " nano saniye");// 35146

    }
}

/*

 */