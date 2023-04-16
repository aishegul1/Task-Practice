                           SELECT STUDENT Task
1) As many students as the number of students entered by the user;
2) by getting their name, gender, height and weight information
   using this information to determine the students who will be accepted to the course,

   In determining the students to be admitted to the course,
3) Female students whose height is more than 1.50 m and whose weight is between 50 kg and 70 kg,
4) Male students whose height is more than 1.60 m and whose weight is between 70 kg and 90 kg,
   according to the requirements, and if no student meets these conditions,
   "Unfortunately, no students who meet the course requirements were found."
   Write the code that prints the message to the screen



************************  StudentClass and SelectStudentClass what is their purpose? ******************************

The code defines a Student class with four attributes: name, gender, height, and weight. It has 
a constructor that takes these attributes as parameters and sets them in the object. It also has 
getter methods for all attributes and overrides the toString() method to provide a string representation of the object.

The SelectStudent class uses this Student class to create a list of students. It prompts the user to input the number
of students they want to enter, then asks for each student's name, gender, height, and weight. It creates a Student 
object for each student and adds it to the list.

After creating the list of students, the program selects the students that meet certain criteria using a for-each loop.
It creates a new list called selectedStudents and adds the students that meet the criteria to it. The criteria are as follows:

Female students must have a height greater than 1.50 meters, a weight greater than 50 kg, and a weight less than 70 kg.
Male students must have a height greater than 1.60 meters, a weight greater than 70 kg, and a weight less than 90 kg.
Finally, the program prints out the list of selected students. If no students meet the criteria, it prints a message saying so.

The code also measures the execution time of the loop using the System.nanoTime() method and prints it out.

The SelectStudentLambda class does the same thing as SelectStudent, but it uses lambda expressions and streams to filter 
the list of students. It creates a Stream from the list of students and filters it using lambda expressions to select 
the students that meet the criteria. It then collects the selected students into a new list using the collect() method. 
The program prints out the list of selected students and the execution time, just like the SelectStudent class.


*********************** SelectStudentLambda What is the purpose? **************************
This Java code is designed to input information about a group of students, filter and select the ones that meet
specific criteria, and output the names, genders, heights, and weights of the selected students. The criteria for
selection are different for male and female students, and include height and weight ranges.

The code first prompts the user to input the number of students, and then uses a for loop to prompt the user to input
information about each student, including name, gender, height, and weight. This information is used to create a new
Student object, which is added to an ArrayList of students.

The code then uses functional programming with lambda expressions to filter and select the students that meet the
selection criteria. The stream() method is used to convert the ArrayList of students into a Stream, which can be
filtered and processed using lambda expressions. The concat() method is used to concatenate two streams of
students - one for female students and one for male students - and the filter() method is used to apply the selection
criteria to each student. If a student meets the criteria, they are included in the selectedStudent list.

The code then checks if the selectedStudent list is empty. If it is, the program outputs a message indicating that no
students were found who met the course requirements. If the list is not empty, the program outputs a header and then
iterates through the selectedStudent list using forEach() method to output the information about each selected student.

Finally, the code calculates and outputs the time taken by the functional programming with lambda expressions using
the System.nanoTime() method.

Lambda expressions are a feature of Java 8 and later versions, that allow the use of functional programming techniques
to manipulate collections of data. Lambda expressions are essentially anonymous functions that can be passed as
arguments to other functions or methods. In this code, lambda expressions are used to filter and process the stream of
Student objects in a concise and efficient manner. The lambda expressions are defined using the "->" operator,
which separates the lambda parameters from the lambda body.