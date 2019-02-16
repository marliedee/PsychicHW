package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.psychic_app_hw.R;

import java.util.Random;

public class ResultFragmentThree extends Fragment {
    private View rootView;
    private ImageView imageView;
    private TextView textView;

    public ResultFragmentThree() {
    }

    public static ResultFragmentThree newInstance() {
        return new ResultFragmentThree();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_result_fragment_three, container, false);
        startChoice();
        return rootView;
    }

    private void startChoice() {

        imageView = rootView.findViewById(R.id.result_image_three);
        int[] images = {R.drawable.gold, R.drawable.platinumgold, R.drawable.blackgold, R.drawable.rosegold};
        Random rand = new Random();
        int result = rand.nextInt(images.length);
        imageView.setImageResource(images[result]);
        textView = rootView.findViewById(R.id.frag_results_three);

    }
}

//        if (rand.nextInt(images[result]) == R.id.ib_diamond) {
//            textView.setText(R.string.winner);
//        }
//        if (rand.nextInt(images[result]) != R.id.ib_diamond) {
//            textView.setText(R.string.wrong_guess);
//        }



