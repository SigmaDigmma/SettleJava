package com.settle.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import com.settle.engine.mapgeneration.SimplexToJpg;
import com.settle.engine.field.*;

public class GUI {
	private JFrame f;
	private JPanel topP;
	private JPanel resP;
	private JPanel inspP;
	private JPanel mapP;
	private JPanel centerP;
	private SimplexToJpg simplextojpg;
	private Field field;
	
	public GUI() {
		field = new Field();
		
		f = new JFrame("Settle");
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		BorderLayout borderL = new BorderLayout();
		f.setLayout(borderL);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		topP = new JPanel();
		topP.setPreferredSize(new Dimension(1920,80));
		topP.setBackground(new Color(20,20,20,100));
		f.add(topP,BorderLayout.PAGE_START);
		resP = new JPanel();
		resP.setBackground(new Color(100, 100, 100, 100));
		resP.setPreferredSize(new Dimension(460, 1080));
		f.add(resP,BorderLayout.LINE_START);
		inspP = new JPanel();
		inspP.setLayout(new BorderLayout());
		inspP.setBackground(new Color(80, 80, 80, 100));
		inspP.setPreferredSize(new Dimension(460, 880));
		f.add(inspP,BorderLayout.LINE_END);
		mapP = new JPanel();
		mapP.setBackground(new Color(50, 50, 50, 50));
		mapP.setPreferredSize(new Dimension(200, 200));
		inspP.add(mapP,BorderLayout.PAGE_END);
		
		centerP = new JPanel();
		GridLayout gL = new GridLayout(100,100);
		centerP.setLayout(gL);
		centerP.setPreferredSize(new Dimension(1000, 1000));
		f.add(centerP,BorderLayout.CENTER);
		
		
		for(int i =0;i< 100*100;i++) {
			centerP.add(new TilePanel(new Tile(0,0,0)));	
		}
		for(Tile t :field.getField().values()) {
		centerP.remove(t.getY()*100+t.getX());
		centerP.add(new TilePanel(t),t.getY()*100+t.getX());
		}
		
		
		
		centerP.validate();
		centerP.repaint();
		
	}
}
