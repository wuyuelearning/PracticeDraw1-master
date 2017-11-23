package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图


        Paint paint =new Paint(Paint.ANTI_ALIAS_FLAG);

        paint.setColor(Color.WHITE);
        canvas.drawLine(150,150,150,500,paint);
        canvas.drawLine(150,500,850,500,paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(180,490,230,500,paint);
        canvas.drawRect(280,400,320,500,paint);
        canvas.drawRect(370,400,420,500,paint);
        canvas.drawRect(470,230,520,500,paint);
        canvas.drawRect(570,200,620,500,paint);
        canvas.drawRect(670,240,720,500,paint);
        canvas.drawRect(770,200,820,500,paint);

        paint.setColor(Color.WHITE);
        canvas.drawText("Froyo",190,520,paint);
        canvas.drawText("GB",290,520,paint);
        canvas.drawText("ICS",380,520,paint);
        canvas.drawText("JB",480,520,paint);
        canvas.drawText("KitKat",580,520,paint);
        canvas.drawText("L",690,520,paint);
        canvas.drawText("M",790,520,paint);
    }
}
