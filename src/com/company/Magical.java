package com.company;

public class Magical extends Player
        implements SuperAbiliti {

    private int superatak;

    public int getSuperatak() {
        return superatak;
    }

    public void setSuperatak(int superatak) {
        this.superatak = superatak;
    }


    @Override
    public void superAbiliti() {
        System.out.println("Применено Супер удар");

    }
}
