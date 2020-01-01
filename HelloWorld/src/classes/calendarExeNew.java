package classes;

import java.util.Calendar;
import java.util.Date;

public class calendarExeNew {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
//		new Calendar();

		cal.set(2020, 4, 1); // 날자 세팅, 요일을 알기위해 선언

		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 일 월 화=3
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // 1월=0 ~

		System.out.println("---------------------------------------");

		createCal(2020, 5);
	}

	public static void createCal(int year, int month) {

		int spaceCnt = 0;

		String[] weeks = { "Sun", "Mon", "Tue", "Wed", "thr", "Fri", "Sat" };
		for (int i = 0; i < weeks.length; i++) {
			if (i == 6) {
				System.out.println(weeks[i]);
				break;
			}
			System.out.print(weeks[i] + ", ");
		}

		for (int i = 1; i <= maxDay(year, month); i++) {
			System.out.print(i);
//			for (int r = 1; r < maxDay(year, month); r++) {
//				System.out.printf("   ");
//				spaceCnt++;
//			}
//			System.out.printf("%3d", i);
//			if ((i + spaceCnt) % 7 == 0)
//				System.out.println();
		}

	}


	private static int maxDay(int year, int month) {
		int year1=year;
		int month1=month;
		Calendar cal = null;
		cal.set(year1, month1, 1); // 날자 세팅, 요일을 알기위해 선언
		int DayOfMonth = getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(DayOfMonth);
		return DayOfMonth;
	}

	private static int getActualMaximum(int dayOfMonth) {
		// TODO Auto-generated method stub
		return 0;
	}

}
