package santos.hugo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkingWithDates {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
	}

}
