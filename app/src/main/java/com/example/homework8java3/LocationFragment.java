package com.example.homework8java3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework8java3.Character.CharacterFragmentDirections;
import com.example.homework8java3.Character.CharacterModel;
import com.example.homework8java3.Character.OnClickCharacter;
import com.example.homework8java3.databinding.FragmentLocationBinding;

import java.util.ArrayList;

public class LocationFragment extends Fragment implements OnClickCharacter {
    private FragmentLocationBinding binding;
    private ArrayList<CharacterModel> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentLocationBinding.inflate(LayoutInflater.from(requireActivity()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addData();
        AdapterLocation adapterLocation = new AdapterLocation(list, this);
        binding.recyclerLocation.setAdapter(adapterLocation);
    }

    private void addData() {
        list=new ArrayList<>();
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
        list.add(new CharacterModel("Planet", "Earth"));
    }

    @Override
    public void OnClick(CharacterModel characterModel) {
        Navigation.findNavController(requireView()).navigate(LocationFragmentDirections.actionLocationFragmentToSecondFragment(characterModel));
    }
}