import javax.swing.JFrame;
 
public class Test {
  public static void main(String[] args){

    JFrame fenetre = new JFrame();
                
    //titre pour notre fen�tre
    fenetre.setTitle("Ma premi�re fen�tre Java");
    //D�finit sa taille : 400 pixels de large et 400 pixels de haut
    fenetre.setSize(400, 400);
    //position au centre
    fenetre.setLocationRelativeTo(null);
    //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //rendre visible        
    fenetre.setVisible(true);
  }       
}