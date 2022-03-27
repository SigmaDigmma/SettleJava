package com.settle;
import java.awt.image.BufferedImage;
import java.util.HashMap;
public class SimplexToJpg {

		private static final int WIDTH = 500;
		private static final int HEIGHT = 500;
		private static final double FEATURE_SIZE = 50;
		private BufferedImage image;
		private HashMap<K, V>

		
		public BufferedImage getImage() {
			return image;
		}


		public void setImage(BufferedImage image) {
			this.image = image;
		}


		public SimplexToJpg() {
			OpenSimplexNoise noise = new OpenSimplexNoise();
			image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
			for (int y = 0; y < HEIGHT; y++)
			{
				for (int x = 0; x < WIDTH; x++)
				{
					double value = noise.eval(x / FEATURE_SIZE, y / FEATURE_SIZE, 0.0);
					int rgb = 0x010101 * (int)((value + 1) * 127.5);
					System.out.println("" + rgb);
					image.setRGB(x, y, rgb);
				}
		}
		}
		
		
		public static void main(String[] args) {
			

		}
	}
