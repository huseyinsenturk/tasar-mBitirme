package com.springjpa.label;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Iurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 2/18/16
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class  Cevaplar {
    private Integer durum;
    private String error;
    private String sablon;
    private String rd;
    private String pkn;
    private String cikisXml;
    private String musteriNo;
    private Long EtiketId;
}
