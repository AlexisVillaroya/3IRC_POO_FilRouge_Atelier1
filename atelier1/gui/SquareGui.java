package atelier1.gui;

import atelier1.nutsAndBolts.PieceSquareColor;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import atelier1.nutsAndBolts.PieceSquareColor;

/**
 * @author francoiseperrin
 * 
 * Classe d'affichage des carr�s du damier
 * leur couleur est initialis� par les couleurs par d�faut du jeu
 *
 */
class SquareGui extends BorderPane implements CheckersSquareGui {
	private PieceSquareColor squareColor;
	
	public SquareGui(PieceSquareColor squareColor) {
		this.squareColor = squareColor;
		Color color = PieceSquareColor.BLACK.equals(this.squareColor) ? GuiConfig.CASEBLACK : GuiConfig.CASEWHITE;
		this.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
	}
	@Override
	public int getSquareCoord() {
		int index = -1;
		Pane parent = (Pane) this.getParent();
		index = parent.getChildren().indexOf(this);
		return index;
	}

}
