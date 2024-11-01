package com.adv.global.exception;





import com.adv.global.model.CustomError;
import com.adv.global.util.GlobalConstant;

import java.util.Collections;

public class NotFoundException extends SABBaseException {

	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(Collections.singletonList(new CustomError(GlobalConstant.NOT_FOUND_ERROR_CODE, message,
				GlobalConstant.NOT_FOUND_ERROR_TYPE)));
	}
}
