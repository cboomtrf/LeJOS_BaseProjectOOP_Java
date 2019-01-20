package lejos.hardware.motor;

import lejos.hardware.Device;
import lejos.robotics.RegulatedMotor;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public abstract class BaseRegulatedMotor extends Device implements RegulatedMotor {
	
	public BaseRegulatedMotor() {
		super();
	}

	public void close() {
		super.close();
	}

	public int getTachoCount() {
		return 0;
	}

	public float getPosition() {
		return 0.0F;
	}

	public void forward() {
	}

	public void backward() {
	}

	public void stop() {
	}

	public boolean isMoving() {
		return true;
	}

	public void rotateTo(int limitAngle, boolean immediateReturn) {
	}

	public void setSpeed(int speed) {
	}

	public void setSpeed(float speed) {
	}

	public void rotate(int angle) {
	}

	public void rotateTo(int limitAngle) {
		rotateTo(limitAngle, false);
	}

	public int getSpeed() {
		return 0;
	}

	public int getRotationSpeed() {
		return 0;
	}

	public void synchronizeWith(RegulatedMotor[] syncList) {
	}

	public void startSynchronization() {
	}

	public void endSynchronization() {
	}
}
