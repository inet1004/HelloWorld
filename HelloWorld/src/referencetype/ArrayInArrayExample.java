package referencetype;

public class ArrayInArrayExample {
	public static void main(String[] args) {
//		int[][] intAry=new int[5][4];
//		int m=1;
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<4;j++) {
//				intAry[i][j]=m;
//				if(m%4==0)
//					System.out.println(intAry[i][j]);
//				else
//					System.out.print(intAry[i][j] + ", ");
//				m++;

//		int[][] intAry = new int[5][4];
//		int t, s;
//		int m = 1;
//		for (t=0; t < 5; t++) {
//			for (s=0; s < 4; s++) {
//				intAry[t][s] = m;
//				System.out.print("m= " + m + ", ");
//				System.out.print("t= " + t + ", s= " +s + ",        ");
//				m++;
//				int result=intAry[t][s];
//				System.out.print(result + ", ");
//			}
//			System.out.println();
//		}
		
		
		int[][] intAry = new int[5][5];
		int m = 1, n=1;
		int t, s;
		for (t=0; t < 5; t++) {
			for (s=0; s < 5; s++) {
				m=intAry[s][t] = n+(s*5);
				System.out.print( m + ", ");
//				System.out.print("s" + s + ", t" + t + ",  ");
				int result=intAry[s][t];
			}
			n++;
			System.out.println("");
		}
		
		
		
	}
}
