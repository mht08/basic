package com.glmht.basic.modular.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.glmht.basic.modular.system.model.Expense;

/**
 * <p>
  * 报销表 Mapper 接口
 * </p>
 *
 * @author mht
 * @since 2017-12-04
 */
@Mapper
public interface ExpenseMapper extends BaseMapper<Expense> {

}