package com.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Here is where the different views / widgets first get wired up.
        Button btn1 = (Button)findViewById(R.id.button1);
        Button sender = (Button)findViewById(R.id.button2);
        //TextView txt = (TextView)findViewById(R.id.editText1);
        
        //This is how the listener is registered so that it can be processed.
        btn1.setOnClickListener(btnListener);
        sender.setOnClickListener(sendListener);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    //How the original button will process it's click
    private OnClickListener btnListener = new OnClickListener() {
    	public void onClick(View v) {
    		String testing = new String();
    		testing = "hello there";
    		
    		Toast.makeText(getBaseContext(),
    				"Hello readers there",
    				Toast.LENGTH_LONG).show();
    		
    		Toast.makeText(getBaseContext(), 
    				"Do not mess with me", 
    				Toast.LENGTH_LONG).show();
    	}
    };
    //How the send button will process it's click
    private OnClickListener sendListener = new OnClickListener() {
    	public void onClick(View y) {
    		String testing = "Will be sent shortly";
    		
    		Toast.makeText(
    				getBaseContext(), 
    				testing, 
    				Toast.LENGTH_LONG).show();
    	}
    };
}
