import java.text.SimpleDateFormat;
import java.util.Date;

public class java {

	public static void main(String[] args) {
		Date date = new Date();
	  SimpleDateFormat format1 = new SimpleDateFormat("E y MM dd	hh:mm:ss:SS a z");
	  System.out.println( format1.format(date));

	}

}

