package lejos.robotics;

public interface RegulatedMotor extends BaseMotor {

	public void waitComplete();

	void rotate(int angle);

	public void rotateTo(int limitAngle);

	public int getLimitAngle();

	void setSpeed(int speed);

	int getSpeed();

	void setAcceleration(int acceleration);

	public void synchronizeWith(RegulatedMotor[] syncList);

	public void startSynchronization();

	public void endSynchronization();
}