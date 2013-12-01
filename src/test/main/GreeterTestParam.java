package test.main;

import main.Greeter.Aisatu;

public class GreeterTestParam {
	int hour;
	int minute;
	int second;
	Aisatu expected;
	public GreeterTestParam(int hour, int minute, int second, Aisatu expected) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.expected = expected;
	}
}
