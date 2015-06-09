package materialtest.com.example.sam.homer_new;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;


public class Homer extends ActionBarActivity {
Button button,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action();
        action2();
        action3();
        action4();

    }
public void action()
{
    final Context context = this;
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View arg0) {

            Intent intent = new Intent(context, Electricity.class);
            startActivity(intent);

        }
    });

}


    public void action2()
    {
        final Context context = this;
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, IncomeTax.class);
                startActivity(intent);

            }
        });

    }
    public void action3() {
        final Context context = this;
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, PropertyTax.class);
                startActivity(intent);

            }
        });

    }

    public void action4() {
        final Context context = this;
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context,WaterTax.class);
                startActivity(intent);

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
