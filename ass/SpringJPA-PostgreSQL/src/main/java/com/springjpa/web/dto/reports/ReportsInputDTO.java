package com.springjpa.web.dto.reports;

import lombok.*;

import java.util.List;

/**
 * Created
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ReportsInputDTO {
	List<String> trackingNumbers;
}
