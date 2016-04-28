package com.acme.adapters;

import com.acme.heater.AcmeHeaterDevice;
import com.ventoelectrics.waterheater.VentoHeater;

public class HeaterAdapter implements AcmeHeaterDevice {

	private VentoHeater heater;

	public HeaterAdapter(VentoHeater heater) {
		super();
		this.heater = heater;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		this.heater.enable();

	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		this.heater.disable();

	}

}
