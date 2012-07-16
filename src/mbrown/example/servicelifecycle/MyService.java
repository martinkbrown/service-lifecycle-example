package mbrown.example.servicelifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void onCreate() {
		Toast.makeText(getApplicationContext(), "Service.onCreate()", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public int onStartCommand(Intent i, int flags, int a) {
		
		Toast.makeText(getApplicationContext(), "Service.onStartCommand()", Toast.LENGTH_SHORT).show();
		
		//stopSelf();
		
		return START_STICKY;
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		Toast.makeText(getApplicationContext(), "Service.onDestroy()", Toast.LENGTH_SHORT).show();
	}

}
