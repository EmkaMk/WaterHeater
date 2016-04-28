package com.ventoelectrics.waterheater;

import com.acme.adapters.HeaterAdapter;
import com.acme.adapters.ThermometerAdapter;
import com.acme.adapters.ThermoregulatorAdapter;
import com.acme.thermoregulator.AcmeStandardThermoregulator;

public class StandardVentoWaterHeaterApp {

	public static void main(String[] args) throws Exception {

		final VentoThermometer ventoThermometer = new VentoThermometer();
		final VentoHeater ventoHeater = new VentoHeater();
		final VentoPowerSwitch ventoPowerSwitch = new VentoPowerSwitch();

		final VentoThermoregulator ventoThermoregulator = new ThermoregulatorAdapter(new AcmeStandardThermoregulator(
				new ThermometerAdapter(ventoThermometer), new HeaterAdapter(ventoHeater)));
		ventoPowerSwitch.controlPowerFor(ventoThermoregulator);
		ventoPowerSwitch.controlPowerFor(ventoHeater);
		ventoPowerSwitch.controlPowerFor(ventoThermometer);

		VentoWaterHeaterApp.run(ventoThermoregulator, ventoPowerSwitch);
	}
}
