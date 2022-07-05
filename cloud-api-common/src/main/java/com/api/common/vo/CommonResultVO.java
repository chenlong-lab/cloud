package com.api.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenlong
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResultVO<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResultVO(Integer code, String message) {
        this(code, message, null);
    }
}
