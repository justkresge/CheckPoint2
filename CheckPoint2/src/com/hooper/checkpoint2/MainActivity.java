package com.hooper.checkpoint2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {

	ImageButton playbtn;
	ImageButton scoresbtn;
	ImageButton settingsbtn;
	ImageButton aboutbtn;
	ImageButton exitbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		playbtn = (ImageButton) findViewById(R.id.play_btn);
		scoresbtn = (ImageButton) findViewById(R.id.scores_btn);
		settingsbtn = (ImageButton) findViewById(R.id.settings_btn);
		aboutbtn = (ImageButton) findViewById(R.id.about_btn);
		exitbtn = (ImageButton) findViewById(R.id.exit_btn);

		playbtn.setOnClickListener(this);
		scoresbtn.setOnClickListener(this);
		settingsbtn.setOnClickListener(this);
		aboutbtn.setOnClickListener(this);
		exitbtn.setOnClickListener(this);
	}
		
		@Override
		public void onClick(View v) {

			if(v.getId() == R.id.play_btn) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.PlayActivity");
				startActivity(openPlayAct);	
			}
			if(v.getId() == R.id.scores_btn) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.ScoresActivity");
				startActivity(openPlayAct);	
			}
			if(v.getId() == R.id.about_btn) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.AboutActivity");
				startActivity(openPlayAct);	
			}
			if(v.getId() == R.id.settings_btn) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.SettingsActivity");
				startActivity(openPlayAct);	
			}
			if(v.getId() == R.id.exit_btn) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.ExitActivity");
				startActivity(openPlayAct);	
			}
			

		}
	
	};

