package referencetype;

public class ForArrayExample {
	public static void main(String[] args) {

//		int m=0;
//		for(int i=1;i<=10;i++) {
//			m += i;
//			System.out.println(m);

//		int m = 0;
//		int i = 1;
//		while (i <= 10) {
//			m += i;
//			System.out.print(i+"=");
//			System.out.println(m);
//			i++;
//			

		
//		for(int i=1;i<=100;i++) {
//			if(i%7==0) System.out.print(i + ", ");

		while(true) { 
			int randNum=(int)(Math.random()*6)+1;
			if(randNum==5) {
				System.out.println("주사위 수는 "+randNum+"입니다.");
				System.out.println("END");
				break;		
			}
		}
	}
}
