package com.xworkz.soldger.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldgerDTO extends AbstractAuditDTO
{
	@NotNull
	@NotBlank
	@Size(min=4,max=20 , message="name must be > 4 & < 20")
	private String name;
	@Min(value=0 ,message="value must be greater than 0")
	@Max(1000)
	private int id;
	@NotNull
	@NotBlank
	@Size(min=5, max=50, message="rank must be in >5 & <50")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3 , max=40 , message="batallion must be in >3 & <40")
	private String batallion;
	@NotNull
	@NotBlank
	@Size(min=4 , max=40 , message="country must in >4 & <40")
	private String country;
}
