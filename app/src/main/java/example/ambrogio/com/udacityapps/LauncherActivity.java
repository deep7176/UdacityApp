package example.ambrogio.com.udacityapps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

    }

    public void buttonClicked(View v){
        Context context = getApplicationContext();
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

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
