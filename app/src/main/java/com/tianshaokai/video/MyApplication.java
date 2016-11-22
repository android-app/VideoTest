package com.tianshaokai.video;

import android.app.Application;

import org.videolan.vlc.media.MediaUtils;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MediaUtils.init(this);
    }
}
