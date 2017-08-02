package com.android.gdgvit.aiesec.activity.Main;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.gdgvit.aiesec.R;


public class ICXFragment extends Fragment {


    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.fragment_icx,container,false);

        imageView = (ImageView) root.findViewById(R.id.oget);

        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.icx1), 5000);
        animation.addFrame(getResources().getDrawable(R.drawable.icx2), 5000);
        animation.addFrame(getResources().getDrawable(R.drawable.icx3), 5000);
        animation.setOneShot(false);


        imageView.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();

        return root;
    }


}
