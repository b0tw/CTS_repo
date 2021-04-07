package assignment.refactor;

public class FeeCalculation {

	public static final int DAYS_IN_YEAR = 365;
	public static final double BROKER_FEE = 0.0125;
	
	private static double computeFee(double loanValue, double rate, int daysActive) {
		return BROKER_FEE * (loanValue * (Math.pow(rate, daysActive / DAYS_IN_YEAR) - 1));
	}


	public static double getTotalFee(Account[] accounts) {
		Account account;
		double totalFee = 0.0;
		double accountFee = 0.0;

		for (int i = 0; i < accounts.length; i++) {
			account = accounts[i];
			if (account.getAccountType() == AccountType.PREMIUM
					|| account.getAccountType() == AccountType.SUPER_PREMIUM) {
				accountFee = computeFee(account.getLoanValue(), account.getRate(), account.getDaysActive());
				totalFee += accountFee;
			}
		}
		return totalFee;
	}
}
