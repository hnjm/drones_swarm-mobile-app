package pt.iscte.drones_swarm_mobile_app.Activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import pt.iscte.drones_swarm_mobile_app.R;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button buttonStart = (Button) findViewById(R.id.button_start);

        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent main = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(main);
            }
        });


        Button buttonAbout = (Button) findViewById(R.id.button_about);

        buttonAbout.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){

                Intent main = new Intent(SecondActivity.this, AboutActivity.class);
                startActivity(main);
            }
        });
    }
}