package com.springjpa.label;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by Iurii Miedviediev.
 *
 * @author DruidKuma
 * @version 1.0
 * @since 8/4/15
 */
public interface BiletDeposu<E extends Bilet> extends JpaRepository<E, Long>, JpaSpecificationExecutor<E> {

    E findFirstByTrackingNumberStartingWithOrderByGenerationDateDesc(String trackingNumber);

}
