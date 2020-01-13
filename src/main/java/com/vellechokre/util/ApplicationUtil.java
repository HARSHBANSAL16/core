package com.vellechokre.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.vellechokre.bo.SuccessResponse;

public class ApplicationUtil {

  public static ResponseEntity<SuccessResponse> getResponseEntity(final String message) {

    return new ResponseEntity<>(new SuccessResponse(HttpStatus.OK.value(), message), HttpStatus.OK);
  }

  public static ResponseEntity<SuccessResponse> getResponseEntity(final String message,
      final Object data) {

    return new ResponseEntity<>(new SuccessResponse(HttpStatus.OK.value(), message, data),
        HttpStatus.OK);
  }
}
