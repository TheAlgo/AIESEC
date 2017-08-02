package com.android.gdgvit.aiesec.activity.Main;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.android.gdgvit.aiesec.R;

/**
 * Created by Shuvam Ghosh on 3/27/2017.
 */

public class OGetFragment extends Fragment {


    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.fragment_oget,container,false);

        imageView = (ImageView) root.findViewById(R.id.oget);

        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.ogt1), 4000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogt2), 4000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogt3), 4000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogt4), 4000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogt5), 4000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogt6), 4000);
        animation.setOneShot(false);


        imageView.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();

        return root;
 }


}
