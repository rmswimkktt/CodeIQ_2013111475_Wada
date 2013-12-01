package test.main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import javax.xml.ws.ServiceMode;

import main.Greeter;

import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class GreeterTest extends Greeter{
	private Calendar calendar;
	@DataPoints
	public static GreeterTestParam[] PARAMS = {
		new GreeterTestParam(5, 0, 0, "おはようございます"),
		new GreeterTestParam(11, 59, 59, "おはようございます"),
		new GreeterTestParam(12, 0, 0, "こんにちは"),
		new GreeterTestParam(17, 59, 59, "こんにちは"),
		new GreeterTestParam(18, 0, 0, "こんばんは"),
		new GreeterTestParam(4, 59, 59, "こんばんは"),
	};
		
	@Override
	protected Calendar getTime() {
		return calendar;
	}
	@Theory
	public void greeter(GreeterTestParam param) {
		calendar = makeCalendar(param.hour, param.minute, param.second);
		assertThat(greet(), is(param.expected));
	}

	private Calendar makeCalendar(int hour, int minute, int second){
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.SECOND, second);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}
}