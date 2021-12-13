import java.text.DecimalFormat;
import Prog1Tools.IOTools;

public class Simulationsprogramm {

	public static void main(String[] args) {
		
		int prozent, a_kontakten, i;
		double hoehe;
		
		DecimalFormat df = new DecimalFormat("###.##");
		
		hoehe = IOTools.readDouble("Geben Sie die Höhe ein: ");
		prozent = IOTools.readInteger("Geben Sie das Prozent von der ursprünglichen Höhe ein: ");
		a_kontakten = IOTools.readInteger("Geben Sie ein, nach wie viel Kontakten mit dem Boden wollen Sie die Höhe wissen: ");
		
		for (i = 1; i <= a_kontakten; i++) {
			
			hoehe = hoehe * prozent / 100;
			System.out.println("Höhe nach " + i + " Kontakten: " + df.format(hoehe));
			
		}

	}

}
