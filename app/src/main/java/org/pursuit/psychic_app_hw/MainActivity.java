package org.pursuit.psychic_app_hw;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import org.pursuit.psychic_app_hw.Fragments.MainFragment;
import org.pursuit.psychic_app_hw.Fragments.ResultFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainFragment mainFragment = MainFragment.newInstance();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, mainFragment).addToBackStack(null);
        fragmentTransaction.commit();

    }
//
//    public void startChoice() {
//        Intent intent = new Intent(getApplicationContext(), ResultFragment.class);
//    }

}