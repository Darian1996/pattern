package com.darian.pattern_23._24_Command.ex2;

public abstract class Command {
    private Peddler peddler;


    public Command(Peddler peddler) {
        this.peddler = peddler;
    }

    public Peddler getPeddler() {
        return peddler;
    }

    public void setPeddler(Peddler peddler) {
        this.peddler = peddler;
    }

    public abstract void sail();
}
