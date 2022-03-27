package com.settle;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class GUI {
	private JFrame f;
	private JPanel resP;
	private JPanel inspP;
	private JPanel mapP;
	private JPanel centerP;
	private JLabel Field;
	private SimplexToJpg simplextojpg;

	
	public GUI() {
		simplextojpg = new SimplexToJpg();
		
		f = new JFrame("Settle");
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		
		resP = new JPanel();
		resP.setBackground(new Color(100, 100, 100, 100));
		resP.setPreferredSize(new Dimension(200, 1080));
		f.add(resP,BorderLayout.LINE_START);
		inspP = new JPanel();
		inspP.setLayout(new BorderLayout());
		inspP.setBackground(new Color(80, 80, 80, 100));
		inspP.setPreferredSize(new Dimension(200, 880));
		f.add(inspP,BorderLayout.LINE_END);
		mapP = new JPanel();
		mapP.setBackground(new Color(50, 50, 50, 50));
		mapP.setPreferredSize(new Dimension(200, 200));
		inspP.add(mapP,BorderLayout.PAGE_END);
		
		centerP = new JPanel();
		Field = new JLabel();
		centerP.add(Field);
		centerP.setBackground(new Color(200, 200, 200, 100));
		centerP.setPreferredSize(new Dimension(1520, 1080));
		Field.setIcon(new ImageIcon(simplextojpg.getImage()));
		f.add(centerP,BorderLayout.CENTER);
	}
}
