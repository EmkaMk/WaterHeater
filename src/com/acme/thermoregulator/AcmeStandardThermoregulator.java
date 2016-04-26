package com.acme.thermoregulator;

import com.acme.adapters.HeaterAdapter;
import com.acme.adapters.ThermometerAdapter;

public class AcmeStandardThermoregulator extends AcmeThermoregulator {

	public AcmeStandardThermoregulator(ThermometerAdapter thermometer, HeaterAdapter heater) {
		super(thermometer, heater);
		sleep_time=3000;
		// TODO Auto-generated constructor stub
	}

	
	
	

}
