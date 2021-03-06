package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.pursuit.psychic_app_hw.R;
import org.pursuit.psychic_app_hw.model.Guess;
import org.pursuit.psychic_app_hw.model.GuessDataBaseHelper;

import java.util.List;
import java.util.Random;

public class ResultFragment extends Fragment {
    private View rootView;
    private ImageView imageView;
    private TextView textView;


    public ResultFragment() {
        // Required empty public constructor
    }

    public static ResultFragment newInstance() {
        return new ResultFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_result, container, false);
        startChoice();
        return rootView;
    }

    private void startChoice() {
        GuessDataBaseHelper guessDataBaseHelper = new GuessDataBaseHelper(getContext(), GuessDataBaseHelper.DATABASE_NAME, null, 1);
        List<Guess> newGuess = guessDataBaseHelper.getGuessList();

        imageView = rootView.findViewById(R.id.result_image);
        int[] images = {R.drawable.diamond, R.drawable.blackdiamond, R.drawable.bluediamond, R.drawable.pinkdiamond};
        Random rand = new Random();
        int result = rand.nextInt(images.length);
        imageView.setImageResource(images[result]);
        textView = rootView.findViewById(R.id.frag_results_one);

        if (images[result] == R.drawable.diamond) {
            textView.setText(R.string.winner);
            for (Guess g : newGuess) {
                Log.d("Guess ", "Right" + g.getRight());

            }
        } else if (images[result] != R.drawable.diamond) {
            textView.setText(R.string.wrong_guess);
            for (Guess g : newGuess) {
                Log.d("Guess ", "Wrong" + g.getWrong());

            }
        }

    }
}
