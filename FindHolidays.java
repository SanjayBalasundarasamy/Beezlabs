import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FindHolidays {

	public static void main(String[] args) throws ParseException {
		System.out.println("Starting period :");
		Scanner s=new Scanner(System.in);
		String startDate=s.nextLine();
		System.out.println("Ending period :");
		String endDate=s.nextLine();
		
		Date sDate=new SimpleDateFormat("dd/MMM/yyyy").parse(startDate);
		Date eDate=new SimpleDateFormat("dd/MMM/yyyy").parse(endDate);
		
		Calendar startCalender=Calendar.getInstance();
		startCalender.setTime(sDate);
		Calendar endCalender=Calendar.getInstance();
		endCalender.setTime(eDate);
		int saturday=0,sunday=0;
		do{
			startCalender.add(Calendar.DAY_OF_MONTH, 1);
			if(startCalender.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
				saturday++;
			}else if(startCalender.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){
				sunday++;
		}
		}
		while(startCalender.getTimeInMillis()<endCalender.getTimeInMillis());

System.out.println(saturday+sunday);
	}
}
