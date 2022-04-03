package com.example.homework8java3;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework8java3.Character.CharacterModel;
import com.example.homework8java3.Character.OnClickCharacter;
import com.example.homework8java3.databinding.ItemLocationBinding;

import java.util.ArrayList;

public class AdapterLocation extends RecyclerView.Adapter<AdapterLocation.ViewHolderLocation> {
    private ArrayList<CharacterModel>list;
    private OnClickCharacter onClickCharacter;

    public AdapterLocation(ArrayList<CharacterModel> list, OnClickCharacter onClickCharacter) {
        this.list = list;
        this.onClickCharacter = onClickCharacter;
    }

    @NonNull
    @Override
    public ViewHolderLocation onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderLocation(ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderLocation holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(list.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickCharacter.OnClick(list.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  ViewHolderLocation extends RecyclerView.ViewHolder {
        private ItemLocationBinding binding ;
        public ViewHolderLocation(@NonNull ItemLocationBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(CharacterModel characterModel) {
            binding.planet.setText(characterModel.getPlanet());
            binding.Earth.setText(characterModel.getEarth());

        }
    }
}
