package mr_auspicious.shivam_kr_shiv.com.menus1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView; // Declaring the textview variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu); //inflating the menu layout
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {



            //When we click on red option
            case R.id.red:
                textView = (TextView) findViewById(R.id.text); //Initializing the variable..
                textView.setText(R.string.option1); //sets the text to Red.
                textView.setTextColor(getResources().getColor(R.color.Red)); // sets the text color to Red.
                return true;


            // When we click on blur option
            case R.id.blue:
                textView = (TextView) findViewById(R.id.text); //Initializing the variable..
                textView.setText(R.string.option2); //sets the text to Blue.
                textView.setTextColor(getResources().getColor(R.color.Blue)); //sets the text color to Blue.
                return true;

            //When we click on Green option
            case R.id.green:
                textView = (TextView) findViewById(R.id.text); //Initializing the variable..
                textView.setText(R.string.option3); //sets the text to Green.
                textView.setTextColor(getResources().getColor(R.color.Green));// sets the text color to Green.
                return true;


        }
        return super.onOptionsItemSelected(item);
    }

}
