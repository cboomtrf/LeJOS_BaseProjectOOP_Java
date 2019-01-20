package lejos.hardware.motor;

import lejos.hardware.port.Port;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class NXTRegulatedMotor extends BaseRegulatedMotor {

	public NXTRegulatedMotor(Port port) {
		super();
	}

	@Override
	public void waitComplete() {
	}

	@Override
	public int getLimitAngle() {
		return 0;
	}

	@Override
	public void setAcceleration(int acceleration) {		
	}

	@Override
	public void flt() {		
	}
}
