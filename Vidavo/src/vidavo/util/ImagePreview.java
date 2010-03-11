package vidavo.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePreview
extends JPanel
{
    private String m_ImageFile;             // the path and name of the image file to be displayed
    private BufferedImage m_Image;          // instance of the image to be displayed
    private BufferedImage m_ScaledImage;    // scaled instance of the image to be displayed

    /** Creates a new instance of ImagePanel */
    public ImagePreview(String imageFile) {
        if (imageFile == null) throw new NullPointerException("Image file should not be a null value.");
        this.m_ImageFile = imageFile;
        loadImage(m_ImageFile);
    }

    public ImagePreview() {
        super();
    }

    /** Calculate the scale required to correctly fit the image into panel */
     private double GetScale(int panelWidth, int panelHeight, int imageWidth, int imageHeight) {
        double scale = 1;
        double xScale;
        double yScale;

        // should check that denom != 0 first.
        xScale = (double) panelWidth / imageWidth;
        yScale = (double) panelHeight / imageHeight;
        scale = Math.min(xScale, yScale);
        return scale;
    }

    /** Override paint method of the panel */
    public void paintComponent(Graphics g) {
        if( m_Image != null) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BICUBIC);

            // Grab a copy of the original image for scaling
            m_ScaledImage = m_Image;

            // Get the required sizes for display and calculations
            int panelWidth = this.getWidth();
            int panelHeight = this.getHeight();
            int imageWidth = m_ScaledImage.getWidth();
            int imageHeight = m_ScaledImage.getHeight();

            // Get the scale that the image should be resized with
            double scale = GetScale(panelWidth, panelHeight, imageWidth, imageHeight);

            // Calculate the center position of the panel -- with scale
            double xPos = (panelWidth - (scale * imageWidth))/2;
            double yPos = (panelHeight - (scale * imageHeight))/2;

            // Locate, scale and draw image
            AffineTransform at = AffineTransform.getTranslateInstance(xPos, yPos);
            at.scale(scale, scale);
            g2.drawRenderedImage(m_ScaledImage, at);
        }
    }

    public void loadImage(String string) {
        try {
            m_Image = ImageIO.read(new File(string));
            repaint();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
