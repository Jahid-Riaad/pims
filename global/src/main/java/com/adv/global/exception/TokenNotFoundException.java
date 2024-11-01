package com.adv.global.exception;

import com.adv.global.model.CustomError;
import com.adv.global.util.GlobalConstant;

import java.util.Collections;

public class TokenNotFoundException extends SABBaseException {


    private static final long serialVersionUID = 1L;

    public TokenNotFoundException(String message) {
        super(Collections.singletonList(new CustomError(GlobalConstant.TOKEN_NOT_FOUND_ERROR_CODE, message,
                GlobalConstant.TOKEN_NOT_FOUND_ERROR_TYPE)));
    }
}
