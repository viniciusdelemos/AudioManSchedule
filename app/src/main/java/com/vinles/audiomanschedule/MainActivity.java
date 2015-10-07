package com.vinles.audiomanschedule;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void AudioConfsRead()
    {
        AudioConfs audioConfs = new AudioConfs();

        AudioManager aManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        audioConfs.RingerMode = aManager.getRingerMode();

        if(audioConfs.RingerMode == AudioManager.RINGER_MODE_NORMAL)
        {
            audioConfs.RingerModeDesc = "RINGER_MODE_NORMAL";
        }
        else if(audioConfs.RingerMode == AudioManager.RINGER_MODE_SILENT)
        {
            audioConfs.RingerModeDesc = "RINGER_MODE_SILENT";
        }
        else if(audioConfs.RingerMode == AudioManager.RINGER_MODE_VIBRATE)
        {
            audioConfs.RingerModeDesc = "RINGER_MODE_VIBRATE";
        }
        else
        {
            audioConfs.RingerModeDesc = "unknown";
        }

        audioConfs.Stream_ALARM = aManager.getStreamVolume(AudioManager.STREAM_ALARM);
        audioConfs.Stream_ALARM_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_ALARM);

        audioConfs.Stream_DTMF = aManager.getStreamVolume(AudioManager.STREAM_DTMF);
        audioConfs.Stream_DTMF_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_DTMF);

        audioConfs.Stream_MUSIC = aManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        audioConfs.Stream_MUSIC_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        audioConfs.Stream_NOTIFICATION = aManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION);
        audioConfs.Stream_NOTIFICATION_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION);

        audioConfs.Stream_RING = aManager.getStreamVolume(AudioManager.STREAM_RING);
        audioConfs.Stream_RING_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_RING);

        audioConfs.Stream_SYSTEM = aManager.getStreamVolume(AudioManager.STREAM_SYSTEM);
        audioConfs.Stream_SYSTEM_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_SYSTEM);

        audioConfs.Stream_VOICE_CALL = aManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL);
        audioConfs.Stream_VOICE_CALL_Max = aManager.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL);
    }
}
