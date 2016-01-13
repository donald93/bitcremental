package mcpartland.donald.bitcrement.Controllers;

/**
 * Created by Donald on 1/5/16.
 */
public class CountController
{
    private int count;

    public int Count(int currentCount)
    {
        return ++currentCount;
    }
}
