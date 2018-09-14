package digiconvalley.project444;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE); // For Removing the Title Bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); // Remove the notification bar


        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {


                Intent mainIntent = new Intent(MainActivity.this,Draw.class);
                startActivity(mainIntent);
                finish();
            }
            }, SPLASH_TIME_OUT);
    }
}
