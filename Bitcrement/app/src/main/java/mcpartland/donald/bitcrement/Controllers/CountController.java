package mcpartland.donald.bitcrement.Controllers;

/**
 * Created by Donald on 1/5/16.
 */
public class CountController
{
    private int count;

    public int Count(String currentCount)
    {
        try
        {
            count = Integer.parseInt(currentCount);
        }
        catch (NumberFormatException e)
        {
            return 0;
        }

        return ++count;
    }
}
