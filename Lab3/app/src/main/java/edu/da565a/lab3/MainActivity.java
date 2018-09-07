package edu.da565a.lab3;

import android.app.*;
import android.os.*;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends Activity
{
	TextView tv1;
	GestureDetector gd;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		tv1 = (TextView)findViewById(R.id.mainTextView1);

		gd = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener()
			{
				@Override  
				public boolean onDown(MotionEvent e)  
				{
					return true;  
				}  

				@Override
				public boolean onSingleTapConfirmed(MotionEvent e)  
				{  
					tv1.setText("Single tap");
					return true;  
				}  

				@Override
				public boolean onDoubleTap(MotionEvent e)  
				{
					tv1.setText("Double tap");
					return true;  
				}  

				@Override
				public void onLongPress(MotionEvent e)
				{
					tv1.setText("Long press");
					super.onLongPress(e);
				}
			});
    }

	@Override
	public boolean onTouchEvent(MotionEvent event)
	{
		this.gd.onTouchEvent(event);
		return super.onTouchEvent(event);
	}
}
