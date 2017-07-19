package production.forloops;

public class XAndY {
	public static void main(String[] args) {
		
		System.out.println(" X\t Y");
		for(double x = -10; x <= 10; x = x + .5) {
			double y = x * x;
			System.out.println("----\t----");
			System.out.println(x + "\t" + y);

	}

}

}
