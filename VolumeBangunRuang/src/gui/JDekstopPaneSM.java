/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import javax.swing.JDesktopPane;

/**
 *
 * @author Andik S
 */
public class JDekstopPaneSM extends JDesktopPane{
private static final Color BACKGROUND = Color.WHITE;
    private static final Color BACKGROUND_2 = Color.BLUE;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();
        
        int midY = getHeight();
        Paint topPaint = new GradientPaint(0, 0, BACKGROUND,
                0, midY, BACKGROUND_2);
        graphics.setPaint(topPaint);
        graphics.fillRect(0, 0, getWidth(), midY);
        graphics.dispose();
        
    }
}
