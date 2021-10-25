package atelier1.gui;

import atelier1.nutsAndBolts.PieceSquareColor;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * @author francoise.perrin
 * 
 * Cette classe permet de donner une image aux pi�ces
 *
 */

public class PieceGui extends ImageView implements CheckersPieceGui {
	private PieceSquareColor squareColor;
	
	public PieceGui(Image image, PieceSquareColor squareColor) {
		this.squareColor = squareColor;
		if(squareColor != null) {
			this.setImage(image);
		}
		
	}
	 
	
	@Override
	public void promote(Image image) {
		
		// ToDo Atelier 2, utile pour Atelier 3
		
	}

	@Override
	public boolean hasSameColorAsGamer(PieceSquareColor gamerColor) {

		// ToDo Atelier 2, utile pour Atelier 4
		
		return false; // � changer 
	}
	
}