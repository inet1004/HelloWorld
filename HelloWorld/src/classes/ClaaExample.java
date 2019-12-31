package classes;

public class ClaaExample {
	public static void main(String[] args) {
		Object obj = new Friend();
		System.out.println(obj.hashCode());
		Object[] objAry=new Object[100];  // 1차 선언완료----------------------
		
		
		// 강제 형변환 경우 타입이 적절한지 먼저 검사해야함
		if ( obj instanceof Friend) {
		Friend frnd=(Friend) obj;
		System.out.println(frnd.getName()+frnd.getPhone());
		}
		
		objAry[0]=new Friend(); // 인스턴스를 담음, 변수로 사용-----------------------
		objAry[1]=new Member();
		
		System.out.println(objAry[1].toString()); //이렇게 사용할 수 있음--------------------
		
		Friend[] fArray=new Friend[10];
		fArray[0]=new UnivFriend("","","","");
		fArray[1]=new ComFriend("","","","");
		fArray[2]=new UnivFriend();
		System.out.println(fArray[0]);
		System.out.println(fArray[1]);	
		System.out.println(fArray[0].equals(fArray[1]));
	}
}
