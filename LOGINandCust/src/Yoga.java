

import javax.swing.*; 


import java.awt.*; 
import java.awt.Image; 
import java.awt.event.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.awt.print.*; 
import java.awt.print.*;
import java.io.*; 
import java.io.IOException; 
  
// Creating the class 
public class Yoga extends JFrame { 
  
    JLabel l1, l2, l3, l4, 
        l5, l6, l7, l8, 
        l9, l10, l12, l11, l15; 
  
    JTextField tf1, tf2, tf3, 
        tf4, tf5, tf6, tf9, 
        tf10; 
  
    JTextArea area2, area1; 
  
    JRadioButton rb1, rb2, rb3, 
        rb4, rb5, rb6, 
        rb7, rb8; 
  
    JFileChooser f1; 
  
    // Default constructor to 
    // initialize the parameters 
    Yoga() 
    {
    	getContentPane().setBackground(Color.BLACK);
  
        l1 = new JLabel("Choose A Yoga Package");
        l1.setBounds(550, 28, 250, 20);
        l1.setFont(new Font("Tahoma", Font.BOLD, 12));
        l1.setBackground(new Color(192, 192, 192));
        l1.setForeground(Color.WHITE);
  
        l2 = new JLabel( 
            "First Name :"); 
        l2.setBounds(10, 50, 250, 20);
        l2.setFont(new Font("Tahoma", Font.BOLD, 12));
        l2.setForeground(Color.WHITE);
  
        tf1 = new JTextField();
        tf1.setBounds(250, 51, 250, 20);
  
        l3 = new JLabel( 
            "Last Name : "); 
        l3.setBounds(10, 125, 250, 20);
        l3.setForeground(Color.WHITE);
        l3.setFont(new Font("Tahoma", Font.BOLD, 12));
  
        tf2 = new JTextField();
        tf2.setBounds(250, 126, 250, 20);
  
        l4 = new JLabel("Membership Num :"); 
        l4.setBounds(10, 194, 250, 20);
        l4.setForeground(Color.WHITE);
        l4.setFont(new Font("Tahoma", Font.BOLD, 12));
  
        tf3 = new JTextField();
        tf3.setBounds(250, 195, 250, 20);
  
        l5 = new JLabel("Email ID:"); 
        l5.setBounds(10, 250, 250, 20);
        l5.setFont(new Font("Tahoma", Font.BOLD, 12));
        l5.setForeground(Color.WHITE);
  
        tf4 = new JTextField();
        tf4.setBounds(250, 251, 250, 20);
  
        l6 = new JLabel("Contact Number:"); 
        l6.setBounds(10, 320, 250, 20);
        l6.setFont(new Font("Tahoma", Font.BOLD, 12));
        l6.setForeground(Color.WHITE);
  
        tf5 = new JTextField();
        tf5.setBounds(250, 321, 250, 20);
  
        l7 = new JLabel("Address:"); 
        l7.setBounds(10, 381, 250, 20);
        l7.setFont(new Font("Tahoma", Font.BOLD, 12));
        l7.setForeground(Color.WHITE);
  
        area1 = new JTextArea();
        area1.setBounds(250, 380, 250, 90);
  
        l9 = new JLabel("Gender:"); 
        l9.setBounds(50, 500, 250, 20);
        l9.setForeground(Color.WHITE);
        l9.setFont(new Font("Tahoma", Font.BOLD, 12));
  
        JRadioButton r5 
            = new JRadioButton(" Male"); 
        r5.setBounds(250, 500, 100, 30);
        JRadioButton r6 
            = new JRadioButton(" Female");
        r6.setBounds(350, 500, 100, 30);
  
        ButtonGroup bg = new ButtonGroup(); 
        bg.add(r5); 
        bg.add(r6); 
  
        l10 = new JLabel("Nationality:"); 
        l10.setBounds(50, 550, 250, 20);
        l10.setFont(new Font("Tahoma", Font.BOLD, 12));
        l10.setForeground(Color.WHITE);
  
        tf6 = new JTextField();
        tf6.setBounds(250, 550, 250, 20);
  
        l11 = new JLabel( 
            "Membership Payment"); 
        l11.setBounds(50, 600, 250, 20);
        l11.setBackground(Color.WHITE);
        l11.setFont(new Font("Tahoma", Font.BOLD, 12));
        l11.setForeground(Color.WHITE);
  
        String language[] 
            = { "2016", "2015", "2014" }; 
  
        final JComboBox cb1 
            = new JComboBox(language); 
        cb1.setBounds(250, 600, 90, 20);
        cb1.setBackground(Color.GRAY);
        cb1.setForeground(Color.BLACK);
        cb1.setModel(new DefaultComboBoxModel(new String[] {"Select one", "Monthly", "Annually", "Yearly"}));
  
        l12 = new JLabel( 
            "Yoga experience before"); 
        l12.setBounds(50, 650, 250, 20);
        l12.setBackground(Color.WHITE);
        l12.setFont(new Font("Tahoma", Font.BOLD, 12));
        l12.setForeground(Color.WHITE);
  
        ImageIcon i2 = new ImageIcon("2.png"); 
        JLabel l15 
            = new JLabel("", i2, JLabel.CENTER);
        l15.setBounds(900, 50, 600, 200);
  
        final JComboBox cb2 
            = new JComboBox(); 
        cb2.setBounds(250, 650, 90, 20);
        cb2.setForeground(Color.BLACK);
        cb2.setBackground(Color.GRAY);
        cb2.setModel(new DefaultComboBoxModel(new String[] {"Select one", "Yes ", "No"}));
        l8 = new JLabel( 
            "Package offered here on :"); 
        l8.setBounds(830, 81, 250, 20);
        l8.setFont(new Font("Tahoma", Font.BOLD, 11));
        l8.setForeground(Color.WHITE);
  
        rb1 = new JRadioButton("Stress Relief");
        rb1.setBounds(550, 76, 100, 30);
  
        rb2 = new JRadioButton("Back Pain");
        rb2.setBounds(652, 76, 100, 30);
  
        ButtonGroup bg1 = new ButtonGroup(); 
  
        bg1.add(rb1); 
        bg1.add(rb2); 
  
        rb3 = new JRadioButton("Obesity");
        rb3.setBounds(550, 121, 100, 30);
  
        rb4 = new JRadioButton("Insomnia");
        rb4.setBounds(652, 121, 100, 30);
  
        ButtonGroup bg2 = new ButtonGroup(); 
        bg2.add(rb3); 
        bg2.add(rb4); 
  
        String languages[] 
            = { "CSE", "ECE", "EEE", 
                "CIVIL", "MECH" }; 
        final JComboBox cb 
            = new JComboBox(languages); 
        cb.setBounds(860, 112, 90, 20);
        cb.setModel(new DefaultComboBoxModel(new String[] {"Select one", "5 days", "Sat&Sun", "Twice in week", "Twice in month"}));
  
        final JLabel label 
            = new JLabel(); 
        label.setBounds(550, 350, 602, 30);
        label.setForeground(Color.WHITE);
        JButton b = new JButton("Show");
        b.setBounds(937, 246, 80, 30);
  
        //ArrayList
        final DefaultListModel<String> li1 
            = new DefaultListModel<>(); 
  
        li1.addElement("Stress Relief(Yes, Moderate, Severe)"); 
        li1.addElement("Back Pain(Yes, Moderate, Severe)"); 
        li1.addElement("Insomnia(Yes, Moderate, Severe)"); 
        li1.addElement("Obesity(Yes, Moderate, Severe)"); 
        li1.addElement("Blood Pressure(Yes, Moderate, Severe)"); 
  
        final JList<String> list1 
            = new JList<>(li1);
        list1.setBounds(586, 214, 125, 125);
  
        DefaultListModel<String> li2 
            = new DefaultListModel<>(); 
  
        li2.addElement( 
            "Attend(Yes, 5days, Attend)"); 
        li2.addElement( 
            "Attend(Yes, Sat&Sun, Attend)"); 
        li2.addElement( 
            "Attend(Yes, Depends, Attend)"); 
        li2.addElement( 
            "Attend(Yes, twice in week, Attend)"); 
        li2.addElement( 
            "Attend(Yes, twice in month, Attend)"); 
  
        final JList<String> list2 
            = new JList<>(li2);
        list2.setBounds(750, 214, 125, 125);
  
        JButton Receipt 
            = new JButton("Generate Receipt");
        Receipt.setBounds(561, 416, 150, 30);
        JButton b2 = new JButton("Reset");
        b2.setBounds(721, 416, 150, 30);
        JButton Print = new JButton("Print");
        Print.setBounds(881, 416, 150, 30);
  
        area2 = new JTextArea();
        area2.setBounds(571, 457, 450, 240);
        getContentPane().setLayout(null);
  
        getContentPane().add(l1); 
        getContentPane().add(l2); 
        getContentPane().add(l3); 
        getContentPane().add(l4); 
        getContentPane().add(l5); 
        getContentPane().add(l6); 
        getContentPane().add(l7); 
        getContentPane().add(l8); 
        getContentPane().add(l9); 
        getContentPane().add(l10); 
        getContentPane().add(l11); 
        getContentPane().add(l12);
        getContentPane().add(tf1); 
        getContentPane().add(tf2); 
        getContentPane().add(tf3); 
        getContentPane().add(tf4); 
        getContentPane().add(tf5); 
        getContentPane().add(tf6);
        getContentPane().add(area1); 
        getContentPane().add(area2); 
        getContentPane().add(l15); 
        getContentPane().add(rb1); 
        getContentPane().add(rb2); 
        getContentPane().add(rb3); 
        getContentPane().add(rb4); 
        getContentPane().add(r5); 
        getContentPane().add(r6); 
        getContentPane().add(cb); 
        getContentPane().add(cb1); 
        getContentPane().add(cb2); 
        getContentPane().add(list1); 
        getContentPane().add(list2); 
        getContentPane().add(b); 
        getContentPane().add(label); 
        getContentPane().add(Receipt); 
        getContentPane().add(b2); 
        getContentPane().add(Print);
        
        JRadioButton rb8 = new JRadioButton("Blood Pressure");
        rb8.setBounds(550, 162, 125, 23);
        getContentPane().add(rb8);
  
        b.addActionListener(new ActionListener() { 
  
            // Method to display the data 
            // entered in the text fields 
            public void actionPerformed(ActionEvent e) 
            { 
                String data = ""; 
                if (list1.getSelectedIndex() != -1) { 
                    data = "You had selected the Package:"
                           + list1.getSelectedValue(); 
                    label.setText(data); 
                } 
                if (list2.getSelectedIndex() != -1) { 
                    data += " and Attend on "
                            + "when: "; 
  
                    for (Object frame : 
                         list2.getSelectedValues()) { 
                        data += frame + " "; 
                    } 
                } 
                label.setText(data); 
            } 
        }); 
  
        // Reset the text fields 
        b2.addActionListener( 
            new ActionListener() { 
                public void actionPerformed( 
                    ActionEvent e) 
                { 
                    area2.setText(""); 
                    area1.setText(" "); 
                    tf1.setText(""); 
                    tf2.setText(""); 
                    tf3.setText(""); 
                    tf4.setText(""); 
                    tf5.setText(""); 
                    tf6.setText(" "); 
                } 
            }); 
  
        // Implementing the Print action 
        Print.addActionListener( 
            new ActionListener() { 
                public void actionPerformed( 
                    ActionEvent e) 
                { 
                    try { 
                        area2.print(); 
                    } 
                    catch (java.awt.print 
                               .PrinterException a) { 
                        System.err.format( 
                            "No Printer Found", 
                            a.getMessage()); 
                    } 
                } 
            }); 
  
        // Generating the receipt 
        Receipt.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) 
            
            { 
  
                area2.setText( 
                    "--------------------------------"
                    + "-----------CONFIRMATION RECEIPT----"
                    + "--------------------------"
                    + "--------------------------"
                    + "-------------------\n"); 
  
                area2.setText(area2.getText() 
                              + "First Name: "
                              + tf1.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Last Name: "
                              + tf2.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Membership Number: "
                              + tf3.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Email ID: "
                              + tf4.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Contact Number: "
                              + tf5.getText() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "Attend days selection: "
                              + cb.getSelectedItem() 
                                    .toString() 
                              + "\n"); 
  
                if (rb1.isSelected()) { 
                    area2.setText(area2.getText() 
                                  + "Wants to Join in "
                                  + "Stress Relief "); 
                } 
                if (rb2.isSelected()) { 
                    area2.setText(area2.getText() 
                                  + "Wants to Join in "
                                  + "Back Pain "); 
                } 
                if (rb3.isSelected()) { 
                    area2.setText(area2.getText() 
                                  + "Wants to Join in "
                                  + "Obesity \n"); 
                } 
                if (rb4.isSelected()) { 
                    area2.setText(area2.getText() 
                                  + "Wants to Join in "
                                  + "Insomnia \n"); 
                } 
                if (rb8.isSelected()) { 
                    area2.setText(area2.getText() 
                                  + "Wants to Join in "
                                  + "Blood Pressure \n");   
                } 
                area2.setText(area2.getText() 
                              + " Had chosen: "
                              + list1.getSelectedValue() 
                                    .toString() 
                              + "\n"); 
                area2.setText(area2.getText() 
                              + "  Had chosen: "
                              + list2.getSelectedValue() 
                                    .toString() 
                              + "\n"); 
  
                int index2 = list2.getSelectedIndex(); 
                if (index2 == 0) { 
                    area2.setText(area2.getText() 
                                  + "                    "
                                  + "Total amount to be "
                                  + "paid is RM 399   \n"); 
                } 
  
                if (index2 == 1) { 
                    area2.setText(area2.getText() 
                                  + "                    "
                                  + "Total amount to be paid "
                                  + "is RM 499   \n"); 
                } 
  
                if (index2 == 2) { 
                    area2.setText(area2.getText() 
                                  + "                    "
                                  + "Total amount to be paid "
                                  + "is RM 399  \n"); 
                } 
  
                if (index2 == 3) { 
                    area2.setText(area2.getText() 
                                  + "                    "
                                  + "Total amount to be paid "
                                  + "is RM 499   \n"); 
                } 
  
                if (index2 == 4) { 
                    area2.setText(area2.getText() 
                                  + "                    "
                                  + "Total amount to be paid "
                                  + "is RM 399   \n"); 
                } 
  
                if (e.getSource() == Receipt) { 
                    try { 
                        FileWriter fw 
                            = new FileWriter( 
                                "java.txt", true); 
                        fw.write(area2.getText()); 
                        fw.close(); 
                    } 
                    catch (Exception ae) { 
                        System.out.println(ae); 
                    } 
                } 
  
                JOptionPane.showMessageDialog( 
                    area2, "DATA SAVED SUCESSFULLY"); 
                
                
            }; 
        }); 
        addWindowListener( 
            new WindowAdapter() { 
                public void windowClosing( 
                    WindowEvent we) 
                { 
                    dispose(); 
                } 
            }); 
        setSize(1178, 755);
        setVisible(true); 
        setBackground(Color.BLACK); 
    } 
    public static void main(String[] args) 
    { 
        new Yoga(); 
    } 
} 
