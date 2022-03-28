package com.settle.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.settle.engine.TileType;
import com.settle.engine.field.Tile;

public class TilePanel extends JPanel {
	
	private Tile tile;
	
	public TilePanel(Tile tile) {
		super(new GridBagLayout());
		this.tile = tile;
		this.setSize(new Dimension(20,20));
	//	setBackground(new Color(0x010101 * (int)((tile.getValue() + 1) * 127.5)));
		assignIcon();
	}

	public void setTile(Tile t) {
		this.tile = t;
		//setBackground(new Color(0x010101 * (int)((tile.getValue() + 1) * 127.5)));
		assignIcon();
		validate();
		repaint();
	}
	private void assignIcon() {
		this.removeAll();
		String iconPath = "Pictures/";
			try {
				BufferedImage image = ImageIO.read(new File(iconPath + tile.gettT().name() + ".png"));
				image = resizeImage(image, this.getWidth(), this.getHeight());
				add(new JLabel(new ImageIcon(image)));
			} catch (IOException e) {
				e.printStackTrace();
			}
	validate();
	repaint();
	}
	BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
	    Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
	    BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
	    outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
	    return outputImage;
	}
}

