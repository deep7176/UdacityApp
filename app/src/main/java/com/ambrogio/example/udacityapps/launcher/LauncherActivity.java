package com.ambrogio.example.udacityapps.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ambrogio.example.R;


public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //launches a lesson app depending on what menu item is selected
        switch (item.getItemId()) {
            case R.id.action_lesson_one:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void buttonClicked(View v){
        CharSequence start = "This button will launch my ";
        CharSequence clicked = "";

        switch (v.getId()){
            case R.id.button:
                clicked = ((Button) findViewById(R.id.button)).getText();
                break;
            case R.id.button2:
                clicked = ((Button) findViewById(R.id.button2)).getText();
                break;
            case R.id.button3:
                clicked = ((Button) findViewById(R.id.button3)).getText();
                break;
            case R.id.button4:
                clicked = ((Button) findViewById(R.id.button4)).getText();
                break;
            case R.id.button5:
                clicked = ((Button) findViewById(R.id.button5)).getText();
                break;
            case R.id.button6:
                clicked = ((Button) findViewById(R.id.button6)).getText();
                break;
            default:
                clicked = "Invalid button ID";
                break;
        }
        String text = "" + start + clicked + "!";

        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }


}
