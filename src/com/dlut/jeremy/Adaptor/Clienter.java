package com.dlut.jeremy.Adaptor;

public class Clienter {

    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
    }

}