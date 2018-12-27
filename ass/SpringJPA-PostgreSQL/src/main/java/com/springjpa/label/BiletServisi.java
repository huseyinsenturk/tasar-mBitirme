package com.springjpa.label;


import java.util.Optional;

public interface BiletServisi {



     void saveLabel(Bilet bilet);

    Optional<Bilet> findByTrackingNumber(String trackingNumber);
}
