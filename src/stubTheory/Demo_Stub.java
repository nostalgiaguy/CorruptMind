package stubTheory;

import org.testng.Assert;
import org.testng.annotations.Test;


class DayOrDark{
	
	public static String getDayDarkInfo(){
		/*
		 * Think and write how to find its day or dark.
		 */
		return "night";
		
	}
}

class Together{
	
	public static boolean getTogetherness(){
		/*
		 * Think and write is she really want to walk with u.
		 */
		return true;
	}
}
public class Demo_Stub {
	
	
	@Test
	public void testDayOrDark(){
		Assert.assertEquals("night" , DayOrDark.getDayDarkInfo());
	}
	
	@Test
	public void testTogetherness(){
		Assert.assertEquals(true , Together.getTogetherness());
	}
	
}
