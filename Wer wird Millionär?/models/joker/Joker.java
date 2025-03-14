package models.joker;

import models.Frage;

public abstract class Joker {
    protected boolean verwendet;

    public Joker() {
        this.verwendet = false;
    }

    public abstract void einsetzen(Frage frage);

    public boolean isVerwendet() {
        return verwendet;
    }
}
