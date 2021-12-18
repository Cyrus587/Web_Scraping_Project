
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrape;

import javax.swing.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static scrape.gui.frame;
import static scrape.gui.option_one_label;

public abstract class gui extends JFrame implements ActionListener {

    static JButton option_one = new JButton("Sports News");
    static JButton option_two = new JButton("US News");
    static JButton option_three = new JButton("World News");
 
    static JLabel label = new JLabel("Latest news From Bing News");
    static news_scrape sports = new news_scrape("https://www.bing.com/news/search?q=Sports&nvaug=%5bNewsVertical+Category%3d%22rt_Sports%22%5d&FORM=NSBABR");
    static news_scrape usa = new news_scrape("https://www.bing.com/news/search?q=U.S.&nvaug=%5bNewsVertical+Category%3d%22rt_US%22%5d&FORM=NSBABR");
    static news_scrape world = new news_scrape("https://www.bing.com/news/search?q=World&nvaug=%5bNewsVertical+Category%3d%22rt_World%22%5d&FORM=NSBABR");
    
    
    
    
    static JLabel option_one_label = new JLabel(sports.toString());
    static JLabel option_two_Label = new JLabel(usa.toString());
    static JLabel option_three_Label = new JLabel(world.toString());
    


    static JFrame frame = new JFrame();
    static JPanel panel = new JPanel();
    static JTextArea area_one = new JTextArea();
    
    
    

 
    
  public gui(){ 
        
        //set the frame 
        frame.setSize(500, 400);
        frame.setLocation(900, 520);
        frame.setVisible(true);
        frame.getContentPane();
        panel.setLayout(null);
        
        
        
        //make the intial label 
        //label = new JLabel("Latest news");
        label.setFont(new Font("Verdana", Font.PLAIN, 18));
        Dimension size = label.getPreferredSize();
        label.setBounds(200, 20, size.width, size.height);
        
        option_one_label.setFont(new Font("Verdana", Font.PLAIN, 10));
        Dimension size1 = option_one_label.getPreferredSize();
        option_one_label.setBounds(200, 100, size1.width, size1.height);
        
        
        option_two_Label.setFont(new Font("Verdana", Font.PLAIN, 10));
        Dimension size2 = option_two_Label.getPreferredSize();
        option_two_Label.setBounds(200, 100, size2.width, size2.height);
        
        option_three_Label.setFont(new Font("Verdana", Font.PLAIN, 10));
        Dimension size3 = option_three_Label.getPreferredSize();
        option_three_Label.setBounds(200, 100, size3.width, size3.height);
        panel.add(label);
        panel.add(option_one_label);
        panel.add(option_two_Label);
        panel.add(option_three_Label);
       option_one_label.setVisible(false);
       option_two_Label.setVisible(false);
       option_three_Label.setVisible(false);
       
        //add the 1st button 
        option_one.setFont(new Font("Verdana", Font.PLAIN, 9));
        option_one.setBounds(30, 30, 50, 50);
        Dimension button_size = option_one.getPreferredSize();
        option_one.setBounds(20, 60, button_size.width, button_size.height);
        //panel.setLayout(null);
        panel.add(option_one);//current code
        //frame.add(option_one);//last code
        
        //add the second button 
        option_two.setFont(new Font("Verdana", Font.PLAIN, 9));
        option_two.setBounds(30, 30, 50, 50);
        Dimension button_size_two = option_two.getPreferredSize();
        option_two.setBounds(20, 90, button_size_two.width, button_size_two.height);
        //panel.setLayout(null);
        panel.add(option_two);
        //add the third button 
        option_three.setFont(new Font("Verdana", Font.PLAIN, 9));
        option_three.setBounds(30, 30, 50, 50);
        Dimension button_size_three = option_three.getPreferredSize();
        option_three.setBounds(20, 120, button_size_three.width, button_size_three.height);
        //panel_three.setLayout(null);
        panel.add(option_three);
      
        
        option_one.addActionListener((ActionEvent e) -> {
            option_one_label.setVisible(true);
            option_two_Label.setVisible(false);
            option_three_Label.setVisible(false);
//            option_one_label.setFont(new Font("Verdana", Font.PLAIN, 14));
//            Dimension button_size_three1 = option_one_label.getPreferredSize();
//            option_one_label.setBounds(200, 100, button_size_three1.width, button_size_three1.height);
//          //  panel.setLayout(null);
//           label.setVisible(true);
//           
//           frame.add(option_one_label);
//            option_one_label.setVisible(true);
//            area_one.add(option_one_label);
//            area_one.setVisible(true);
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            frame.add(area_one);
//            frame.setSize(500, 300);
//            frame.setVisible(true);
        });
        option_two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                option_one_label.setVisible(false);
                option_two_Label.setVisible(true);
                option_three_Label.setVisible(false);
//                option_two_Label.setFont(new Font("Verdana", Font.PLAIN, 14));
//                Dimension button_size_three1 = option_two_Label.getPreferredSize();
//                option_two_Label.setBounds(200, 100, button_size_three1.width, button_size_three1.height);
//                area_one.setBounds(30, 30, 50, 50);
//                area_one.setLayout(null);
//                frame.add(option_two_Label);
//                area_one.add(option_two_Label);
//                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//                frame.add(area_one);
//                frame.setSize(500, 300);
//                frame.setVisible(true);
            }
        });
        option_three.addActionListener((ActionEvent e) -> {
             option_one_label.setVisible(false);
             option_two_Label.setVisible(false);
             option_three_Label.setVisible(true);
//            option_three_Label.setFont(new Font("Verdana", Font.PLAIN, 14));
//            Dimension button_size_three1 = option_three_Label.getPreferredSize();
//            option_three_Label.setBounds(200, 100, button_size_three1.width, button_size_three1.height);
//            panel.setLayout(null);
//            frame.add(option_three_Label);
//            panel.add(option_three_Label);
//            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//            frame.add(panel);
//            frame.setSize(500, 300);
//            frame.setVisible(true);
        });
        
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(700, 400);
        frame.setVisible(true);
           

    }
}

    



   

    
                 

        //Basic_Scrape scrape = new Basic_Scrape();
       
/**
 *
 */
/**
 *
 */
/* public void J_Button()  {
        JButton option_one = new JButton("Option one");
        option_one.setFont(new Font("Verdana", Font.PLAIN, 9));
        option_one.setBounds(30,30,50,50);
        Dimension button_size = option_one.getPreferredSize();
        option_one.setBounds(20, 60, button_size.width, button_size.height);
        //panel.setLayout(null);
        option_one.addActionListener(this);
        //frame.add(option_one);



        JButton option_two = new JButton("Option two");
        option_two.setFont(new Font("Verdana", Font.PLAIN, 9));
        option_two.setBounds(30,30,50,50);
        Dimension button_size_two = option_two.getPreferredSize();
        option_two.setBounds(20, 90, button_size_two.width, button_size_two.height);
        //panel.setLayout(null);
        //frame.add(option_two);*/
// panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//Label_two.setFont(new Font("Verdana", Font.PLAIN, 15));
/*  JPanel panel = new JPanel();

        frame.add(panel);

        JLabel lbl = new JLabel("Select one of the possible choices and click OK");
        lbl.setVisible(true);

        panel.add(lbl);

        String[] choices = {"CHOICE 1", "CHOICE 2", "CHOICE 3", "CHOICE 4", "CHOICE 5", "CHOICE 6"};

        final JComboBox<String> cb = new JComboBox<String>(choices);

        cb.setVisible(true);
        panel.add(cb);

        JButton btn = new JButton("OK");
        panel.add(btn); */

