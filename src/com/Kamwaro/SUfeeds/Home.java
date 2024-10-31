package com.Kamwaro.SUfeeds;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.Kamwaro.SUfeeds.test_db;

public class Home extends JFrame{
    private JButton create;
    private JButton login;
    private JLabel greeting;
    private JPanel panel;
    public Home(){
        super("SU Feeds");
        create = new JButton("Create Account");
        create.setPreferredSize(new Dimension(150,25));
        login = new JButton("Login");
        login.setPreferredSize(new Dimension(180,25));
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridy=0;
        greeting = new JLabel("Hello and Welcome to SU Feeds. What would you like to do?");
        add(greeting, gbc);
        gbc.gridy = 1;
        add(create,gbc);
        gbc.gridy+=2;
        add(login,gbc);




        create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Stores the entered values in a string
                String username = JOptionPane.showInputDialog("Enter your username");
                String password = JOptionPane.showInputDialog("Enter your password");
                test_db.addUser(username, password);
                JOptionPane.showMessageDialog(null, "User added successfully");






            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = JOptionPane.showInputDialog("Enter your username");
                String password = JOptionPane.showInputDialog("Enter your password");
            }
        });
    }
}
