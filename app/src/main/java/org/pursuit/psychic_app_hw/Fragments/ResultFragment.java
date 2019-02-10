package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.psychic_app_hw.R;
import org.w3c.dom.Text;

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
        rootView = inflater.inflate(R.layout.fragment_result, container, false);
        startChoice();
        return rootView;
    }
    private void startChoice() {
        ImageView imageView;
        TextView textView;
        imageView = rootView.findViewById(R.id.result_image);
        int[] images = {R.drawable.diamond,R.drawable.blackdiamond,R.drawable.bluediamond,R.drawable.pinkdiamond};
        Random rand = new Random();
        int result = rand.nextInt(images.length);
        imageView.setImageResource(images[result]);

        if(rand.nextInt() == R.id.ib_diamond){
            textView = rootView.findViewById(R.id.frag_results_one);
            textView.setText(R.string.winner);
        }else if(rand.nextInt() != R.id.ib_diamond){
            textView = rootView.findViewById(R.id.frag_results_one);
            textView.setText(R.string.wrong_guess);
        }

    }
}
