package course;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// instanciação de um instante no horário UTC (GMT0)
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		// printando instante formatado, com a hora do brasil (GMT-3)
		System.out.println(sdf.format(d));
		
		// Classe Calendar usada para operações de data
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); 
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		// Adicionando 4 horas da data 'd'
		System.out.println(sdf.format(d));
		
		cal.add(Calendar.DAY_OF_MONTH, 4);
		d = cal.getTime();
		// Adicionando mais 4 dias da data 'd'
		System.out.println(sdf.format(d));
		
		// OBTENDO UMA UNIDADE DE TEMPO
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(d2));

		Calendar cal2 = Calendar.getInstance();

		cal2.setTime(d);

		int minutes = cal2.get(Calendar.MINUTE);

		int month = 1 + cal2.get(Calendar.MONTH);
		System.out.println("----------------------\n");
		System.out.println("Minutes: " + minutes);

		System.out.println("Month: " + month);
	}
}
