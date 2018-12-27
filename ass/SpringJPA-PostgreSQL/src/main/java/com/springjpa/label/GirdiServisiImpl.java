package com.springjpa.label;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.Charset;


/**
 * Created by Oleksandr Lukichov on 05/06/2017.
 */
@Service
public class GirdiServisiImpl implements GirdiServisi {

    @Autowired
    private GirdiVeriServisi girdiVeriServisi;



    @Override
    @Async
    public void saveInput(MultipartFile file, Long labelId) {
        System.out.println("Start saving input file");

        if (file != null && labelId != null) {
            Girdi girdi = null;
            try {
                girdi = new Girdi(new String(file.getBytes(), Charset.forName("ISO-8859-1")), labelId);
                girdiVeriServisi.save(girdi);
            } catch (Exception ex) {
               System.out.println("Error when saving input data!"+ ex);
            }
        }
        System.out.println("Finish saving input file");
    }
}
