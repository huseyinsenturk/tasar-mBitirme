package com.springjpa.label;

import lombok.*;

/**
 * Entity for Label input
 * <p>
 * Created by Iurii Miedviediev.
 *
 * @author DruidKuma
 * @version 1.0
 * @since 7/15/15
 */
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class BiletBilgileri {

        private String adi;
        private String soyadı;
        private String firmasi;
        private String tc;
        private String koltukNo;
        private String uretimTarihi;


}
