package com.glmht.basic.modular.future.controller;

import com.glmht.basic.core.base.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import com.glmht.basic.core.log.LogObjectHolder;
import org.springframework.web.bind.annotation.RequestParam;
import com.glmht.basic.modular.system.model.FutureOrder;
import com.glmht.basic.modular.future.service.IFutureOrderService;

/**
 * FutureOrder控制器
 *
 * @author mht
 * @Date 2019-09-16 20:12:33
 */
@Controller
@RequestMapping("/futureOrder")
public class FutureOrderController extends BaseController {

    private String PREFIX = "/future/futureOrder/";

    @Autowired
    private IFutureOrderService futureOrderService;

    /**
     * 跳转到FutureOrder首页
     */
    @RequestMapping("")
    public String index() {
        return PREFIX + "futureOrder.html";
    }

    /**
     * 跳转到添加FutureOrder
     */
    @RequestMapping("/futureOrder_add")
    public String futureOrderAdd() {
        return PREFIX + "futureOrder_add.html";
    }

    /**
     * 跳转到修改FutureOrder
     */
    @RequestMapping("/futureOrder_update/{futureOrderId}")
    public String futureOrderUpdate(@PathVariable Integer futureOrderId, Model model) {
        FutureOrder futureOrder = futureOrderService.selectById(futureOrderId);
        model.addAttribute("item",futureOrder);
        LogObjectHolder.me().set(futureOrder);
        return PREFIX + "futureOrder_edit.html";
    }

    /**
     * 获取FutureOrder列表
     */
    @RequestMapping(value = "/list")
    @ResponseBody
    public Object list(String condition) {
        return futureOrderService.selectList(null);
    }

    /**
     * 新增FutureOrder
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public Object add(FutureOrder futureOrder) {
        futureOrderService.insert(futureOrder);
        return SUCCESS_TIP;
    }

    /**
     * 删除FutureOrder
     */
    @RequestMapping(value = "/delete")
    @ResponseBody
    public Object delete(@RequestParam Integer futureOrderId) {
        futureOrderService.deleteById(futureOrderId);
        return SUCCESS_TIP;
    }

    /**
     * 修改FutureOrder
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Object update(FutureOrder futureOrder) {
        futureOrderService.updateById(futureOrder);
        return SUCCESS_TIP;
    }

    /**
     * FutureOrder详情
     */
    @RequestMapping(value = "/detail/{futureOrderId}")
    @ResponseBody
    public Object detail(@PathVariable("futureOrderId") Integer futureOrderId) {
        return futureOrderService.selectById(futureOrderId);
    }
}
