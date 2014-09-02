package com.example.profile;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.SearchManager.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity implements OnClickListener {
	private TextView T1 , T2 , T3 , T4 , T5, T6, T7, T8, T9;
	private Button B1 , B2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Monita();
    }
	private void Monita() {
		// TODO Auto-generated method stub
		T1 = (TextView) findViewById(R.id.txt1);
		T2 = (TextView) findViewById(R.id.txt2);
		T3 = (TextView) findViewById(R.id.txt3);
		T4 = (TextView) findViewById(R.id.txt4);
		T5 = (TextView) findViewById(R.id.txt5);
		T6 = (TextView) findViewById(R.id.txt6);
		T7 = (TextView) findViewById(R.id.txt7);
		T8 = (TextView) findViewById(R.id.txt8);
		T9 = (TextView) findViewById(R.id.txt9);
        T1.setText("Monita Morm");
        T2.setText("  Age                      21");
        T3.setText("  Height                   155cm");
        T4.setText("  Sign                     Capricorn");
        T5.setText("  Smoker                   No");
        T6.setText("  Ethnicity                Cambodian");
        T7.setText("  Body Type                Prefer not to say");
        T8.setText("  Religion                 Buddhism");
        T9.setText("  City                     Phnom Penh");
        B1 = (Button) findViewById(R.id.btn1 );
        B2 = (Button) findViewById(R.id.btn2 );
        B1.setOnClickListener(this);
        B2.setOnClickListener(this);    
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.btn1:
			
			break;
		case R.id.btn2:
			Intent a = new Intent(MainActivity.this,nii.class);
			startActivity(a);
			
			break;

		default:
			break;
		}
		
	}
}
