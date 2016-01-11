package mcpartland.donald.bitcrement.Controllers;

/**
 * Created by Donald on 1/5/16.
 */
public class CountController
{
    private int count;

    public int Count(String currentCount)
    {
        count = Integer.parseInt(currentCount);

        return ++count;
    }
}
