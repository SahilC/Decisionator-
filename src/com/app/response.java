package com.app;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;

public class response extends Activity {
    /** Called when the activity is first created. */
	String response[]={"Yes","No","What U smoking, Bro?","Äre you nuts?","Not Bad","One does not Simply ask a phone what to do!","Y U NO ALREADY DO IT?" };
	TextView t1;
	ImageView img;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.response);
        Random r1=new Random();
		int i=r1.nextInt(8);
        t1=(TextView)findViewById(R.id.textView3);
        img=(ImageView)findViewById(R.id.imageView1);
        t1.setText(response[i]);
        switch(i)
        {
        case 0:
        	img.setImageResource(R.drawable.yes);
        	break;
        case 1:
        	img.setImageResource(R.drawable.no);

        	break;
        case 2:
        	img.setImageResource(R.drawable.chinese);

        	break;
        case 3:
        	img.setImageResource(R.drawable.wtf);

        	break;
        case 4:
        	img.setImageResource(R.drawable.notbad);

        	break;
        case 5:
        	img.setImageResource(R.drawable.one);

        	break;
        case 6:
        	img.setImageResource(R.drawable.yuno);

        	break;
        default:
        	img.setImageResource(R.drawable.apppic);

        	break;
        }
    }
}