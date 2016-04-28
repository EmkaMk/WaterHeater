package com.acme.adapters;

import com.acme.thermometer.AcmeThermometerDevice;
import com.ventoelectrics.waterheater.VentoThermometer;

public class ThermometerAdapter implements AcmeThermometerDevice {
	
	private VentoThermometer thermometer;

	public ThermometerAdapter(VentoThermometer thermometer) {
		super();
		this.thermometer = thermometer;
	}

	@Override
	public Integer getTemperature() {
		// TODO Auto-generated method stub
		
		return this.thermometer.getTemperature();
			}
	
	

}
