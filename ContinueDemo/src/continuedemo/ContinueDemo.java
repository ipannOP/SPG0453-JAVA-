/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continuedemo;

/**
 *
 * @author Irfan Hakimie
 */
/*
public class ContinueDemo {
    public static void main(String[] args) {
        String findMe = "she sell the seashell by the seashore";
        int max = findMe.length();
        int numPs = 0;
        for (int i=0; i<max; i++){//interested only in p's
            if(findMe.charAt(i)!='s')
                continue;
            //process p's
            numPs++;}
        System.out.println("Found"+numPs +"s's in the string.");
        System.out.println (max);
        }
        
    }
    */
public class ContinueDemo {
    public static void main(String[] args) {
        String findMe = "she sell the seashell by the seashore";
        int max = findMe.length();
        int numSs = 0;
        int numEs = 0;
        
        for (int i = 0; i < max; i++) {
            char currentChar = findMe.charAt(i);

            // Process 's'
            if (currentChar == 's') {
                numSs++;
            }
            
            // Process 'e'
            if (currentChar == 'e') {
                numEs++;
                
            }
        }

        System.out.println("Found " + numSs + " 's' in the string.");
        System.out.println("Found " + numEs + " 'e' in the string.");
        System.out.println("The string length is " + max);
    }
}

