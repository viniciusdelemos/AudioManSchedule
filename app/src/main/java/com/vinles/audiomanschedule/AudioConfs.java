package com.vinles.audiomanschedule;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.format.DateUtils;

import java.util.Calendar;

public class AudioConfs extends BaseObservable{

    private Calendar calendar;

    private int ringerMode;

    private String ringerModeDesc;

    private int alarm;
    private int alarm_max;

    private int dtmf;
    private int dtmf_max;

    private int music;
    private int music_max;

    private int notification;
    private int notification_max;

    private int ring;
    private int ring_max;

    private int system;
    private int system_max;

    private int voice_call;
    private int voice_call_max;

    @Bindable
    public String getCalendar() {

        String aux = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH))
                + "/" + Integer.toString(calendar.get(Calendar.MONTH))
                + "/" + Integer.toString(calendar.get(Calendar.YEAR))
                + " " + Integer.toString(calendar.get(Calendar.HOUR))
                + ":" + Integer.toString(calendar.get(Calendar.MINUTE))
                + ":" + Integer.toString(calendar.get(Calendar.SECOND));

        return aux;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Bindable
    public String getRingerMode() {
        return Integer.toString(ringerMode);
    }

    public void setRingerMode(int ringerMode) {
        this.ringerMode = ringerMode;
    }

    @Bindable
    public String getRingerModeDesc() {
        return ringerModeDesc;
    }

    public void setRingerModeDesc(String ringerModeDesc) {
        this.ringerModeDesc = ringerModeDesc;
    }

    @Bindable
    public String getAlarm() {
        return Integer.toString(alarm);
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }
    @Bindable
    public String getAlarm_max() {
        return Integer.toString(alarm_max);
    }

    public void setAlarm_max(int alarm_max) {
        this.alarm_max = alarm_max;
    }

    @Bindable
    public String getDtmf() {
        return Integer.toString(dtmf);
    }

    public void setDtmf(int dtmf) {
        this.dtmf = dtmf;
    }

    @Bindable
    public String getDtmf_max() {
        return Integer.toString(dtmf_max);
    }

    public void setDtmf_max(int dtmf_max) {
        this.dtmf_max = dtmf_max;
    }

    @Bindable
    public String getMusic() {
        return Integer.toString(music);
    }

    public void setMusic(int music) {
        this.music = music;
    }

    @Bindable
    public String getMusic_max() {
        return Integer.toString(music_max);
    }

    public void setMusic_max(int music_max) {
        this.music_max = music_max;
    }

    @Bindable
    public String getNotification() {
        return Integer.toString(notification);
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

    @Bindable
    public String getNotification_max() {
        return Integer.toString(notification_max);
    }

    public void setNotification_max(int notification_max) {
        this.notification_max = notification_max;
    }

    @Bindable
    public String getRing() {
        return Integer.toString(ring);
    }

    public void setRing(int ring) {
        this.ring = ring;
    }

    @Bindable
    public String getRing_max() {
        return Integer.toString(ring_max);
    }

    public void setRing_max(int ring_max) {
        this.ring_max = ring_max;
    }

    @Bindable
    public String getSystem() {
        return Integer.toString(system);
    }

    public void setSystem(int system) {
        this.system = system;
    }

    @Bindable
    public String getSystem_max() {
        return Integer.toString(system_max);
    }

    public void setSystem_max(int system_max) {
        this.system_max = system_max;
    }

    @Bindable
    public String getVoice_call() {
        return Integer.toString(voice_call);
    }

    public void setVoice_call(int voice_call) {
        this.voice_call = voice_call;
    }

    @Bindable
    public String getVoice_call_max() {
        return Integer.toString(voice_call_max);
    }

    public void setVoice_call_max(int voice_call_max) {
        this.voice_call_max = voice_call_max;
    }



}
