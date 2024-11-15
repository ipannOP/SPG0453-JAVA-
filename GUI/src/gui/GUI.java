/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

/**
 *
 * @author Irfan Hakimie
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JButton plainButton;
    private JButton fancyButton;
    private JButton button1, button2;
    private JTextField TextA;
    private JTextArea Textbox1;
     private JRadioButton b1, b2, b3;
     private JCheckBox cb1, cb2 ;
     private JComboBox ComboBox;

    public GUI(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
       label1 = new JLabel("Onic");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(275,200);
       setVisible(true);
       Icon rabbit = new ImageIcon("kucen.jpeg");
label2 = new JLabel("Kalah ke tu", rabbit,SwingConstants.LEFT);
label2.setToolTipText("This is an animated rabbit");
container.add(label2); //gambar

textField1 = new JTextField(5); //textbox
container.add(textField1);

plainButton = new JButton("TEKAN SINI"); //Plain button
container.add(plainButton);

Icon bug1 = new ImageIcon("kucen.jpeg");
fancyButton = new JButton("Fancy button", bug1);
container.add(fancyButton);  //fancy button

 
 Icon drink1 = new ImageIcon("milo.gif");
 button1 = new JButton("Milo", drink1);
 button2 = new JButton("Nescafe");
 button1.setSize(100,40); button2.setSize(100,110);
 button1.setLocation(20,20); button2.setLocation(50,50);
 add(button1); add(button2);
 
  
 TextA = new JTextField ("Key in here"); //coloured text boxt
 TextA.setSize(100,20);
 TextA.setLocation(20,20);
 TextA.setBackground(Color.yellow);
 TextA.setForeground(Color.BLUE);
 TextA.setFont(new Font("Courier",Font.ITALIC,15));
 add(TextA);

 
 Textbox1 = new JTextArea ("Multiple line"); //Text area
 Textbox1.setSize(100,200);
 Textbox1.setLocation(20,20);
 Textbox1.setBackground(Color.PINK);
 Textbox1.setForeground(Color.DARK_GRAY);
 Textbox1.setFont(new
 Font("Bookman",Font.TRUETYPE_FONT,16));
 add(Textbox1);
 
 
 
 b1 =new JRadioButton("michael"); //radio button
 b2 =new JRadioButton("trevor");
 b3 =new JRadioButton("franklin");
 b1.setBounds(20,20,200,50);
 b2.setBounds(20,70,200,50);
 b3.setBounds(20,110,200,50);
 container.add(b1);
 container.add(b2);
 container.add(b3);
 
 
 cb1 = new JCheckBox("yumskie"); //checkbox
 cb2 = new JCheckBox("aimangaiss");
 cb1.setBounds(20,20,200,50);
 cb2.setBounds(20,70,200,50);
 add(cb1);
 add(cb2);
 
  
 String names[]= {"semart","semart oo.gif","semart laa.gif"};
 ComboBox = new JComboBox(names);
 ComboBox.setMaximumRowCount(3);
 ComboBox.setBounds(50,50,100,20);
 add(ComboBox);


    }
    public static void main(String[] args) {
        GUI application = new GUI();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
