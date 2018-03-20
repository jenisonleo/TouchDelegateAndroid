package app.leo.jenison.com.touchdelegate;

import android.graphics.Rect;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.*;
import android.view.TouchDelegate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Rect r=new Rect();
                findViewById(R.id.container).getHitRect(r);
                Log.e("rectv "," "+r.toString());
                r.set(r.left-200,r.top-200,r.right+200,r.bottom+200);
                Log.e("rectv "," "+r.toString());
                findViewById(R.id.innerView).setTranslationX(-100);
                findViewById(R.id.parent).setTouchDelegate(new app.leo.jenison.com.touchdelegate.TouchDelegate(r,findViewById(R.id.container)));
            }
        },2000);

    }
}
