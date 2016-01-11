package mcpartland.donald.bitcrement.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.inject.Inject;

import mcpartland.donald.bitcrement.Controllers.ConversionController;
import mcpartland.donald.bitcrement.Controllers.CountController;
import mcpartland.donald.bitcrement.R;
import roboguice.activity.RoboActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main_counter)
public class MainCounterActivity extends RoboActivity
{

    @InjectView(R.id.mainCounterText)
    TextView mainCounterText;

    @InjectView(R.id.mainCounterButton)
    TextView mainCounterButton;

    @Inject
    CountController countController;
    @Inject
    ConversionController conversionController;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    public void MainCounterButtonOnClick(View view)
    {
        UpdateCount();
    }

    private void UpdateCount()
    {
        String currentCount = (String) mainCounterText.getText();

        int newCount = countController.Count(currentCount);

        String newCountText = conversionController.Convert(newCount);

        mainCounterText.setText(newCountText);
    }

}
