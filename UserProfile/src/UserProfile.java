import java.util.Scanner;

public class UserProfile {
    public static void main (String[] args) {
       String name;
        int age;
        String hobby;
        String favouritefood;
        Scanner read = new Scanner(System.in);
        
        //Reads a single line from the console
        //and stores into name variable
     System.out.print("Enter your name: ");
        name = read.nextLine();
        
        //Reads a integer from the console
        //and stores into age variable
     System.out.print("Enter your age: ");
       age=read.nextInt();
       
       //panggil library baca balik string
       read.nextLine();
       
     System.out.print("enter your hobby :");
       hobby =read.nextLine();
       
     System.out.print("enter your favourite food :");
       favouritefood =read.nextLine();
       
        read.close();
        
        //Prints name and age to the console
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Hobby : " +hobby);
        System.out.println("Favourite Food : "+favouritefood);
         }}

