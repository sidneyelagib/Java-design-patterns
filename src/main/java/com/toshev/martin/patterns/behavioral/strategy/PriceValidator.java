package com.toshev.martin.patterns.behavioral.strategy;

import com.toshev.martin.patterns.creational.builder.Device;

public class PriceValidator extends DeviceValidator {

	@Override
	public boolean validate(Device device) {
		return device.getPrice() > 0;
	}

}
