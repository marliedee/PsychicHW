package org.pursuit.psychic_app_hw.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.pursuit.psychic_app_hw.R;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    private View rootView;
    private TextView textView;

    public MainFragment() {
    }

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        textView = rootView.findViewById(R.id.frag_choice_one);
        final Spinner spinner = rootView.findViewById(R.id.choice_spinner);
        final List<String> categories = new ArrayList<>();
        categories.add("-----SELECT TO BEGIN-----");
        categories.add("Gold");
        categories.add("Diamonds");
        categories.add("Pearls");
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
//                Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();

                if (item.equals("Diamonds")) {
                    ChoiceFragment choiceFragment = ChoiceFragment.newInstance();
                    Bundle bundleChoice = new Bundle();
                    bundleChoice.putInt("selected_image", position);
                    choiceFragment.setArguments(bundleChoice);
                    FragmentManager fragmentManager = getFragmentManager();
                    fragmentManager.beginTransaction().add(R.id.fragment_container, choiceFragment).addToBackStack(null).commit();
                }
                if (item.equals("Pearls")) {
                    ChoiceFragmentTwo choiceFragmentTwo = ChoiceFragmentTwo.newInstance();
                    Bundle bundleChoiceTwo = new Bundle();
                    bundleChoiceTwo.putInt("selected_image_two", position);
                    choiceFragmentTwo.setArguments(bundleChoiceTwo);
                    FragmentManager fm1 = getFragmentManager();
                    fm1.beginTransaction().add(R.id.fragment_container, choiceFragmentTwo).addToBackStack(null).commit();
                }
                if (item.equals("Gold")) {
                    ChoiceFragmentThree choiceFragmentThree = ChoiceFragmentThree.newInstance();
                    Bundle bundleChoiceThree= new Bundle();
                    bundleChoiceThree.putInt("selected_image_three", position);
                    choiceFragmentThree.setArguments(bundleChoiceThree);
                    FragmentManager fm2 = getFragmentManager();
                    fm2.beginTransaction().add(R.id.fragment_container, choiceFragmentThree).addToBackStack(null).commit();
                }

            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

        return rootView;
    }
}

