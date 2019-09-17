package com.glmht.basic.core.util;

import com.glmht.basic.core.common.constant.Const;
import com.glmht.basic.config.properties.BasicProperties;
import com.glmht.basic.core.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 *
 * @author mht
 * @date 2017-08-17 16:55
 */
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        BasicProperties basicProperties = SpringContextHolder.getBean(BasicProperties.class);
        if (!basicProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<MenuNode>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
