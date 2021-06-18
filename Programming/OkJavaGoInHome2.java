import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome2 {

	public static void main(String[] args) {
		

		String id = args[0];
		String bright = args[1];
		
		
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		Lighting hallLamp = new Lighting(id+"/ Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id+"/ floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
	}

}
