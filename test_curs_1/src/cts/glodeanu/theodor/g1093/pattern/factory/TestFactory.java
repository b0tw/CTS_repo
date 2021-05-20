package cts.glodeanu.theodor.g1093.pattern.factory;

public class TestFactory {

	public static void main(String[] args) {

		OnlineBooking booking1 = BookingFactory.getBookingType(BookingTypes.CONCERT, "Concert 1", 100);
		OnlineBooking booking2 = BookingFactory.getBookingType(BookingTypes.EVENT, "Eveniment", 50);
		OnlineBooking booking3 = BookingFactory.getBookingType(BookingTypes.MUSEUM, "Muzeul de arta", 20);

		booking1.displayDescription();
		booking2.displayDescription();
		booking3.displayDescription();
	}
}
