package com.settle.engine.field;

public class FieldUtils {
	public static int coordinateToHashCod(int x, int y) {
		int result = 1;
		result = 31 * result + x;
		result = 31 * result + y;
		return result;
	}
}
