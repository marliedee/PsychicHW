package org.pursuit.psychic_app_hw.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import org.pursuit.psychic_app_hw.R;

public class ChoiceFragment extends Fragment {
private View rootview;
private ImageView imageView;
    public ChoiceFragment() {
    }

    public static ChoiceFragment newInstance(){
        return new ChoiceFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
//        imageView = rootview.findViewById(R.id.ib_diamond);

//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), ResultFragment.class);
//                v.getContext().startActivity(intent);
//
//            }
//        });


        Bundle bundle = this.getArguments();
        int position = bundle.getInt("selected_image");
        Toast.makeText(getActivity(), ""+ position, Toast.LENGTH_LONG).show();

        rootview = inflater.inflate(R.layout.fragment_choice, container, false);

        return rootview;
    }

}
