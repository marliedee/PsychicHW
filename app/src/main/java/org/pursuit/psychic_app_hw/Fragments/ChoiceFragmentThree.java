package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import org.pursuit.psychic_app_hw.R;

public class ChoiceFragmentThree extends Fragment {
    private View rootview;
    private ImageButton gold;
    private ImageButton platnium;
    private ImageButton rosegold;
    private ImageButton blackgold;


    public ChoiceFragmentThree() {
    }
    public static ChoiceFragmentThree newInstance() {
        return new ChoiceFragmentThree();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        int position = bundle.getInt("selected_image_three");

        rootview = inflater.inflate(R.layout.fragment_choice_fragment_three, container, false);
        startChoice();
        return rootview;
    }

    private void startChoice() {
        blackgold = rootview.findViewById(R.id.gold1);

        blackgold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentThree resultFragment = ResultFragmentThree.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        rosegold = rootview.findViewById(R.id.gold2);

        rosegold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentThree resultFragment = ResultFragmentThree.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        platnium = rootview.findViewById(R.id.gold3);

        platnium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentThree resultFragment = ResultFragmentThree.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        gold = rootview.findViewById(R.id.gold4);

        gold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentThree resultFragment = ResultFragmentThree.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

    }

}
