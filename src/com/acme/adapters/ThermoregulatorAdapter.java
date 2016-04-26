package com.acme.adapters;

import com.acme.thermoregulator.AcmeThermoregulatorFunctionalities;
import com.ventoelectrics.waterheater.VentoThermoregulator;

public class ThermoregulatorAdapter implements VentoThermoregulator {

	AcmeThermoregulatorFunctionalities acmeThermoregulator;

	public ThermoregulatorAdapter(AcmeThermoregulatorFunctionalities acmeThermoregulator) {
		super();
		this.acmeThermoregulator = acmeThermoregulator;
	}

	@Override
	public void enablePower() {
		// TODO Auto-generated method stub
		acmeThermoregulator.enable();

	}

	@Override
	public void disablePower() {
		// TODO Auto-generated method stub
		acmeThermoregulator.disable();

	}

	@Override
	public void setTemperature(Integer temperature) {
		// TODO Auto-generated method stub
		acmeThermoregulator.setTemperature(temperature);

	}

}
