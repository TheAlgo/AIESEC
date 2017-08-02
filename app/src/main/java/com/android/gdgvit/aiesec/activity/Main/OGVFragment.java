package com.android.gdgvit.aiesec.activity.Main;

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

public class OGVFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root;
        root = inflater.inflate(R.layout.fragment_ogv,container,false);

        imageView = (ImageView) root.findViewById(R.id.oget);

        AnimationDrawable animation = new AnimationDrawable();
        animation.addFrame(getResources().getDrawable(R.drawable.ogv1), 5000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogv2), 5000);
        animation.addFrame(getResources().getDrawable(R.drawable.ogv3), 5000);
        animation.setOneShot(false);


        imageView.setBackgroundDrawable(animation);

        // start the animation!
        animation.start();

        return root;
    }


}
