package lejos.hardware;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author CBoom (cboom.trf@gmail.com)
 *
 */
public class Device {
	protected ArrayList<Closeable> closeList = new ArrayList<Closeable>();

	protected void releaseOnClose(Closeable res) {
		closeList.add(res);
	}

	public void close() {
		for (Closeable res : closeList)
			try {
				res.close();
			} catch (IOException e) {
				System.out.println("Closure failure");
			}

	}

}
