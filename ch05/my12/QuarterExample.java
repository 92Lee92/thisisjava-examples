package ch05.my12;

import java.util.Calendar;

public class QuarterExample {

	public static void main(String[] args) {
		Quarters quarter =null;
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);
		switch(month) {
		case 1:
		case 2:
		case 3: quarter = Quarters.FIRST_QUARTER;	break;
		case 4:
		case 5:
		case 6: quarter = Quarters.SECOND_QUARTER;	break;
		case 7:
		case 8:
		case 9: quarter = Quarters.THIRD_QUARTER;	break;
		case 10:
		case 11:
		case 12: quarter = Quarters.FOURTH_QUARTER;	break;
	}
		System.out.println("We are in " + quarter);	
	}

}
