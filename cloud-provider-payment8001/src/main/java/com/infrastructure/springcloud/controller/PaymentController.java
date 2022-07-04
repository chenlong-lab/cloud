package com.infrastructure.springcloud.controller;

import com.infrastructure.springcloud.entities.Payment;
import com.infrastructure.springcloud.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author chenlong
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @GetMapping("/getById/{id}")
    public Payment getById(@PathVariable("id") Long id) {
        return paymentService.getById(id);
    }
}
