package com.glmht.basic.modular.system.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.glmht.basic.modular.system.dao.RelationMapper;
import com.glmht.basic.modular.system.model.Relation;
import com.glmht.basic.modular.system.service.IRelationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色和菜单关联表 服务实现类
 * </p>
 *
 * @author mht123
 * @since 2018-02-22
 */
@Service
public class RelationServiceImpl extends ServiceImpl<RelationMapper, Relation> implements IRelationService {

}
