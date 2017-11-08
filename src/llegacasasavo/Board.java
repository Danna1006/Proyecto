/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llegacasasavo;


import Aleatorio.Aleatorio;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author DANNA
 */
public class Board extends JPanel implements ActionListener {
    
    private int x;
    private int secuencia;
    private Timer timer;
    private Timer timer2;
    
    

    public Board() {
        
        this.x = 1542;
        this.secuencia=0;
        this.timer = new Timer(10, this);
        this.timer.start();
        
    }
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        int posicion = Aleatorio.numeroA();
        int imagen = Aleatorio.numeroA();
        
        Image calle= loadImage("Calle.jpg");
        g.drawImage(calle, 0, 0,1362, 768 , 0, 0, 1362, 768, this);
        
        if (imagen==0){
            Image ladron = loadImage("thie sprit.jpg");
            g.drawImage(ladron, x , posicion*285,x-180, (posicion*285)+285 ,(this.secuencia*180),0,(this.secuencia*180)+180, 285, this);
        }if (imagen==1){
            Image mierda = loadImage("mierda.jpeg");
            g.drawImage(mierda, x ,posicion*212,x-244, (posicion*212)+212,(this.secuencia*244),0,(this.secuencia*244)+244, 212, this);
        }else{
            Image hueco = loadImage("hueco.jpg");
            g.drawImage(hueco, x , posicion*200,x-200,(posicion*200)+200,(this.secuencia*200),0,(this.secuencia*200)+200, 200, this);
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x -= 5;
        //if(this.secuencia == 5){
          //this.secuencia = ;
        //}else 
            //this.secuencia--;
       
       repaint(); 
    }

    
    
    
    
    
}
