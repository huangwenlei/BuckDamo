package com.example.pictrueactivity;

import com.example.pictrueactivity.adapter.ImageAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	private Context mContext;
	private GridView mGrideView;
	private ImageAdapter mAdapter;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mGrideView = (GridView) findViewById(R.id.gridView);
		
	}

	

}
