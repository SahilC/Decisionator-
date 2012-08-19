package com.app;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class AppActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button b1;
	EditText t1;
	TextView t2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        b1=(Button)findViewById(R.id.button1);
        t1=(EditText)findViewById(R.id.editText1);
        t2=(TextView)findViewById(R.id.textView4);
        b1.setOnClickListener(this);
        
    }
	@Override
	public void onClick(View v) {
		 String str=t1.getText().toString();
		 t2.setText("");
		 if(str.equals(""))
	        {
	        	t2.setText("Y U NO ASK QUESTION?");
	        	str=t1.getText().toString();
	        }
		 else{
		Intent inte=new Intent(AppActivity.this,response.class);
		startActivity(inte);
		 }
	}

}