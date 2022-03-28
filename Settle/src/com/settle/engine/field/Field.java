package com.settle.engine.field;

import java.util.HashMap;
import java.util.Random;

import com.settle.engine.mapgeneration.OpenSimplexNoise;

public class Field {

	private static final int WIDTH = 100;
	private static final int HEIGHT = 100;
	private static final double FEATURE_SIZE = 20;
	private HashMap<Integer, Tile> field;
	
	public Field() {
		field = new HashMap<>();
		generateMap();
		
	}
	
	private void generateMap() {
		Random r = new Random();
		OpenSimplexNoise noise = new OpenSimplexNoise(r.nextLong());
		int count = 0;
		for (int y = 0; y < HEIGHT; y++)
		{
			for (int x = 0; x < WIDTH; x++)
			{
				double value = noise.eval(x / FEATURE_SIZE, y / FEATURE_SIZE, 0.0);
				Tile tile = new Tile(x, y, value);
				field.put(tile.generateCoordinateHashCode(), tile);
				count++;
			}
		}
		System.out.println(count);
	}

	public HashMap<Integer, Tile> getField() {
		return field;
	}
	
	
}
