package com.tianshaokai.video;

import android.content.Intent;

import java.util.List;

/**
 * Created by Administrator on 2016/11/21.
 */

public class VideoInfo {
    private String name;
    private List<Video> samples;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Video> getSamples() {
        return samples;
    }

    public void setSamples(List<Video> samples) {
        this.samples = samples;
    }
}
