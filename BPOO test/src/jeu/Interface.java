import javax.swing.JFrame;
import java.awt.Color; 
import javax.swing.JPanel;
 

public class Fenetre extends JFrame {

  public Fenetre(){

    this.setTitle("Ma première fenêtre Java");

    this.setSize(400, 500);//400 de largeur et 500 de longueur 

    this.setLocationRelativeTo(null);//au centre 

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //la croix pour quitter            

   

    setAlwaysOnTop(boolean b):true; //au dessus des autres fenêtres
    
    setResizable(boolean b):true; //autorise le redimensionnement de la fenêtre

    JPanel pan = new JPanel();//Instanciation d'un objet JPanel

    pan.setBackground(Color.BLACK);//Définition de sa couleur de fond       

    this.setContentPane(pan);//On prévient notre JFrame que notre JPanel sera son content pane (ou on mettra les composants)               

    this.setVisible(true);//fenetre visible 
  }

}