/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visual;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
/**
 *
 * @author ADMIN
 */
public class DesktopConFondo extends JDesktopPane{
    private Image imagen;

    public DesktopConFondo() {
        imagen = new ImageIcon(
                getClass().getResource("/img/logo.jpg")
        ).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(
                imagen,
                0,
                0,
                getWidth(),
                getHeight(),
                this
        );
    }
}
