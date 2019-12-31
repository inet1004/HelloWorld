package classes;

public class CalendarExe {
	public static void main(String[] args) {
		int result=0;
		int month=11;
		int spaceCnt=0;
		System.out.println(getMaxDate(month));
		System.out.println(getFirstDayofMonth(month));
		
		String[] weeks= {"Sun","Mon","Tue","Wed","thr","Fri","Sat"};
		for (int i=0;i<weeks.length;i++) {
			System.out.println("    "+i);
		}
		for(int i=1;i<=getMaxDate(month);i++) {
//			System.out.println(i+" ");
			System.out.print(5);
			for(int r=1;r<getFirstDayofMonth(month);r++) {
				System.out.printf("   ");
				spaceCnt++;
			}
			System.out.printf("%3d",i);
			if((i+spaceCnt)%7==0) 
				System.out.println();
		}
		
	}
	
	public static int getFirstDayofMonth(int month) {
		int result=0;
		if(month==9) {
			result=1;					
		}else if(month==10) {
			result=3;			
		}else if(month==11) {
			result=6;			
		}else if(month==12) {
			result=1;
		}
		return result;
	}
	
	public static int getMaxDate(int month) {
		int dayCnt=0;
		if(month<=7) {
			if(month%2==1) {
				dayCnt=31;
			}else {
				dayCnt=30;
			}
		}else {
			if(month%2==0) {
				dayCnt=28;
			}else {

				dayCnt=30;
			}
		}
		return dayCnt;
	}
}
