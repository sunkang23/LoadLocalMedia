package com.example.herve.localmedia.utils.pickmedia.listener;

import com.example.herve.localmedia.utils.pickmedia.MediaBean;

import java.util.ArrayList;

/**
 * Created by Herve on 2016/7/20.
 */
public interface PickMedia<T extends MediaBean> {
    ArrayList<T> getChildPathList(int position);

    void readMedia();
}
