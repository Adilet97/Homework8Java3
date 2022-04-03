package com.example.homework8java3.Character;

import java.io.Serializable;


public class CharacterModel implements Serializable {
    private int image;
    private String text1;
    private String text2;
    //Location
    private String planet;
    private String earth;
    //end

    public CharacterModel(String planet, String earth) {
        this.planet = planet;
        this.earth = earth;
    }

    public String getPlanet() {
        return planet;
    }

    public String getEarth() {
        return earth;
    }

    public CharacterModel(int image, String text1, String text2) {
        this.image = image;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
