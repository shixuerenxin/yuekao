package com.bwei.radialdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * author:Created by QiZhiWei on 2017/11/30.
 */

public class RadialGradientView extends View {

    private RadialGradient radialGradient=null;
    private Paint paint=null;

    public RadialGradientView(Context context) {
        super(context);
        //1.圆心X坐标2.Y坐标3.半径 4.颜色数组 5.相对位置数组，可为null 6.渲染器平铺模式
        radialGradient = new RadialGradient(240, 240, 240, new int[]{
                Color.YELLOW, Color.GREEN, Color.TRANSPARENT, Color.RED}, null,
                Shader.TileMode.REPEAT);
        paint = new Paint();
    }

    public RadialGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RadialGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setShader(radialGradient);
        canvas.drawCircle(240,360,200,paint);

    }
}
