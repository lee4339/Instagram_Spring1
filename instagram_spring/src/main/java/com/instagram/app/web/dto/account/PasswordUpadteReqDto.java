package com.instagram.app.web.dto.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PasswordUpadteReqDto {
	private String originPassword;
	private String newPassword;
}
