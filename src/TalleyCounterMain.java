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
		System.out.println(papaoutai.getCount());
		papaoutai.click();
		papaoutai.click();
		papaoutai.click();
		System.out.println(papaoutai.getCount());
		papaoutai.unclick();
		System.out.println(papaoutai.getCount());
		papaoutai.reset();
		System.out.println(papaoutai.getCount());
	
		TalleyCounter daddyouthicc = new TalleyCounter(69);
		System.out.println(daddyouthicc.getCount());
		daddyouthicc.click();
		daddyouthicc.click();
		System.out.println(daddyouthicc.getCount());
		
	}
}
