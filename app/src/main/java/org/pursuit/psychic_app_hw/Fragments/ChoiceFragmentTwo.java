package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import org.pursuit.psychic_app_hw.R;

public class ChoiceFragmentTwo extends Fragment {
    private View rootview;

    private ImageButton whitepearls;
    private ImageButton bluepearls;
    private ImageButton blackpearls;
    private ImageButton pinkpearls;

    public ChoiceFragmentTwo() {
    }
    public static ChoiceFragmentTwo newInstance(){
        return new ChoiceFragmentTwo();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = this.getArguments();
        int position = bundle.getInt("selected_image_two");

        rootview = inflater.inflate(R.layout.fragment_choice_fragment_two, container, false);
        startChoice();
        return rootview;    }

    private void startChoice() {
        whitepearls = rootview.findViewById(R.id.pearls1);

        whitepearls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentTwo resultFragment = ResultFragmentTwo.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        bluepearls = rootview.findViewById(R.id.pearls2);

        bluepearls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentTwo resultFragment = ResultFragmentTwo.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        blackpearls = rootview.findViewById(R.id.pearls3);

        blackpearls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentTwo resultFragment = ResultFragmentTwo.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

        pinkpearls = rootview.findViewById(R.id.pearls4);

        pinkpearls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultFragmentTwo resultFragment = ResultFragmentTwo.newInstance();
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragment_container, resultFragment).addToBackStack(null);
                ft.commit();

            }
        });

    }

}
