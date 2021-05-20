package cts.glodeanu.theodor.g1093.pattern.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		GalleryImage hotelGallery1 = new GalleryImage("Image 1");
		GalleryImage hotelGallery2 = new GalleryImage("Image 2");

		GalleryImage hotelGallery3 = new GalleryImage("Image 3");
		GalleryImage hotelGallery4 = new GalleryImage("Image 4");

		ImageInterface region1 = ImageFactory.getImage(Season.AUTUMN);
		region1.display(hotelGallery1);
		region1.display(hotelGallery2);

		ImageInterface region2 = ImageFactory.getImage(Season.WINTER);
		region2.display(hotelGallery3);
		region2.display(hotelGallery4);
	}

}
