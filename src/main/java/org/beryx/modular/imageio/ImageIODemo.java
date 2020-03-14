package org.beryx.modular.imageio;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageIODemo {
	public static void main(String[] args) {
		JPanel pane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);

				String resourceName = "fireplace_1k.hdr";
				String errText = "Unknown error";
				BufferedImage image = null;
				try {
					var imgStream = ImageIODemo.class.getResourceAsStream(resourceName);
					if(imgStream != null) {
						image = ImageIO.read(imgStream);
						if(image == null) {
							errText = "Cannot create image from resource " + resourceName;
						}
					} else {
						errText = "Resource " + resourceName + " not found.";
					}
				} catch (IOException e) {
					errText = e.toString();
				}
				if(image != null) {
					g.drawImage(image, 0, 0, null);
				} else {
					g.drawString(errText, 120, 300);
				}
			}
		};
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(1040, 550);
		frame.add(pane);
		frame.setVisible(true);
	}
}
