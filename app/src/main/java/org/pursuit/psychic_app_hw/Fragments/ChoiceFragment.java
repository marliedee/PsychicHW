package org.pursuit.psychic_app_hw.Fragments;


import android.content.Intent;
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
import android.widget.Toast;

import org.pursuit.psychic_app_hw.R;

import java.util.Random;

public class ChoiceFragment extends Fragment {
private View rootview;
    private ImageButton pinkdiamond;
    private ImageButton whitediamond;
    private ImageButton blackdiamond;
    private ImageButton bluediamond;


    public ChoiceFragment() {
    }

    public static ChoiceFragment newInstance(){
        return new ChoiceFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = this.getArguments();
        int position = bundle.getInt("selected_image");

        rootview = inflater.inflate(R.layout.fragment_choice, container, false);
        startChoice();

        return rootview;
    }


    private void startChoice() {
        pinkdiamond = rootview.findViewById(R.id.ib_diamond);

        pinkdiamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragment resultFragment = ResultFragment.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        bluediamond = rootview.findViewById(R.id.ib_diamond2);

        bluediamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragment resultFragment = ResultFragment.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        whitediamond = rootview.findViewById(R.id.ib_diamond3);

        whitediamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragment resultFragment = ResultFragment.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        blackdiamond = rootview.findViewById(R.id.ib_diamond4);

        blackdiamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragment resultFragment = ResultFragment.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

    }
}
