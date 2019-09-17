package com.glmht.basic.modular.future.service.impl;

import com.glmht.basic.modular.system.model.FutureOrder;
import com.glmht.basic.modular.system.dao.FutureOrderMapper;
import com.glmht.basic.modular.future.service.IFutureOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author mht
 * @since 2019-09-16
 */
@Service
public class FutureOrderServiceImpl extends ServiceImpl<FutureOrderMapper, FutureOrder> implements IFutureOrderService {

}
