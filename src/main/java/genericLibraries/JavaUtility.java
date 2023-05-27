package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * This class contains reusable methods to perform java related actions
 * @author kalya
 *
 */
public class JavaUtility 
{
	
	/**
	 * This method generates random number within the limit Specified
	 * @param limit
	 * @return
	 */
public int generateRandomNum(int limit)
{
	Random random = new Random();
	return random.nextInt(limit);
}
/**
 * This method generates current time
 * @return
 */


public String getCurrentTime()
{
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yy_hh_mm_SSS");
	return sdf.format(date);
}
}
