package app.leo.jenison.com.touchdelegate;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by jenison-3631 on 19/03/18.
 */

public class CustomFrameLayout extends FrameLayout {
    public CustomFrameLayout(@NonNull Context context) {
        super(context);
        intt();
    }

    public CustomFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        intt();
    }

    public CustomFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        intt();
    }


    void intt(){
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("event "," "+event.getX()+" "+event.getY());
                return true;
            }
        });
    }
}
