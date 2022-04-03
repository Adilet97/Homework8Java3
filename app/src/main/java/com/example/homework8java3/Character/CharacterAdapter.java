package com.example.homework8java3.Character;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework8java3.databinding.ItemCharacterBinding;

import java.util.ArrayList;

public class CharacterAdapter extends RecyclerView.Adapter <CharacterAdapter.ViewHolderCharacter>{
    private ArrayList<CharacterModel> characterModels;
    private OnClickCharacter listener;

    public CharacterAdapter( ArrayList<CharacterModel> characterModels,OnClickCharacter listener) {
        this.characterModels = characterModels;
        this.listener=listener;
    }

    @NonNull
    @Override
    public ViewHolderCharacter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderCharacter(ItemCharacterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCharacter holder, @SuppressLint("RecyclerView") int position) {
        holder.bind(characterModels.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.OnClick(characterModels.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return characterModels.size();
    }

     class  ViewHolderCharacter extends RecyclerView.ViewHolder {
        private ItemCharacterBinding binding;
        public ViewHolderCharacter(@NonNull ItemCharacterBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(CharacterModel characterModel) {
            binding.Rick.setImageResource(characterModel.getImage());
            binding.AliveRick.setText(characterModel.getText1());
            binding.textRick.setText(characterModel.getText2());
        }
    }
}
