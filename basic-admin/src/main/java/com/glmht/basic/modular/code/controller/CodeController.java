package com.glmht.basic.modular.code.controller;

import com.glmht.basic.core.base.controller.BaseController;
import com.glmht.basic.core.config.properties.DruidProperties;
import com.glmht.basic.generator.action.config.WebGeneratorConfig;
import com.glmht.basic.generator.action.model.GenQo;
import com.glmht.basic.modular.code.factory.DefaultTemplateFactory;
import com.glmht.basic.modular.code.service.TableService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 代码生成控制器
 *
 * @author mht
 * @Date 2017年11月30日16:39:19
 */
@Controller
@RequestMapping("/code")
public class CodeController extends BaseController {

    private static String PREFIX = "/code";

    @Autowired
    private TableService tableService;

    @Autowired
    private DruidProperties druidProperties;

    /**
     * 跳转到代码生成主页
     */
    @RequestMapping("")
    public String blackboard(Model model) {
        model.addAttribute("tables", tableService.getAllTables());
        model.addAttribute("params", DefaultTemplateFactory.getDefaultParams());
        model.addAttribute("templates", DefaultTemplateFactory.getDefaultTemplates());
        return PREFIX + "/code.html";
    }

    /**
     * 生成代码
     */
    @ApiOperation("生成代码")
    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    @ResponseBody
    public Object generate(GenQo genQo) {
        genQo.setUrl(druidProperties.getUrl());
        genQo.setUserName(druidProperties.getUsername());
        genQo.setPassword(druidProperties.getPassword());
        WebGeneratorConfig webGeneratorConfig = new WebGeneratorConfig(genQo);
        webGeneratorConfig.doMpGeneration();
        webGeneratorConfig.doBasicGeneration();
        return SUCCESS_TIP;
    }
}
