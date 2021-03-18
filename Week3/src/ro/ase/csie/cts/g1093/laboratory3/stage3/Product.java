package ro.ase.csie.cts.g1093.laboratory3.stage3;

import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.laboratory3.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.MarketingInterface;
import ro.ase.csie.cts.g1093.laboratory3.stage3.services.ValidatorInterface;
import ro.ase.csie.cts.g1093.laboratory3.stage3.test.TestProduct;

public class Product {

	MarketingInterface mkService = null; // by default it is null
	ValidatorInterface validatorService = null;

	public Product(MarketingInterface mkService, ValidatorInterface validatorService) {
		if (mkService == null) {
			throw new NullPointerException();
		}
		if (validatorService == null) {
			throw new NullPointerException();
		}
		this.mkService = mkService;
		this.validatorService = validatorService;
	}

	public Product() {
		for(Object service : TestProduct.services) {
			if(service instanceof MarketingInterface) {
				this.mkService = (MarketingInterface) service;
			}
			if(service instanceof ValidatorInterface) {
				this.validatorService = (ValidatorInterface) service;
			}
		}
		if(this.mkService == null) {
			throw new UnsupportedOperationException();
		}
		if(this.validatorService == null) {
			throw new UnsupportedOperationException();
		}
	}
	
	public void setMkService(MarketingInterface mkService) {
		if (mkService == null) {
			throw new NullPointerException();
		}
		this.mkService = mkService;
	}

	public void setValidatorService(ValidatorInterface validatorService) {
		if (validatorService == null) {
			throw new NullPointerException();
		}
		this.validatorService = validatorService;
	}

	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		return initialPrice - (discountValue * initialPrice);
	}

	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears)
			throws InvalidPriceException, InvalidAccountAgeException {

		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);

		float fidelityDiscount = (productType == ProductType.NEW) ? 0
				: mkService.getFidelityDiscount(accountAgeInYears);
		float discountValue = productType.getDiscount();
		float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
		float finalPrice = priceWithDiscount * (1 - fidelityDiscount);

		return finalPrice;
	}
}