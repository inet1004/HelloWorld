package classes;
class Singleton{
	private static Singleton singleton=new Singleton();
	private Singleton() {
	}
	static Singleton getInstance() {
		return singleton;
	}
}
public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		
		if(singleton==singleton2) {
			System.out.println("동일객체");
		}else {
			System.out.println("다른 객체");
		}
	}
}
