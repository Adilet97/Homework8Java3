package com.example.homework8java3.Second_page;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework8java3.Character.CharacterModel;
import com.example.homework8java3.R;
import com.example.homework8java3.databinding.FragmentCharacterBinding;
import com.example.homework8java3.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentSecondBinding.inflate(LayoutInflater.from(getContext()),container,false);
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        CharacterModel characterModel =  SecondFragmentArgs.fromBundle(getArguments()).getModel();
        binding.AliveRickSecond.setImageResource(characterModel.getImage());
        binding.textAlive2.setText(characterModel.getText1());
        binding.textRick2.setText(characterModel.getText2());

        if (characterModel.getEarth() != null && characterModel.getPlanet() !=null){

            binding.textAlive2.setText(characterModel.getPlanet());
            binding.textRick2.setText(characterModel.getEarth());
        }

    }
}