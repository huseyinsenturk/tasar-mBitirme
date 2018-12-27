package com.springjpa.label;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;


public interface BiletUretimi {

    Bilet generate(MultipartFile labelFile, String userName);

    default void populateBaseLabel(Bilet bilet, BiletBilgileri biletBilgi) {
        bilet.setUretimTarihi(new Date());

        bilet.setFirmaAdi(biletBilgi.getFirmasi());
        bilet.setMusteriAdi(biletBilgi.getAdi());
        bilet.setTc(biletBilgi.getTc());



    }
}

