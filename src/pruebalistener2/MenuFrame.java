/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalistener2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
public class MenuFrame extends JFrame implements MouseListener{
    
        Font HelveticaBold;
        Font Helvetica;
        protected JTextField answ;
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.DARK_GRAY,1);
        JButton btn1;
        
        protected int DEFAULT=5;
        
        MyFrame fr;
        
    public MenuFrame(){
        
        
        
        
        
        
        try{
            HelveticaBold = Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/Helvetica-Bold.ttf")).deriveFont(15f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/Helvetica-Bold.ttf")));
        }catch(IOException | FontFormatException e){
            
            System.out.println("error de fuente");
        }
        
        try{
            Helvetica = Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/Helvetica.ttf")).deriveFont(15f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/Helvetica.ttf")));
        }catch(IOException | FontFormatException e){
            
            System.out.println("error de fuente");
        }
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension scSize = tk.getScreenSize();
        Image icon = tk.getImage("src/textures/IconRamirez.jpg");
        int height = scSize.height;
        int width = scSize.width;
        
        this.setTitle("Pointer game");
        this.setIconImage(icon);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(width/3,height/6, 450,250);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        
        JLabel txt1= new JLabel();
            txt1.setText("Bienvenido al juego");
            txt1.setBounds(140,30,190,30);
            txt1.setFont(HelveticaBold);
            txt1.setForeground(Color.white);
        JLabel txt2= new JLabel();
            txt2.setText("Escoja un limite de tiempo");
            txt2.setBounds(130,60,190,30);
            txt2.setFont(Helvetica);
            txt2.setForeground(Color.white);
        answ = new JTextField();
            answ.setBounds(165,95,90,25);
            answ.setBackground(Color.DARK_GRAY);
            answ.setForeground(Color.white);
            answ.setBorder(border);
        btn1= new JButton();
            btn1.setText("Jugar");
            btn1.setBackground(Color.DARK_GRAY);
            btn1.setForeground(Color.white);
            btn1.setFont(new Font("HelveticaBold",Font.PLAIN,10));
            btn1.setBounds(175,130,70,25);
            btn1.addMouseListener(this);
        this.add(txt1);
        this.add(txt2);
        this.add(answ);
        this.add(btn1);
    }
    
    

    
    @Override
    public void mouseClicked(MouseEvent me) {
            this.setVisible(false);
            
            fr = new MyFrame(5);
            fr.setVisible(true);
            
    }

    @Override
    public void mousePressed(MouseEvent me) {
            
            
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
