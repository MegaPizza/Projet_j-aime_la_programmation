package joueur;
import java.util.ArrayList;
import carte.Carte;
import carte.ICarte;
import joueur.Heros;

public interface IJoueur {
	public static final int MAX_MANA = 10;
	public static final int TAILLE_DECK = 15;
	void finirTour();
	Carte	getCarteEnJeu(String nomCarte);
	Carte getCarteEnMain(String nomCarteMain);
	Heros getHeros();
	ArrayList<Carte> getJeu();
	ArrayList<Carte> getMain();
	int	getMana();
	String getPseudo(); 
	int	getStockMana();
	void jouerCarte(Carte carte);
	void jouerCarte(ICarte carte, Object cible);
	void perdreCarte(ICarte carte);
	void piocher();
	void prendreTour();
	void utiliserCarte(ICarte carte, Object cible);
	void utiliserPouvoir(Object cible);
}
