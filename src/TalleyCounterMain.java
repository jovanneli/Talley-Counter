/**
 * 
 * @author Jovanne Li
 *
 */
public class TalleyCounterMain 
{
	public static void main(String[] args)
	{
		TalleyCounter papaoutai = new TalleyCounter();
		papaoutai.click();
		papaoutai.click();
		papaoutai.click();
		System.out.println(papaoutai.getCount());
		papaoutai.unclick();
		System.out.println(papaoutai.getCount());
		papaoutai.reset();
		System.out.println(papaoutai.getCount());
	
	}
}
