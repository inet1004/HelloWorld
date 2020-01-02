package classes;

import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
	

		int totalPrice, qty, price; 
		String item;

		System.out.println("입력");
		Scanner scn4 = new Scanner(System.in);
		item = scn4.nextLine();
		System.out.println("입력");
		Scanner scn5 = new Scanner(System.in);
		qty = scn5.nextInt();
		System.out.println("입력");
		Scanner scn6 = new Scanner(System.in);
		price = scn6.nextInt();
		compute(item,qty,price);
		
		Test6 ob1=new Test6(10,20);
		Test6 ob2=new Test6(12.4,9.45);
		Test6 ob3=new Test6('Z','p');
				
	}	
	
	private static void compute(String item,int qty,int price) {
		System.out.println(item);
		int sum=qty*price;
		System.out.println(sum);
	}

	}
}
