package helper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

//fungsi untuk mengambil tanggal
public class DateConvert {
	
	public static List<String> getDate() {
    	SimpleDateFormat first_date = new SimpleDateFormat("dd.MM");
		SimpleDateFormat last_date = new SimpleDateFormat("dd.MM.yyyy");
			
		List<String> allDates = new ArrayList<>();
		Calendar cal = Calendar.getInstance();
		cal.get(Calendar.MONTH);
		cal.set(Calendar.DATE, 1);
				
		for (int i = 1; i <= 12; i++) {
		    String first_month = first_date.format(cal.getTime());
		    cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		    String last_month = last_date.format(cal.getTime());
		    		    
		    allDates.add(first_month+" - "+last_month);
		    cal.add(Calendar.MONTH, +1);
		    cal.set(Calendar.DATE, 1);
		}
		
		return allDates;
    }

}
