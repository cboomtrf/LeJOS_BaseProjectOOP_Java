package lejos.hardware.port;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public interface Port {
	
	public String getName();

	public <T extends IOPort> T open(Class<T> portclass);
}
