package com.acme.thermoregulator;

import com.acme.adapters.HeaterAdapter;
import com.acme.adapters.ThermometerAdapter;

public abstract class AcmeThermoregulator implements AcmeThermoregulatorFunctionalities, Runnable {

	private ThermometerAdapter thermometer;
	private HeaterAdapter heater;
	private int temperature;
	protected long sleep_time;
	private boolean run=true;

	public AcmeThermoregulator(ThermometerAdapter thermometer, HeaterAdapter heater) {

		this.thermometer = thermometer;
		this.heater = heater;
		this.temperature = 0;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (run) {
			try {
				Thread.sleep(sleep_time);
				Integer thermoTemp = thermometer.getTemperature();
				if (temperature > thermoTemp) {
					heater.enable();
				} else {
					heater.disable();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		this.run();

	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		this.run=false;

	}

	@Override
	public void setTemperature(Integer temp) {
		// TODO Auto-generated method stub
		this.temperature = temp;

	}

}
