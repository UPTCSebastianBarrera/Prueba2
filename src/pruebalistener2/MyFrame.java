/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebalistener2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import java.util.Random;


public class MyFrame extends JFrame implements MouseListener{
    
    JLabel object;
    JLabel text;
    JLabel Lose;
    protected int permaCounter;
    int counter;
    ImageIcon loser = new ImageIcon("src/textures/Ramirez.jpg");
    Random random = new Random();
    public MyFrame(int a){
        counter=a;
        permaCounter=a;
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension scSize = tk.getScreenSize();
        int height = scSize.height;
        int width = scSize.width;
        
        this.setTitle("Pointer game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(width/3,height/6, 450,450);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        
        object = new JLabel();
            object.setSize(50,50);
            object.setOpaque(true);
            object.setBackground(Color.WHITE);
            object.setLocation(random.nextInt(384),random.nextInt(361));
            object.addMouseListener(this);
            object.setVisible(true);
        text = new JLabel();
        
            text.setText(String.valueOf(counter));
            text.setLocation(this.getWidth()/2,0 );
            text.setSize(50,30);
            text.setVisible(true);
        Lose = new JLabel();
            Lose.setVisible(false);
            Lose.setBounds(-10, -60, 500, 500);
            Lose.setIcon(loser);
            
            //Lose.setVisible(false);
        
        this.add(Lose);
        this.add(object);
        this.add(text);
        
        this.setVisible(true);
        
        
        
        timer();
        
        if(Integer.parseInt(text.getText())==0){
            Lose.setVisible(true);
        }
        
        
        
        
        /*do{
            try{
                text.setText(String.valueOf(counter));
               Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            counter-=1;
        }while(counter>=0);*/
        
    }
    
    private void timer(){
        while(counter>=0){
           text.setText(String.valueOf(counter));
           try{
               sleep(1000);
           }catch(InterruptedException e){
               e.printStackTrace();
           }
           counter-=1;
        }
    }
    
    @Override
    public void mouseClicked(MouseEvent me) {
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
        object.setLocation(random.nextInt(384),random.nextInt(361));
        counter=permaCounter;
        
        
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    public void setCounter(int a){
        permaCounter = a;
    }
}
