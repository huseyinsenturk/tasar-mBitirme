package com.springjpa.label;

import org.springframework.data.jpa.repository.JpaRepository;


public interface GirdiVeriKayıt extends JpaRepository<Girdi, Long> {
    Girdi findByLabelId(Long labelId);
}