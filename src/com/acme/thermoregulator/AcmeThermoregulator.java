package com.acme.thermoregulator;

import com.acme.adapters.HeaterAdapter;
import com.acme.adapters.ThermometerAdapter;
import com.acme.heater.AcmeHeaterDevice;
import com.acme.thermometer.AcmeThermometerDevice;
import com.ventoelectrics.waterheater.VentoWaterHeaterApp;

public abstract class AcmeThermoregulator implements AcmeThermoregulatorFunctionalities {

	private AcmeThermometerDevice thermometer;
	private AcmeHeaterDevice heater;
	private int temperature = 0;
	protected long sleep_time;
	private boolean run = false;
	Integer thermoTemp;
	private Thread regulator = new Thread() {
		@Override
		public void run() {

			// TODO Auto-generated method stub
			while (run) {

				thermoTemp = thermometer.getTemperature();
				System.out.println("Current thermoregulator temperature is : " + thermoTemp);
				if (temperature > thermoTemp) {

					heater.enable();
				} else {
					heater.disable();
				}
				try {
					Thread.sleep(sleep_time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block

				}

			}

		}

	};

	public AcmeThermoregulator(ThermometerAdapter thermometer, HeaterAdapter heater) {

		this.thermometer = thermometer;
		this.heater = heater;
		this.temperature = 0;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		run = true;
		regulator.start();
		System.out.println("Enabled Thermoregulator");

	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		this.run = false;
		System.out.println("Disabled Thermoregulator");

	}

	@Override
	public void setTemperature(Integer temp) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		System.out.println("Temperature set to : " + temp);

	}

}
