package cts.glodeanu.theodor.g1093.pattern.builder;

public class TestBuilder {

	public static void main(String[] args) {
		Booking booking1 = new Booking.BookingBuilder("Hotel Mamaia").hasSeasideView().isSmokingAllowed().build();
		Booking booking2 = new Booking.BookingBuilder("Hotel Intercontinental").setBedType(BedType.QUEEN)
				.setNoOfGuests(5).build();
		Booking booking3 = new Booking.BookingBuilder("Hotel Mare").setFloorLevel(5).build();

	}

}
