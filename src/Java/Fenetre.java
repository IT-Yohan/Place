package Java;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	public Fenetre() {
		
    JFrame fenetre = new JFrame();
    			
    fenetre.setTitle("Place - Connexion"); //D�finit un titre pour notre fen�tre
    fenetre.setSize(1400, 800); //D�finit sa taille : 400 pixels de large et 100 pixels de haut		
    fenetre.setLocationRelativeTo(null); //Nous demandons maintenant � notre objet de se positionner au centre
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Termine le processus lorsqu'on clique sur la croix rouge
    fenetre.setVisible(true); //Et enfin, la rendre visible  
    
    JPanel Formulaire = new JPanel(); // Cr�ation du JPanel n�c�ssaire � l'affichage des trucs 
    
    JTextField container = new JTextField(); // cr�ation du formulaire
	Formulaire.setColumns(10); 
	container.add(Formulaire); // on add le form au jpanel
	}
	
}