package _08_California_Weather;

public class WeatherData {
    String weatherSummary;
    double temperatureF;
    public String getSummary() {
    	return weatherSummary;
    }
    
    public WeatherData(String summary, double temperatureF) {
        this.weatherSummary = summary;
        this.temperatureF = temperatureF;
    }
}
