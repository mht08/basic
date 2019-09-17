/**
 * FutureOrder管理初始化
 */
var FutureOrder = {
    id: "FutureOrderTable",	//表格id
    seItem: null,		//选中的条目
    table: null,
    layerIndex: -1
};

/**
 * 初始化表格的列
 */
FutureOrder.initColumn = function () {
    return [
        {field: 'selectItem', radio: true},
            {title: 'id', field: 'id', visible: false, align: 'center', valign: 'middle'},
            {title: '订单号', field: 'orderNo', visible: true, align: 'center', valign: 'middle'},
            {title: '用户id', field: 'userId', visible: true, align: 'center', valign: 'middle'},
            {title: '配送地址', field: 'shippingId', visible: true, align: 'center', valign: 'middle'},
            {title: '实际付款金额', field: 'payment', visible: true, align: 'center', valign: 'middle'},
            {title: '支付类型', field: 'paymentType', visible: true, align: 'center', valign: 'middle'},
            {title: '运费', field: 'postage', visible: true, align: 'center', valign: 'middle'},
            {title: '订单状态', field: 'status', visible: true, align: 'center', valign: 'middle'},
            {title: '支付时间', field: 'paymentTime', visible: true, align: 'center', valign: 'middle'},
            {title: '发货时间', field: 'sendTime', visible: true, align: 'center', valign: 'middle'},
            {title: '交易完成时间', field: 'endTime', visible: true, align: 'center', valign: 'middle'},
            {title: '交易关闭时间', field: 'closeTime', visible: true, align: 'center', valign: 'middle'},
            {title: '创建时间', field: 'createTime', visible: true, align: 'center', valign: 'middle'},
            {title: '更新时间', field: 'updateTime', visible: true, align: 'center', valign: 'middle'}
    ];
};

/**
 * 检查是否选中
 */
FutureOrder.check = function () {
    var selected = $('#' + this.id).bootstrapTable('getSelections');
    if(selected.length == 0){
        Feng.info("请先选中表格中的某一记录！");
        return false;
    }else{
        FutureOrder.seItem = selected[0];
        return true;
    }
};

/**
 * 点击添加FutureOrder
 */
FutureOrder.openAddFutureOrder = function () {
    var index = layer.open({
        type: 2,
        title: '添加FutureOrder',
        area: ['800px', '420px'], //宽高
        fix: false, //不固定
        maxmin: true,
        content: Feng.ctxPath + '/futureOrder/futureOrder_add'
    });
    this.layerIndex = index;
};

/**
 * 打开查看FutureOrder详情
 */
FutureOrder.openFutureOrderDetail = function () {
    if (this.check()) {
        var index = layer.open({
            type: 2,
            title: 'FutureOrder详情',
            area: ['800px', '420px'], //宽高
            fix: false, //不固定
            maxmin: true,
            content: Feng.ctxPath + '/futureOrder/futureOrder_update/' + FutureOrder.seItem.id
        });
        this.layerIndex = index;
    }
};

/**
 * 删除FutureOrder
 */
FutureOrder.delete = function () {
    if (this.check()) {
        var ajax = new $ax(Feng.ctxPath + "/futureOrder/delete", function (data) {
            Feng.success("删除成功!");
            FutureOrder.table.refresh();
        }, function (data) {
            Feng.error("删除失败!" + data.responseJSON.message + "!");
        });
        ajax.set("futureOrderId",this.seItem.id);
        ajax.start();
    }
};

/**
 * 查询FutureOrder列表
 */
FutureOrder.search = function () {
    var queryData = {};
    queryData['condition'] = $("#condition").val();
    FutureOrder.table.refresh({query: queryData});
};

$(function () {
    var defaultColunms = FutureOrder.initColumn();
    var table = new BSTable(FutureOrder.id, "/futureOrder/list", defaultColunms);
    table.setPaginationType("client");
    FutureOrder.table = table.init();
});
