package mcpartland.donald.bitcrement.Controllers;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Donald on 1/10/16.
 */
@RunWith(Parameterized.class)
public class ConversionControllerTest
{
    private int input;
    private String expected;

    public ConversionControllerTest(int input, String expected)
    {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void Convert_ValidParameter_ReturnsSelfAsBinary()
    {
        ConversionController conversionController = CreateConversionController();

        String output = conversionController.Convert(input);

        Assert.assertEquals(expected, output);
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                { 0, "00000000"},
                { 1, "00000001" },
                { 255, "11111111"},
                { 113, "01110001" }
        });
    }

    private ConversionController CreateConversionController()
    {
        return new ConversionController();
    }
}