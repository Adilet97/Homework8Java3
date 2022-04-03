package com.example.homework8java3.Character;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.homework8java3.R;
import com.example.homework8java3.databinding.FragmentCharacterBinding;

import java.util.ArrayList;

public class CharacterFragment extends Fragment implements OnClickCharacter {

    private FragmentCharacterBinding binding;
    private CharacterAdapter adapter;
    private ArrayList<CharacterModel> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addData();
        adapter = new CharacterAdapter(list, this);
        binding.recyclerCharacter.setAdapter(adapter);


    }

    private void addData() {
        list = new ArrayList<>();
        list.add(new CharacterModel(R.drawable.rick, "Alive", "Rick "));
        list.add(new CharacterModel(R.drawable.morty, "Alive", "Morty "));
        list.add(new CharacterModel(R.drawable.albert, "Dead", "Albert "));
        list.add(new CharacterModel(R.drawable.jerry, "Alive", "Jerry "));
    }

    @Override
    public void OnClick(CharacterModel characterModel) {
       Navigation.findNavController(requireView()).navigate(CharacterFragmentDirections.actionCharacterFragmentToSecondFragment(characterModel));

    }
}