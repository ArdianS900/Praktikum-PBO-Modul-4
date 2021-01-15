
package Ardian07159_View;

import Ardian07159_Entity.Ardian07159_StatusEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ardian07159_GUIUpdate extends JFrame{
    JLabel updt;
    JTextField textnikupdate;
    JLabel niklabel;
    JComboBox pilstatus = new JComboBox(Ardian07159_StatusEntity.Status);
    JButton update,back;
    public Ardian07159_GUIUpdate(){
        setSize(500, 500);
        setLayout(null);
        getContentPane().setBackground(Color.pink);
        updt = new JLabel("Update Status");
        updt.setBounds(140, 30, 600, 50);
        updt.setFont(new Font("Eras Demi ITC",Font.BOLD,30));
        updt.setForeground(Color.white);
        add(updt); 
        pilstatus.setBounds(150, 100, 200, 30);
        pilstatus.setFont(new Font("Arial Black",Font.BOLD,13));
        pilstatus.setBackground(Color.yellow);
        add(pilstatus);
        niklabel = new JLabel("NIK");
        niklabel.setBounds(150, 150, 100, 30);
        niklabel.setFont(new Font("Arial Black",Font.BOLD,15));
        add(niklabel);
        textnikupdate = new JTextField();
        textnikupdate.setBounds(150, 190, 200, 30);
        textnikupdate.setFont(new Font("Arial ",Font.PLAIN,13));
        add(textnikupdate);
        update = new JButton("Update");
        update.setBounds(200, 250, 100, 40);
        update.setFont(new Font("Comic Sans MS",Font.BOLD,17));
        update.setBackground(Color.YELLOW);
        add(update);
        back = new JButton("Back");
        back.setBounds(30, 360, 80, 30);
        back.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        back.setForeground(Color.white);
        back.setBackground(Color.red);
        add(back);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        
       back.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
               Ardian07159_GUIBeranda gui = new Ardian07159_GUIBeranda();
            }         
        });
         
          update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                        int statusbaru=pilstatus.getSelectedIndex();
                       Ardian07159_Allobjctrl.korban.update(textnikupdate.getText(),statusbaru);
                        JOptionPane.showMessageDialog(null,"Data Berhasil Di Update ","information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();                        
                       
            }
            
        });
    }
     void kosong(){
        textnikupdate.setText(null);
   }
}
