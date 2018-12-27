package com.springjpa.label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;




@Repository
public class BiletServisiImpl implements BiletServisi {



    @Autowired
    private BiletDeposu<Bilet> biletDeposu;
/*

    @Override
    public List<Bilet> getLabelsPage(String carrier, DataTablesSettingsDTO settings) {
        Integer startFrom = settings.getIDisplayStart();
        Integer productsOnPage = settings.getIDisplayLength();

        Sort sort = null;
        for (DataTablesSettingsDTO.SortSettings sortSettings : settings.getSortSettings()) {
            if (sort == null) {
                sort = new Sort(new Sort.Order(sortSettings.getSSortDir(), sortSettings.getMDataProp()));
            } else {
                sort = sort.and(new Sort(new Sort.Order(sortSettings.getSSortDir(), sortSettings.getMDataProp())));
            }
        }

        PageRequest request = new PageRequest(startFrom / productsOnPage, productsOnPage, sort);

        if (Strings.isNullOrEmpty(settings.getSSearch())) {
            return labelRepository.findByDeletedIsFalseAndShipperName(carrier, request).getContent();
        }
        return labelRepository.findByDeletedIsFalseAndTrackingNumberContainingIgnoreCase(settings.getSSearch(), request).getContent();
    }
*/



    @Override
    public void saveLabel(Bilet bilet) {
        biletDeposu.saveAndFlush(bilet);
       // System.out.println("Label was added/updated in DB, ID: " + bilet.getId());
    }


    @Override
    public Optional<Bilet> findByTrackingNumber(String trackingNumber) {
        //TODO: change on Optional.ofNullable
        Bilet result = biletDeposu.findFirstByTrackingNumberStartingWithOrderByGenerationDateDesc(trackingNumber);
        if (result != null) {
            return Optional.of(result);
        } else {
            return Optional.empty();
        }
    }

}
