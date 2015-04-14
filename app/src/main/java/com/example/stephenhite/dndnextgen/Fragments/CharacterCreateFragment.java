package com.example.stephenhite.dndnextgen.Fragments;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.stephenhite.dndnextgen.CreatorLogic.Race;
import com.example.stephenhite.dndnextgen.CreatorLogic.RaceAdapter;
import com.example.stephenhite.dndnextgen.R;

import java.util.ArrayList;

public class CharacterCreateFragment extends Fragment implements AdapterView.OnItemSelectedListener
{
    ArrayList<Race> mRaceItems = new ArrayList<Race>();

    RaceAdapter mRaceAdapter;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public static CharacterCreateFragment newInstance(String param1, String param2)
    {
        CharacterCreateFragment fragment = new CharacterCreateFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public CharacterCreateFragment() {    }

    public void initializeRace()
    {


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_character_create, container, false);
    }

    public OnFragmentInteractionListener getmListener()
    {
        return mListener;
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }

    public interface OnFragmentInteractionListener
    {

        void onFragmentInteraction(Uri uri);
    }

}
