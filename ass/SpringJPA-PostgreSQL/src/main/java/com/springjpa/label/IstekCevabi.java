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
public class IstekCevabi {
    private String adi;
    private String soyadı;
    private String firmasi;
    private String tc;
    private String koltukNo;
    private String uretimTarihi;
    private Integer status;
    private String error;
    private String template;
    private String rd;
    private String pkn;
    private String outputXml;
    private String deltiCustNum;
    private Long labelId;
}
