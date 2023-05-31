package com.rms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "USER_TBL")
public class UserEntity {
	@Id
	@GeneratedValue(generator = "user-id-generator")
	@GenericGenerator(name = "user-id-generator", strategy = "com.rms.generators.UserIdGenerator")
	private String userId;

	private String userName;

	private String password;

	private String email;

	private String role;
}
