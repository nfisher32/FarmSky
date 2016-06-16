package main;
import com.github.dvdme.ForecastIOLib.*;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Main {
	public static String apiKey = "bdaede0bfeab9df16b68cbfb091cc09d";
	public static JPanel painter =new JPanel(new GridBagLayout());
	public static JFrame frame= new JFrame("FarmSky");
	public static JButton b1 = new JButton("1");
	public static JButton b2 = new JButton("2");
	public static JLabel l = new JLabel("12");
	
	public static String locations[]= {"SFCS","SFCN","SFHP","SFHD","SFHA"};

	public static JComboBox cb = new JComboBox(locations);
	public static GridBagConstraints c = new GridBagConstraints();
	public static ForecastIO fIO= new ForecastIO(apiKey);
	
	
	
	public static void Frame() {
	b1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
		
			JOptionPane.showMessageDialog(null, cb.getSelectedItem().toString());
		
		}
		
		
		
	});
	painter.add(b1);	
	painter.add(cb);
	
	painter.setBackground(new Color((int) 0xfa7777));
	painter.add(l);
	
	frame.setVisible(true);
	frame.setSize(200, 200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(painter);
		
	}
	
	public static void main(String[] args) {
	Frame();
	
	

	fIO.getForecast("49","-87");
	FIOCurrently currently = new FIOCurrently(fIO);
	
	//System.out.println(fIO.getLatitude());
	//System.out.println(currently.get().humidity());
	}
	
}

