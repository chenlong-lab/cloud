package com.infrastructure.springcloud.service;

import com.infrastructure.springcloud.entities.Payment;

/**
 * @author chenlong
 */
public interface PaymentService {

    /**
     * 根据id查询
     * @param id
     * @return PaymentResultDTO
     */
    Payment getById(Long id);
}
