package com.Kamwaro.SUfeeds;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame{
    private JButton create;
    private JButton login;
    private JLabel greeting;
    public Home(){
        super("SU Feeds");
        create = new JButton("Create Account");
        create.setPreferredSize(new Dimension(150,25));
        login = new JButton("Login");
        login.setPreferredSize(new Dimension(150,25));
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
                JFrame create_account = new JFrame();
                create_account.setLayout(new FlowLayout());
                create_account.setVisible(true);
                JLabel username = new JLabel("Username");
                create_account.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }
        });
    }
}
