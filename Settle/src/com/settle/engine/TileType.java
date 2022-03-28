package com.settle.engine;

public enum TileType {
	GRASS("grass", -0.25, 0.3),
	SAND("sand", -0.32, -0.25) ,
	WATER("water", -1, -0.32),
	SNOW("snow", 0.6, 1),
	MOUNTAIN("mountain", 0.3, 0.6);
	
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
