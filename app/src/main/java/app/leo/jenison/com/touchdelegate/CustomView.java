package app.leo.jenison.com.touchdelegate;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jenison-3631 on 19/03/18.
 */

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
        intt();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        intt();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        intt();
    }
    void intt(){
        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e("child "," "+event.getX()+" "+event.getY());
                return true;
            }
        });
    }
}
