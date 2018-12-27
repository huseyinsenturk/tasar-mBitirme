package com.springjpa.label;

import lombok.*;

import javax.persistence.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity(name = "InputData")
@Table(name = "input_data")
public class Girdi {
    @Id
    @SequenceGenerator(name="input_data_seq", sequenceName="input_data_seq", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="input_data_seq")
    @Column(name = "input_data_id", nullable = false)
    private Long id;

    @Column(name = "input_data_text", columnDefinition = "TEXT")
    private String inputDataText;

    @Column(name = "label_id", nullable = false)
    private Long labelId;

    public Girdi(String inputDataText, Long labelId) {
        this.inputDataText = inputDataText;
        this.labelId = labelId;
    }
}
