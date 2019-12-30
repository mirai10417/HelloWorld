package classes.extendpkg;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation)
	{
		super(location, maxRotation);
		
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulateRotation;
		if(accumulateRotation < maxRotation)
		{
			System.out.println(location+" KumhoTire 수명: "+(maxRotation - accumulateRotation));
			return true;
		}
		else
		{
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			return false;
		}
	}
}
