package test.main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import main.Greeter;

import org.junit.Test;

public class GreeterTest extends Greeter{
	private Calendar calendar;
	@Override
	protected Calendar getTime() {
		return calendar;
	}
	@Test
	public void morning1() {
		calendar = makeCalendar(5, 0, 0);
		String expected = "おはようございます";
		assertThat(greet(), is(expected));
	}
	@Test
	public void morning2() {
		calendar = makeCalendar(11, 59, 59);
		String expected = "おはようございます";
		assertThat(greet(), is(expected));
	}

	@Test
	public void middy1() {
		calendar = makeCalendar(12, 0, 0);
		String expected = "こんにちは";
		assertThat(greet(), is(expected));
	}

	@Test
	public void middy2() {
		calendar = makeCalendar(17, 59, 59);
		String expected = "こんにちは";
		assertThat(greet(), is(expected));
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
