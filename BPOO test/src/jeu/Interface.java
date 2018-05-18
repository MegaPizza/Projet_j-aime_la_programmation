import javax.swing.JFrame;
import java.awt.Color; 
import javax.swing.JPanel;
 

public class Fenetre extends JFrame {

  public Fenetre(){

    this.setTitle("Ma premi�re fen�tre Java");

    this.setSize(400, 500);//400 de largeur et 500 de longueur 

    this.setLocationRelativeTo(null);//au centre 

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //la croix pour quitter            

   

    setAlwaysOnTop(boolean b):true; //au dessus des autres fen�tres
    
    setResizable(boolean b):true; //autorise le redimensionnement de la fen�tre

    JPanel pan = new JPanel();//Instanciation d'un objet JPanel

    pan.setBackground(Color.BLACK);//D�finition de sa couleur de fond       

    this.setContentPane(pan);//On pr�vient notre JFrame que notre JPanel sera son content pane (ou on mettra les composants)               

    this.setVisible(true);//fenetre visible 
  }

}