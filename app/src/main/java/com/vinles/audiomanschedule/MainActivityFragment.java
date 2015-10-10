package com.vinles.audiomanschedule;

import android.app.Fragment;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vinles.audiomanschedule.databinding.FragmentMainBinding;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class MainActivityFragment extends Fragment{

    private AudioConfs audioConfs;
    private FragmentMainBinding mBinding;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        audioConfs = getAudioConfs();

        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false);

        mBinding.setData(audioConfs);

        View v = mBinding.getRoot();

        return v;
    }

    private AudioConfs getAudioConfs()
    {
        AudioConfs audioConfs = new AudioConfs();

        //Seta datahora atual
        audioConfs.setCalendar(GregorianCalendar.getInstance(TimeZone.getDefault()));


        //Contexto do servico de audio
        AudioManager aManager = (AudioManager)getActivity().getSystemService(Context.AUDIO_SERVICE);

        //get RingerMode conf
        audioConfs.setRingerMode(aManager.getRingerMode());

        if(audioConfs.getRingerMode() == Integer.toString(AudioManager.RINGER_MODE_NORMAL))
        {
            audioConfs.setRingerModeDesc("RINGER_MODE_NORMAL");
        }
        else if(audioConfs.getRingerMode() == Integer.toString(AudioManager.RINGER_MODE_SILENT))
        {
            audioConfs.setRingerModeDesc("RINGER_MODE_SILENT");
        }
        else if(audioConfs.getRingerMode() == Integer.toString(AudioManager.RINGER_MODE_VIBRATE))
        {
            audioConfs.setRingerModeDesc("RINGER_MODE_VIBRATE");
        }
        else
        {
            audioConfs.setRingerModeDesc("unknown");
        }


        audioConfs.setAlarm(aManager.getStreamVolume(AudioManager.STREAM_ALARM));
        audioConfs.setAlarm_max(aManager.getStreamMaxVolume(AudioManager.STREAM_ALARM));

        audioConfs.setDtmf(aManager.getStreamVolume(AudioManager.STREAM_DTMF));
        audioConfs.setDtmf_max(aManager.getStreamMaxVolume(AudioManager.STREAM_DTMF));

        audioConfs.setMusic(aManager.getStreamVolume(AudioManager.STREAM_MUSIC));
        audioConfs.setMusic_max(aManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));

        audioConfs.setNotification(aManager.getStreamVolume(AudioManager.STREAM_NOTIFICATION));
        audioConfs.setNotification_max(aManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION));

        audioConfs.setRing(aManager.getStreamVolume(AudioManager.STREAM_RING));
        audioConfs.setRing_max(aManager.getStreamMaxVolume(AudioManager.STREAM_RING));

        audioConfs.setSystem(aManager.getStreamVolume(AudioManager.STREAM_SYSTEM));
        audioConfs.setSystem_max(aManager.getStreamMaxVolume(AudioManager.STREAM_SYSTEM));

        audioConfs.setVoice_call(aManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL));
        audioConfs.setVoice_call_max(aManager.getStreamMaxVolume(AudioManager.STREAM_VOICE_CALL));

        return audioConfs;
    }


}
