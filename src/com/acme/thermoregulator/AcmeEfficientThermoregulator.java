package com.acme.thermoregulator;

import com.acme.adapters.HeaterAdapter;
import com.acme.adapters.ThermometerAdapter;

public class AcmeEfficientThermoregulator extends AcmeThermoregulator{

	public AcmeEfficientThermoregulator(ThermometerAdapter thermometer, HeaterAdapter heater) {
		super(thermometer, heater);
		sleep_time=1000;
		// TODO Auto-generated constructor stub
	}


	

}
