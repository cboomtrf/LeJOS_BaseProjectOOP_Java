package lejos.robotics;

public interface BaseMotor {

	void forward();

	void backward();

	void stop();

	public void flt();

	boolean isMoving();
}
