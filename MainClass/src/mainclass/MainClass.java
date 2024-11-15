/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass;

/**
 *
 * @author Irfan Hakimie
 */
public class MainClass {
    public static void main(String[] args) {
       GradeBook myGradeBook=new GradeBook(); //class name=gradebook ,object = myGradeBook
       myGradeBook.displayMessage(); //call method balik
       GradeList myGradeList=new GradeList(); //call method jugak
       myGradeList.Tunjuk();
       GroupMark myGroupMark=new GroupMark();
       myGroupMark.lihat();
       
    }
}

