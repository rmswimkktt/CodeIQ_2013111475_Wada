package test.main;

public class GreeterTestParam {
	int hour;
	int minute;
	int second;
	String expected;
	public GreeterTestParam(int hour, int minute, int second, String expected) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		this.expected = expected;
	}
}
