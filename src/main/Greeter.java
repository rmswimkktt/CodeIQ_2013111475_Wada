package main;

import java.util.Calendar;


public class Greeter {

	public Aisatu greet() {
		Calendar calendar = getTime();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if(hour >= 5 && hour < 12){
			return Aisatu.MORNING;
		}
		else if(hour >= 12 && hour < 18){
			return Aisatu.MIDDY;
		}
		else{
			return Aisatu.NIGHT;
		}
	}
	
	protected Calendar getTime(){
		return Calendar.getInstance();
	}

	public enum Aisatu{
		MORNING("おはようございます"),
		MIDDY("こんにちは"),
		NIGHT("こんばんは");
		
		private String aisatu;

		private Aisatu(String aisatu) {
			this.aisatu = aisatu;
		}
		public String toString(){
			return aisatu;
		}
	}
}
