/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package highestaverage;

/**
 *
 * @author Irfan Hakimie
 */
public class Student3 {
    //store student marks
    double mark1;
    double mark2;
    double mark3;

    //differentiate between class attributes and parameters
    //ensured marks entered by user into respective variable
    public Student3(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    //calculate this students average marks
    public double calculateAverage() {
        return (mark1 + mark2 + mark3) / 3;
    }
}

