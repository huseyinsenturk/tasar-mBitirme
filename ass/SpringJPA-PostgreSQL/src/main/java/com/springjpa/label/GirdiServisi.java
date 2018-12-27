package com.springjpa.label;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.multipart.MultipartFile;


public interface GirdiServisi {
    @Async
    void saveInput(MultipartFile file, Long labelId);

}
