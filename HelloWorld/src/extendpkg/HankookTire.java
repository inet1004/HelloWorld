package extendpkg;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation < maxRotation) {
			System.out.println(location + "Hankook Tire수명" + (maxRotation - accumulateRotation));
			return true;
		} else {
			System.out.println("***" + location + "Hankook Tire 펑크 ***");
			return false;
		}
	}

}
