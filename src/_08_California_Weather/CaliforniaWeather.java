package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * 
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */



public class CaliforniaWeather implements ActionListener {
	  HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
	  
    	JButton button= new JButton("City Search");
    	JButton city= new JButton("Condition Search");
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
 
    
    public void setup() {
      button.addActionListener(this);
      city.addActionListener(this);
    	frame.add(panel);
    	panel.add(button);
    	panel.add(city);
    	frame.setVisible(true);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.pack();
    	
    	
    }
    
    
    
    
    void start() {
    	setup();
      
        
        // All city keys have the first letter capitalized of each word
    
     
    }




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==city) {
			String condition=JOptionPane.showInputDialog("Enter a condition (Overcast, Partly Cloudy, Mostly Cloudy, Clear:");
		for (int i = 0; i < weatherData.size(); i++) {
	//iterate through hashmap and list all cities with a certain value		if(weatherData.get(e))==condition) {
				
			}
		}
			
	
			
			if(e.getSource()==button) {
		String search=JOptionPane.showInputDialog("Search for a city in california:");
		 String cityName = Utilities.capitalizeWords( search );
		    WeatherData datum = weatherData.get(cityName);
		 if(weatherData.containsKey(search)){
			
				 if( datum == null ) {
			            JOptionPane.showMessageDialog(null,"Unable to find weather data for: " + cityName);
			        } else {
			        	
			       
			        	JOptionPane.showMessageDialog(null,cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
			        }
		 }
	}
		
	
			
		}
		}
	////
	}
