import model.Figure;
import model.Coord;
import ui.Window;

import javax.swing.*;

public class Tetris {
    public static void main(String[] args){
        Window window = new Window();
        javax.swing.SwingUtilities.invokeLater(window);
        window.addFigure();
    }
}
