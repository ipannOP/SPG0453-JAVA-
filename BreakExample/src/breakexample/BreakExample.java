/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakexample;

/**
 *
 * @author Irfan Hakimie
 */

public class BreakExample {

    public static void main(String[] args) {
        System.out.println("Numbers 1 - 10");
        int i;
        for (var i = 1; i<=10; i++){
        if(i == 5)
            break; //break loop when 5
        System.out.println(i+"\t");}
        System.out.println("Broke out of the loop at i="+i );}}
