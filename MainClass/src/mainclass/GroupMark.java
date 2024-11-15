/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainclass;
import javax.swing.JOptionPane;
public class GroupMark {
        public void lihat(){
    String firstmark;
    String secondmark;
    int num1, num2, sum;
    
    firstmark = JOptionPane.showInputDialog("Enter 1st Marks");
    
    secondmark = JOptionPane.showInputDialog("Enter 2nd Marks");
    
    num1 = Integer.parseInt(firstmark);
    num2 = Integer.parseInt(secondmark);
    sum = num1 + num2;
    
    JOptionPane.showMessageDialog(null, "The sum of your group marks is "+sum, "Results",     JOptionPane.PLAIN_MESSAGE);
    
    System.exit(0);
        }
}

