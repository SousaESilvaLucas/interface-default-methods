package model.services;

import java.security.InvalidParameterException;

public interface InterestService {

	public double getInterestRate();

	default double calculateInterest(double amount, int months) {
		if (months < 0) {
			throw new InvalidParameterException("Months should be greater than 0");
		} else {
			return amount * Math.pow((1 + getInterestRate()), months);
		}

	}
}
