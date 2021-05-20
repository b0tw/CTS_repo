package cts.glodeanu.theodor.g1093.pattern.flyweight;

public class ImageFlyweight implements ImageInterface {

	String region;

	public ImageFlyweight(String region) {
		super();
		this.region = region;
	}

	@Override
	public void display(GalleryImage galleryImages) {
		System.out.println("Displaying images for " + galleryImages.bitmapName);
	}

}
