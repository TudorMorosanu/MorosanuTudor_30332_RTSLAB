package Ex3;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;

public class SquarePanel extends JPanel{

    private int width;
    private int height;
    private double ldCornerX;
    private double ldCornerY;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getLdCornerX() {
        return ldCornerX;
    }

    public void setLdCornerX(double ldCornerX) {
        this.ldCornerX = ldCornerX;
    }

    public double getLdCornerY() {
        return ldCornerY;
    }

    public void setLdCornerY(double ldCornerY) {
        this.ldCornerY = ldCornerY;
    }

    public SquarePanel(Window win, Color color){

        this.setBackground(Color.WHITE);

        JLabel square = new JLabel();
        square.setOpaque(true);
        square.setBackground(color);
        square.setBounds(100, 100, 100, 100);
        this.add(square);

        win.add(this);
    }
}
