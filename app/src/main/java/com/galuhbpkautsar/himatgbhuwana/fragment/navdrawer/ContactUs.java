package com.galuhbpkautsar.himatgbhuwana.fragment.navdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galuhbpkautsar.himatgbhuwana.MainActivity;
import com.galuhbpkautsar.himatgbhuwana.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUs extends Fragment {

    public ContactUs() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Contact Us");

        return view;
    }
}
