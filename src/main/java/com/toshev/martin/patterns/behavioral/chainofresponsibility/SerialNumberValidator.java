package com.toshev.martin.patterns.behavioral.chainofresponsibility;

import com.toshev.martin.patterns.creational.builder.Device;

public class SerialNumberValidator extends DeviceValidator {

	@Override
	public boolean validate(Device device) {
		return device.getSerialNumber().contains("SN");
	}

}
