package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@Table(name = "StudentInformation")

@NoArgsConstructor
@RequiredArgsConstructor
public class StudentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	@NonNull
	@Column(length = 20)
	private String Name;
	@NonNull
	private Double Fees;
	@NonNull
	private Long No;

}
