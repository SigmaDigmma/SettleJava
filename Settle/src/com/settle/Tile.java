package com.settle;

import javax.swing.*;

public class Tile extends JPanel {
	
	private double value;
	private TileType tT;
	private int x;
	private int y;
	private JLabel GFX;
	
	
	
	public Tile(int px,int py) {
		x=px;
		y=py;
	}
}
