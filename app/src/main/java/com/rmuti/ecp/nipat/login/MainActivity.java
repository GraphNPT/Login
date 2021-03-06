package com.rmuti.ecp.nipat.login;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("test", "test log cat");
        setContentView(R.layout.activity_main);
        Button btnLogin = (Button)findViewById(R.id.btn_login);
            btnLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.v("test", "click me...");

                    EditText editText = (EditText)findViewById(R.id.user_name);
                    String message = editText.getText().toString();
                    Log.v("test",message);

                    EditText editText2 = (EditText)findViewById(R.id.User_pass);
                    String password = editText2.getText().toString();
                    Log.v("test", password);

                    if(message.equals(password)){
                        Log.v("test", "same value");
                    }else{
                        Log.v("test", "Difference value");
                    }
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
