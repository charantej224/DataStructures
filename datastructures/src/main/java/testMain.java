import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class testMain {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		Date myDate = Date.from(instant);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formatter.format(myDate));
		
	}
}
