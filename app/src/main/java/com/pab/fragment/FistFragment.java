package com.pab.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FistFragment extends Fragment {

    View view;
    Button firstButton;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_first, container, false);
        firstButton = view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(view -> {
            Toast.makeText(getActivity(), "First Fragment", Toast.LENGTH_LONG).show();

        });
        return view;
    }

    ;
}

