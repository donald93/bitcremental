package mcpartland.donald.bitcrement.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.inject.Inject;

import mcpartland.donald.bitcrement.Controllers.BitcrementController;
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
    BitcrementController bitcrementController;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


    }

    public void MainCounterButtonOnClick(View view)
    {
        mainCounterText.setText(bitcrementController.toString());
    }

}
