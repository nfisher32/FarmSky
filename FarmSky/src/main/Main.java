package main;
import com.github.dvdme.ForecastIOLib.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {
	public static String apiKey = "bdaede0bfeab9df16b68cbfb091cc09d";
	
	public static ForecastIO fIO= new ForecastIO(apiKey);
	public static void main(String[] args) {
	fIO.getForecast("49","-88");
	FIOCurrently currently = new FIOCurrently(fIO);
	
	System.out.println(fIO.getLatitude());
	System.out.println(currently.get().humidity());
	}
	
}

