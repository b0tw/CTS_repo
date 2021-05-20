package cts.glodeanu.theodor.g1093.pattern.factory;

public class Concert extends OnlineBooking {

	public Concert(String eventName, int price) {
		super(eventName, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Concert";
	}

}
