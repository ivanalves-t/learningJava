package dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2021-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2021-07-20t01:30:27");
		Instant d06 = Instant.parse("2021-07-20t01:30:27Z");
		
		// convert global time to local date time
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		// get data of a local DateTime
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d04 ano = " + d05.getHour());
		System.out.println("d04 ano = " + d05.getMinute());
		
	}
}
