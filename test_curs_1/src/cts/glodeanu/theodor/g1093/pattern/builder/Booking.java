package cts.glodeanu.theodor.g1093.pattern.builder;

public class Booking {
	private String hotelName;
	private boolean hasBreakfast;
	private int noOfGuests;
	private BedType bedType;
	private boolean hasSeasideView;
	private int floorLevel;
	private boolean isSmokingAllowed;

	private Booking() {

	}

	public static class BookingBuilder {
		Booking booking;

		public BookingBuilder(String hotelName) {
			this.booking = new Booking();
			this.booking.hotelName = hotelName;
		}

		public BookingBuilder hasBreakfast() {
			this.booking.hasBreakfast = true;
			return this;
		}

		public BookingBuilder hasSeasideView() {
			this.booking.hasSeasideView = true;
			return this;
		}

		public BookingBuilder isSmokingAllowed() {
			this.booking.isSmokingAllowed = true;
			return this;
		}

		public BookingBuilder setBedType(BedType bedType) {
			this.booking.bedType = bedType;
			return this;
		}

		public BookingBuilder setFloorLevel(int floorLevel) {
			this.booking.floorLevel = floorLevel;
			return this;
		}

		public BookingBuilder setNoOfGuests(int noOfGuests) {
			this.booking.noOfGuests = noOfGuests;
			return this;
		}

		public Booking build() {
			return this.booking;
		}
	}

}
