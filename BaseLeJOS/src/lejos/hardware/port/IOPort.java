package lejos.hardware.port;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public interface IOPort {

	public void close();

	public String getName();

	public boolean setPinMode(int mode);
}