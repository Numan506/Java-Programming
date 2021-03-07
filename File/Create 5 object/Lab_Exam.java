package File;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Lab_Exam {

    public static void StudentInfo() {

        JFrame f = new JFrame("Student From");

        JLabel l1, l2, l3, l4, l5;
        JTextField t1, t2, t3;
        JComboBox j1, j2;
        JButton b1, b2;

        l1 = new JLabel("Name:");
        l1.setBounds(37, 37, 80, 20);
        l2 = new JLabel("Email ID:");
        l2.setBounds(40, 112, 112, 19);
        l3 = new JLabel("Subject:");
        l3.setBounds(40, 186, 37, 27);
        l4 = new JLabel("Batch:");
        l4.setBounds(380, 37, 72, 27);
        l5 = new JLabel("Mobile No:");
        l5.setBounds(350, 112, 56, 28);

        t1 = new JTextField();
        t1.setBounds(140, 47, 120, 39);
        t2 = new JTextField();
        t2.setBounds(150, 120, 130, 30);
        t3 = new JTextField();
        t3.setBounds(450, 120, 130, 30);

        String s1[] = {" ", "CSE", "MATH", "PHY",};
        String s2[]= {" ","41", "42", "43",};

        j1 = new JComboBox(s1);
        j1.setBounds(150, 190, 100, 30);
        j2 = new JComboBox(s2);
        j2.setBounds(490, 50, 140, 30);

        b1 = new JButton("Save");
        b1.setBounds(150, 300, 70, 30);
        b2 = new JButton("close");
        b2.setBounds(420, 300, 70, 30);

        b1.addActionListener((ActionEvent e) -> {
            String s3 = t1.getText();
            String s4 = t2.getText();
            String s5 = j1.getSelectedItem() + "";
            String s6 = j2.getSelectedItem() + "";
            String s7 = t3.getText();
            if (e.getSource() == b1) {
                try {
                    FileWriter w = new FileWriter(
                                    "Lab_Exam.txt", true);
                    w.write(s3 + "\n");
                    w.write(s4 + "\n");
                    w.write(s5 + "\n");
                    w.write(s6 + "\n");
                    w.write(s7 + "\n");
                    w.close();

                } catch (IOException ae) {
                    System.out.println(ae);
                }
            }
            JOptionPane
                    .showMessageDialog(
                            f,
                            "Successfully Saved"
                            + " The Details");
        });

        b2.addActionListener((ActionEvent e) -> {
            f.dispose();
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(j1);
        f.add(l4);
        f.add(j2);
        f.add(l5);
        f.add(t3);
        f.add(b1);
        f.add(b2);
        f.setLayout(null);
        f.setSize(700, 600);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        StudentInfo();
    }
}




