package com.settle.engine;

public enum TileType {
	GRASS("grass", -0.3, 0),
	SAND("sand", 0, 0.1) ,
	WATER("water", 0.1, 0.3),
	SNOW("snow", -1, -0.3),
	MOUNTAIN("mountain", 0.3, 1);
	
	private String name;
	private double max;
	private double min;
	TileType(String name, double min, double max) {
		this.name = name;
		this.min = min;
		this.max = max;
	}
	public String toString() {
		return name;
	}
	public double getMin() {
		return min;
	}
	public double  getMax() {
		return max;
	}
}
