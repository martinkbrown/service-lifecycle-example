package mbrown.example.servicelifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ServiceLifeCycleExample extends Activity {
    
	Intent myIntent;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        myIntent = new Intent(this, MyService.class);
        
        Button b = (Button) findViewById(R.id.button1);
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
				startService(myIntent);
				finish();
			}
		});
        
    }
    
    @Override
    public void onDestroy() {
    
    	super.onDestroy();
    	Toast.makeText(getApplicationContext(), "Activity.onDestroy()", Toast.LENGTH_SHORT).show();
    	
    }
}