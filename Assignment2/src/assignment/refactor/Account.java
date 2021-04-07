package assignment.refactor;

import assignment.refactor.exceptions.InvalidInputException;
import assignment.refactor.interfaces.MonthlyRate;

public final class Account implements MonthlyRate {

	private double loanValue;
	private double rate;
	private int daysActive;
	private AccountType accountType;

	public Account(double loanValue, double rate, AccountType accountType) throws InvalidInputException {
		if (loanValue < 0) {
			throw new InvalidInputException();
		}
		this.loanValue = loanValue;
		this.rate = rate;
		this.accountType = accountType;
	}

	public double getLoanValue() {
		return loanValue;
	}

	public void setLoanValue(double loanValue) throws InvalidInputException {
		if (loanValue < 0) {
			throw new InvalidInputException();
		}
		this.loanValue = loanValue;
	}

	public double getRate() {
		return rate;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public int getDaysActive() {
		return daysActive;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Account [loanValue=");
		builder.append(loanValue);
		builder.append(", rate=");
		builder.append(rate);
		builder.append(", daysActive=");
		builder.append(daysActive);
		builder.append(", accountType=");
		builder.append(accountType);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public double getMonthlyRate() {
		return this.loanValue * this.rate;
	}

}
