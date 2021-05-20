package cts.glodeanu.theodor.g1093.pattern.factory;

public class BookingFactory {
	public static OnlineBooking getBookingType(BookingTypes type, String eventName, int price) {
		OnlineBooking booking = null;
		switch (type) {
		case CONCERT:
			booking = new Concert(eventName, price);
			break;
		case EVENT:
			booking = new Event(eventName, price);
			break;
		case MUSEUM:
			booking = new Museum(eventName, price);
			break;
		}
		return booking;
	}
}
