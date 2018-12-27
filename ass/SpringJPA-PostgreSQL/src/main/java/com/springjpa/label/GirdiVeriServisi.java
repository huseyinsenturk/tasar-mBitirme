package com.springjpa.label;



public interface GirdiVeriServisi {
    void save(Girdi girdi);
    Girdi findByLabelId(Long labelId);

}
