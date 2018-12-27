package com.springjpa.label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class GirdiVeriServisiImpl implements GirdiVeriServisi {

    @Autowired
    private GirdiVeriKayıt girdiVeriKayıt;

    @Override
    public void save(Girdi girdi) {
        girdiVeriKayıt.save(girdi);
    }

    @Override
    public Girdi findByLabelId(Long labelId) {
        return girdiVeriKayıt.findByLabelId(labelId);
    }
}
