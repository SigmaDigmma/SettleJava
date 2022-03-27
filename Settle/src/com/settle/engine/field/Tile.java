package com.settle.engine.field;

import com.settle.engine.TileType;

public class Tile {

	private double value;
	private TileType tT;
	private int x;
	private int y;
	
	
	public Tile(int px,int py, double value) {
		x=px;
		y=py;	
		this.value = value;
		assignTileType();
	}
	
	public void assignTileType() {
		if(value <= TileType.GRASS.getMax() && value >= TileType.GRASS.getMin()) {
			tT = TileType.GRASS;
		}
		if(value <= TileType.MOUNTAIN.getMax() && value >= TileType.MOUNTAIN.getMin()) {
			tT = TileType.MOUNTAIN;
		}
		if(value <= TileType.SAND.getMax() && value >= TileType.SAND.getMin()) {
			tT = TileType.SAND;
		}
		if(value <= TileType.SNOW.getMax() && value >= TileType.SNOW.getMin()) {
			tT = TileType.SNOW;
		}
		if(value <= TileType.WATER.getMax() && value >= TileType.WATER.getMin()) {
			tT = TileType.WATER;
		}
	}
	public int generateCoordinateHashCode()
	{
		int result = 1;
		result = 531 * result + x;
		result = 531 * result + y;
		return result;
	}

	public double getValue() {
		return value;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public TileType gettT() {
		return tT;
	}
	
}
