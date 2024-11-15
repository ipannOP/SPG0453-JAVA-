/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package highestaverage;

/**
 *
 * @author Irfan Hakimie
 */
import java.util.Scanner;

public class StudentManager {
    //call variable and object
     Student1 student1;
     Student2 student2;
     Student3 student3;

    public StudentManager() {
        Scanner read = new Scanner(System.in);
//print out instruction
        System.out.println("Enter marks for Student 1 (3 subjects): ");
        student1 = new Student1(read.nextDouble(), read.nextDouble(), read.nextDouble());

        System.out.println("Enter marks for Student 2 (3 subjects): ");
        student2 = new Student2(read.nextDouble(), read.nextDouble(), read.nextDouble());

        System.out.println("Enter marks for Student 3 (3 subjects): ");
        student3 = new Student3(read.nextDouble(), read.nextDouble(), read.nextDouble());
    }

    public void displayResults() { //calculate average and store in "avg"
        double avg1 = student1.calculateAverage();
        double avg2 = student2.calculateAverage();
        double avg3 = student3.calculateAverage();
        
//Display calculated average mark
        System.out.printf("\nAverages:");
        System.out.printf("\nStudent 1 Average:%.2f%n " , avg1);
        System.out.printf("\nStudent 2 Average:%.2f%n " , avg2);
        System.out.printf("\nStudent 3 Average:%.2f%n " , avg3);

//compare the average and show the highest average mark
        double highestAverage = Math.max(avg1, Math.max(avg2, avg3));
        System.out.printf("\nThe highest average is: %.2f%n" , highestAverage);
    }
}

