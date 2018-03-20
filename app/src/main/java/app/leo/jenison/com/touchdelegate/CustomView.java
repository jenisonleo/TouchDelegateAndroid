package app.leo.jenison.com.touchdelegate;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by jenison-3631 on 19/03/18.
 */

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
        intt();
    }
    private Toast toast;

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
                if(toast!=null){
                    toast.cancel();
                }
                toast=Toast.makeText(getContext()," "+event.getX()+" "+event.getY(),Toast.LENGTH_SHORT);
                toast.show();
                Log.e("child "," "+event.getX()+" "+event.getY());
                return true;
            }
        });
    }
}
