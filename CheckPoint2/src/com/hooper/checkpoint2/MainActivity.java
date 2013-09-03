package com.hooper.checkpoint2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

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

		// Tell the Button Clicks

		playbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.PlayActivity");
				startActivity(openPlayAct);

			}
		});

		scoresbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.ScoresActivity");
				startActivity(openPlayAct);
			}
		});

		settingsbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.SettingsActivity");
				startActivity(openPlayAct);

			}
		});
		
		aboutbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.AboutActivity");
				startActivity(openPlayAct);

			}
		});
		
		exitbtn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent openPlayAct = new Intent(
						"com.hooper.checkpoint2.ExitActivity");
				startActivity(openPlayAct);

			}
		});

	}

	
	

}
