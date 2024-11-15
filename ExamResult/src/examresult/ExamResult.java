/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examresult;

import java.util.Scanner;
public class ExamResult {
    public static void main(String[] args) {
    int studentpass = 0,studentfail = 0, numberofstudents;
    
    //kena tambah 
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of student : ");
    numberofstudents = input.nextInt();
    
    //sini option if else
    for (int i= 1; i <= numberofstudents; i++){
        System.out.print("Enter score for student" + i + "(0-100) :");
        int score = input.nextInt();
        
        if (score >= 35){
            studentpass++;
        } else{
            studentfail++;
        }
    }
    System.out.println("Total student who passed : " + studentpass);
    System.out.println("Total Student who fail : " + studentfail);
    
    if (studentpass > (numberofstudents /2)){
        System.out.println("Bonus to Instructor");
    }else{
        System.out.println("No Bonus to Instructor");
    }
    }
}
