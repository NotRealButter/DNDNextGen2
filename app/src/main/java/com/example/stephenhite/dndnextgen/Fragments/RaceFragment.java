package com.example.stephenhite.dndnextgen.Fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.stephenhite.dndnextgen.R;


/**
 * Created by Stephen Hite on 3/29/2015.
 */
public class RaceFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    View v;

    public static RaceFragment newInstance() {
        RaceFragment fragment = new RaceFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.race_fragment, container, false);
        Spinner raceSpinner = (Spinner) v.findViewById(R.id.raceSpinner);
        ArrayAdapter<CharSequence> raceAdapter = ArrayAdapter.createFromResource(getActivity().getApplicationContext(), R.array.race_array, R.layout.spinner_item);
        raceAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        raceSpinner.setAdapter(raceAdapter);
        raceSpinner.setOnItemSelectedListener(this);

        return v;
    }

    public static RaceFragment newInstance(String param1, String param2) {
        RaceFragment fragment = new RaceFragment();


        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);

        return fragment;
    }

    public RaceFragment() {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        ImageView image = (ImageView) getView().findViewById(R.id.race_picture);
        switch (position) {
            case 1:
                image.setImageResource(R.drawable.human);
                break;
            case 2:
                image.setImageResource(R.drawable.elf);
                break;
            case 3:
                image.setImageResource(R.drawable.halfling);
                break;
            case 4:
                image.setImageResource(R.drawable.halforc);
                break;
            case 5:
                image.setImageResource(R.drawable.dwarf);
                break;
            case 6:
                image.setImageResource(R.drawable.gnome);
                break;
            case 7:
                image.setImageResource(R.drawable.elf);
                break;
            case 8:
                image.setImageResource(R.drawable.halforc);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}