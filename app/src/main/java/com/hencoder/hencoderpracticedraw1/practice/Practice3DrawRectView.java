package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

        Paint paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        Shader shader = new LinearGradient(200,200,300,300, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawRect(100,100,500,500,paint);
//        Shader shader1 = new LinearGradient(0,0,500,500, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.MIRROR);
//        paint.setShader(shader1);
//        canvas.drawRect(300,100,400,200,paint);
//        Shader shader2 = new LinearGradient(0,0,500,500, Color.parseColor("#E91E63"),Color.parseColor("#2196F3"),Shader.TileMode.REPEAT);
//        paint.setShader(shader2);
//        canvas.drawRect(100,300,200,400,paint);
    }
}
