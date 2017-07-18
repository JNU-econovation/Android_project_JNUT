package com.example.chaeyeon.registeration;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by ChaeYeon on 2017-06-01.
 */

public class SingerItemView extends LinearLayout {
    TextView textView;
    ImageView imageView;

    public SingerItemView(Context context)
    {
        super(context);
        init(context); //초기화 해줘야 한다
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_board,this, true);
        //인플레이션 과정 , board 에 있는 내용을 이 자바 파일에 붙여준다.true라고 하면 바로 붙여 주는 것이다.

        textView = (TextView)findViewById(R.id.textView);
        imageView = (ImageView)findViewById(R.id.imageView);
    }

    public void setName(String name){
        textView.setText(name);
    }

    //public void setMobile(String mobile){ textView2.setText(mobile);}

//    public void setAge(int age){textView3.setText(String.valueOf(age));}

    public void setImage(int resId){
        imageView.setImageResource(resId);
    }
}
