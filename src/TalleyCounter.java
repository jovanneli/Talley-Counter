/**
 * 
 * @author Jovanne Li
 * Talley Counter
 */

//**headers don't require semicolons**
public class TalleyCounter 
{
	//instance variables/fields
	private int count;
	
	//constructors: must create to initialize the variable "count"
	public TalleyCounter()
	{
		count=0;
	}
	public TalleyCounter(int a)
	{
		count=a;
	}
	
	//methods
	public void click()
	{
		count++; //shortcut for count = count + 1;
				//another option: count +=1
	}
	public int getCount()
	{
		return count;
	}
	public void reset()
	{
		count=0;
	}
	public void unclick()
	{
		count--; //shortcut for count = count - 1;
	}
}
