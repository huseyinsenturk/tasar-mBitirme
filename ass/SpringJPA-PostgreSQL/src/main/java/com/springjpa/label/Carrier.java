package com.springjpa.label;

public enum  Carrier {

BILETIX (BiletUretim.class);


    public Class<? extends BiletUretim> generatorClass;

    Carrier(Class<? extends BiletUretim> generatorClass) {
        this.generatorClass = generatorClass;
    }

}
