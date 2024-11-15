/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userinfo;

/**
 *
 * @author Irfan Hakimie
 */
import java.awt.*;
import javax.swing.*;

public class UserInfo extends JFrame {
    private final JLabel nameLabel;
    private final JLabel emailLabel;
    private final JTextField nameField;
    private final JTextField emailField;
    private final JRadioButton maleRadio;
    private final JRadioButton femaleRadio;
    private final JRadioButton otherRadio;
    private final JCheckBox sportsCheckBox;
    private final JCheckBox musicCheckBox;
    private final JCheckBox travelCheckBox;
    private final JButton submitButton;
    private final JLabel pictureLabel;

    public UserInfo() {
        super("Personal info je");

        // Set layout to null for absolute positioning
        setLayout(null);

        // Adding a picture (make sure the file path is correct)
        Icon userIcon = new ImageIcon("ImanOP.jpeg");
        pictureLabel = new JLabel("User Picture", userIcon, SwingConstants.CENTER);
        pictureLabel.setBounds(20, 20, 250, 250); // Position the picture at the top
        add(pictureLabel);

        // Name input
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 280, 100, 25); // Adjust y-coordinate to be below the picture
        add(nameLabel);
        
        nameField = new JTextField(20);
        nameField.setBounds(120, 280, 150, 25);
        add(nameField);

        // Email input
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 320, 100, 25); // Adjust y-coordinate
        add(emailLabel);
        
        emailField = new JTextField(20);
        emailField.setBounds(120, 320, 150, 25);
        add(emailField);

        // Gender selection using JRadioButton
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 360, 100, 25); // Adjust y-coordinate
        add(genderLabel);
        
        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(120, 360, 70, 25);
        add(maleRadio);

        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(190, 360, 80, 25);
        add(femaleRadio);

        otherRadio = new JRadioButton("tak sure");
        otherRadio.setBounds(120, 390, 150, 25);
        add(otherRadio);

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);

        // Interests selection using JCheckBox
        JLabel interestsLabel = new JLabel("Interests:");
        interestsLabel.setBounds(20, 430, 100, 25); // Adjust y-coordinate
        add(interestsLabel);

        sportsCheckBox = new JCheckBox("Sports");
        sportsCheckBox.setBounds(120, 430, 80, 25);
        add(sportsCheckBox);

        musicCheckBox = new JCheckBox("Music");
        musicCheckBox.setBounds(120, 460, 80, 25);
        add(musicCheckBox);

        travelCheckBox = new JCheckBox("Travel");
        travelCheckBox.setBounds(120, 490, 80, 25);
        add(travelCheckBox);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(120, 530, 100, 30); // Adjust y-coordinate
        add(submitButton);

        // Set the frame size and make it visible
        setSize(350, 600); // Keep height to accommodate all components
        setVisible(true);
    }

    public static void main(String[] args) {
        UserInfo application = new UserInfo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
