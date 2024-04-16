import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		for (int i = 0; i <= Math.log10(num); i++)
			digitList.add(num/Math.pow(10, i) % 10);
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for (int i = 0; i < digitList.size() - 1; i++){
			if (digitList.get(i) >= digitList.get(i + 1)) return false;
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
