package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import org.pursuit.psychic_app_hw.R;

public class ChoiceFragmentTwo extends Fragment {
    private View rootview;


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
        Toast.makeText(getActivity(), ""+ position, Toast.LENGTH_LONG).show();

        rootview = inflater.inflate(R.layout.fragment_choice_fragment_two, container, false);

        return rootview;    }

}
