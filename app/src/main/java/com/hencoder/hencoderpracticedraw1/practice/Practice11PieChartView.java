package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        Paint paint =new Paint(Paint.ANTI_ALIAS_FLAG);

        canvas.drawArc(200,200,600,600,1,-5,true,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawArc(200,200,600,600,-45,41,true,paint);



        paint.setColor(Color.parseColor("#9932CD"));
        canvas.drawArc(200,200,600,600,15,-14,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(200,200,600,600,25,-10,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(200,200,600,600,70,-45,true,paint);

//        paint.setColor(Color.BLUE);
        paint.setARGB(40,123,343,235);
        canvas.drawArc(200,200,600,600,170,-100,true,paint);

        paint.setColor(Color.RED);
        canvas.drawArc(190,190,590,590,-190,145,true,paint);


    }
}
