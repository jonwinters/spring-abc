package helper;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIntercepotor {
	public static final Pattern BACK_PATTERN=Pattern.compile(" .*/back/.* ");
	@Test
	public void test() {
		String url="http://localhost:8080/sync/back/";
		Matcher matcher=BACK_PATTERN.matcher(url);
		System.out.println(matcher.matches());
	}

}
