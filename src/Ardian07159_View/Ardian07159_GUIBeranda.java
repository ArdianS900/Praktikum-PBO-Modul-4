package Ardian07159_View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ardian07159_GUIBeranda extends JFrame{
   JLabel top,image,mbr;
   JButton login,reg,update,delete;
   
   public Ardian07159_GUIBeranda(){
       setSize(700, 600);
       setLayout(null);
       getContentPane().setBackground(Color.blue); 
       top = new JLabel("Pendataan Korban Bencana Selamat");
       top.setBounds(110, 50, 650, 50);
       top.setFont(new Font("times new roman",Font.BOLD,30));
       top.setForeground(Color.white);
       add(top);    
       reg = new JButton("daftar");
       reg.setBounds(200, 140, 300, 50);
       reg.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       reg.setBackground(Color.white);
       add(reg);
       login = new JButton("login");
       login.setBounds(200, 200, 300, 50);
       login.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       login.setBackground(Color.yellow);
       add(login); 
       update = new JButton("update");
       update.setBounds(200, 260, 300, 50);
       update.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       update.setBackground(Color.white);
       add(update); 
       delete = new JButton("hapus");
       delete.setBounds(200, 320, 300, 50);
       delete.setFont(new Font("Comic Sans MS",Font.BOLD,20));
       delete.setBackground(Color.yellow);
       add(delete); 
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setLocationRelativeTo(null);
        
        login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        Ardian07159_GUILogin login = new Ardian07159_GUILogin();
                        dispose();                
            }            
        });
        
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        Ardian07159_GUIRegistrasi register = new Ardian07159_GUIRegistrasi();
                        dispose();                
            }            
        });
        
        update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                       Ardian07159_GUIUpdate update = new Ardian07159_GUIUpdate();
                        dispose();                
            }            
        });
        
         delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                      Ardian07159_GUIDelete del = new Ardian07159_GUIDelete();
                        dispose();                
            }            
        });
   }
}
