package app.leo.jenison.com.touchdelegate;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by jenison-3631 on 19/03/18.
 */

public class TouchDelegate extends android.view.TouchDelegate {
    private Rect bounds;
    private View delegateView;
    private Rect rect=new Rect();

    public TouchDelegate(Rect bounds, View delegateView) {
        super(bounds, delegateView);
        this.bounds = bounds;
        this.delegateView = delegateView;
        delegateView.getHitRect(rect);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        System.out.println("bounds "+" "+event.getX()+" "+event.getY());
//        return super.onTouchEvent(event);
        if(bounds.contains((int)event.getX(),(int)event.getY())){
            float x1,y1;
            x1=(float)(event.getX()-rect.left);
            y1=(float)(event.getY()-rect.top);
            event.setLocation(x1,y1);
            return delegateView.dispatchTouchEvent(event);
        }
        return false;
    }
}
