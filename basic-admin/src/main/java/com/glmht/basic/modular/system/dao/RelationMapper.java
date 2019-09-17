package com.glmht.basic.modular.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.glmht.basic.modular.system.model.Relation;

/**
 * <p>
  * 角色和菜单关联表 Mapper 接口
 * </p>
 *
 * @author mht
 * @since 2017-07-11
 */
@Mapper
public interface RelationMapper extends BaseMapper<Relation> {

}