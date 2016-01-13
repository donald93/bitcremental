package mcpartland.donald.bitcrement.Controllers;

import com.google.inject.Inject;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Donald on 1/10/16.
 */
public class CountControllerTest
{

    @Test
    public void Count_ValidParameter_ParameterPlusOne()
    {
        int input = 1234;
        int expected = 1235;

        CountController testController = CreateTestCountController();

        int output = testController.Count(input);
        Assert.assertEquals(output, expected);
    }

    private CountController CreateTestCountController()
    {
        return new CountController();
    }

}