package mcpartland.donald.bitcrement.Controllers;

/**
 * Created by Donald on 1/10/16.
 */
public class ConversionController
{
    public String ConvertIntToString(int count)
    {
        String bits = Integer.toBinaryString(count);

        while(bits.length() < 8)
        {
            bits = "0" + bits;
        }
        return bits;
    }

    public int ConvertStringToInt(String bits)
    {
        int currentCount = 0;
        int index = 0;

        while(index < bits.length())
        {
            char currentBit = bits.charAt(index);

            if(currentBit == '1')
            {
                if(index == bits.length() - 1)
                {
                    currentCount++;
                }
                else
                {
                    currentCount = currentCount + (int)Math.pow(2, (bits.length() - index - 1));
                }
            }

            index++;
        }

        return currentCount;
    }
}
