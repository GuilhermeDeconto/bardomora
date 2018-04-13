package utils;

import java.time.LocalDateTime;
import java.time.Month;

public class DateUtils {
	public static LocalDateTime formataStringParaLocalDateTime(String data){
		LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(data.substring(0, 4)), Month.of(Integer.parseInt(data.substring(5, 7))), Integer.parseInt(data.substring(8, 10)), 12, 30);
		return dateTime;
	}
}
