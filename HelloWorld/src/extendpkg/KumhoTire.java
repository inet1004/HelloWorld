package extendpkg;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Kumho Tire수명" + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***" + location + "Kumho Tire 펑크 ***");
			return false;
		}

	}
}
