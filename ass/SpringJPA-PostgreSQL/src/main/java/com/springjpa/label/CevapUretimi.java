package com.springjpa.label;

import com.google.common.collect.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CevapUretimi implements ApplicationContextAware {

    private final Map<String, BiletUretim> generatorMap = Maps.newConcurrentMap();

    @Autowired
    private BiletServisi biletServisi;



    @Autowired
    private GirdiServisi girdiServisi;




    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        for (Carrier carrier : Carrier.values()) {
        //    generatorMap.put(carrier.name(), applicationContext.getBean(carrier.generatorClass));
        }

    }

    //	@Transactional
    public IstekCevabi generateLabel(MultipartFile labelInput, String carrier,
                                               String userName) throws Exception {

        IstekCevabi istekCevabi = new IstekCevabi();
        Bilet bilet = generatorMap.get(carrier).generate(labelInput, userName); // TODO Romania refactor




//        istekCevabi.setAdi(bilet.getMusteriAdi());
//
//        istekCevabi.setFirmasi(bilet.getFirmaAdi());
//        istekCevabi.setKoltukNo(bilet.getKoltukNo());
//        istekCevabi.setSoyadı(bilet.getSoyadi());
//        istekCevabi.setTc(bilet.getTc());
//        istekCevabi.setUretimTarihi(bilet.getUretimTarihi().toString());
//
//




        biletServisi.saveLabel(bilet);

        generatorMap.get(carrier).sendExtraData(bilet);

        girdiServisi.saveInput(labelInput, bilet.getId());

       System.out.println("Creating XML Output");




        return istekCevabi;
    }

}
