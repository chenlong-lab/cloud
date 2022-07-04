package com.infrastructure.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.infrastructure.springcloud.dto.PaymentResultDTO;
import com.infrastructure.springcloud.entities.Payment;
import com.infrastructure.springcloud.mapper.PaymentMapper;
import com.infrastructure.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author chenlong
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {

    @Override
    public Payment getById(Long id) {
        return this.baseMapper.selectById(id);
    }
}
