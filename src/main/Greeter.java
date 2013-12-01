package main;

import java.util.Calendar;


public class Greeter {

	public String greet() {
		Calendar calendar = getTime();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour >= 5 && hour < 12){
			return "おはようございます";
		}
		else if(hour >= 12 && hour < 18){
			return "こんにちは";
		}
		return null;
	}
	
	protected Calendar getTime(){
		return Calendar.getInstance();
	}
}
