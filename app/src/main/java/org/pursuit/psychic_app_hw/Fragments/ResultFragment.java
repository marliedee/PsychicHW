package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import org.pursuit.psychic_app_hw.R;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {
private View rootView;
private ImageView imageView;

    public ResultFragment() {
        // Required empty public constructor
    }

    public static ResultFragment newInstance(){ return new ResultFragment();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        imageView = rootView.findViewById(R.id.result_image);
        int[] images = {R.drawable.diamond,R.drawable.blackdiamond,R.drawable.bluediamond,R.drawable.pinkdiamond};
        Random rand = new Random();
        imageView.setImageResource(images[rand.nextInt(images.length)]);

        rootView = inflater.inflate(R.layout.fragment_result, container, false);

        return rootView;
    }

}
