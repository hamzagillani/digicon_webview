package digiconvalley.project444;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash_app extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE); // For Removing the Title Bar

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,


                WindowManager.LayoutParams.FLAG_FULLSCREEN); // Remove the notification bar


        setContentView(R.layout.splash_app);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {


                Intent mainIntent = new Intent(Splash_app.this,MainActivity.class);
                startActivity(mainIntent);
                finish();
            }
            }, SPLASH_TIME_OUT);
    }
}
