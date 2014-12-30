package com.example.soundswitcher2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	TextView textStatOn, textStaVib, textStatOff;
	AudioManager amanager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		OnStatOn();
		OnStatVib();
		OnStatOff();

	}

	private void OnStatOn() {

		amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

		textStatOn = (TextView) this.findViewById(R.id.textDzwiek);

		textStatOn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				amanager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
				Toast.makeText(getBaseContext(), "W³¹czono dŸwiêki",
						Toast.LENGTH_SHORT).show();

			}
		});

	}

	private void OnStatVib() {

		amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

		textStatOn = (TextView) this.findViewById(R.id.textWibracje);

		textStatOn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				amanager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
				Toast.makeText(getBaseContext(), "W³¹czono wibracje",
						Toast.LENGTH_SHORT).show();

			}
		});
	}

	private void OnStatOff() {

		amanager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

		textStatOn = (TextView) this.findViewById(R.id.textCisza);

		textStatOn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				amanager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
				Toast.makeText(getBaseContext(), "Tryb cichy",
						Toast.LENGTH_SHORT).show();

			}
		});

	}

}
