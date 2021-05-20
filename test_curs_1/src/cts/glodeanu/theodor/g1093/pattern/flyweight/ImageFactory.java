package cts.glodeanu.theodor.g1093.pattern.flyweight;

import java.util.HashMap;

public class ImageFactory {
	static HashMap<String, ImageInterface> images = new HashMap<String, ImageInterface>();

	static {
		images.put(Season.AUTUMN.toString(), new ImageFlyweight("Autumn"));
		images.put(Season.WINTER.toString(), new ImageFlyweight("Winter"));
		images.put(Season.SPRING.toString(), new ImageFlyweight("Spring"));
		images.put(Season.SUMMER.toString(), new ImageFlyweight("Summer"));
	}

	public static ImageInterface getImage(Season season) {
		return images.get(season.toString());
	}
}
