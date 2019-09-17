/**
 * 初始化FutureOrder详情对话框
 */
var FutureOrderInfoDlg = {
    futureOrderInfoData : {}
};

/**
 * 清除数据
 */
FutureOrderInfoDlg.clearData = function() {
    this.futureOrderInfoData = {};
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
FutureOrderInfoDlg.set = function(key, val) {
    this.futureOrderInfoData[key] = (typeof val == "undefined") ? $("#" + key).val() : val;
    return this;
}

/**
 * 设置对话框中的数据
 *
 * @param key 数据的名称
 * @param val 数据的具体值
 */
FutureOrderInfoDlg.get = function(key) {
    return $("#" + key).val();
}

/**
 * 关闭此对话框
 */
FutureOrderInfoDlg.close = function() {
    parent.layer.close(window.parent.FutureOrder.layerIndex);
}

/**
 * 收集数据
 */
FutureOrderInfoDlg.collectData = function() {
    this
    .set('id')
    .set('orderNo')
    .set('userId')
    .set('shippingId')
    .set('payment')
    .set('paymentType')
    .set('postage')
    .set('status')
    .set('paymentTime')
    .set('sendTime')
    .set('endTime')
    .set('closeTime')
    .set('createTime')
    .set('updateTime');
}

/**
 * 提交添加
 */
FutureOrderInfoDlg.addSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/futureOrder/add", function(data){
        Feng.success("添加成功!");
        window.parent.FutureOrder.table.refresh();
        FutureOrderInfoDlg.close();
    },function(data){
        Feng.error("添加失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.futureOrderInfoData);
    ajax.start();
}

/**
 * 提交修改
 */
FutureOrderInfoDlg.editSubmit = function() {

    this.clearData();
    this.collectData();

    //提交信息
    var ajax = new $ax(Feng.ctxPath + "/futureOrder/update", function(data){
        Feng.success("修改成功!");
        window.parent.FutureOrder.table.refresh();
        FutureOrderInfoDlg.close();
    },function(data){
        Feng.error("修改失败!" + data.responseJSON.message + "!");
    });
    ajax.set(this.futureOrderInfoData);
    ajax.start();
}

$(function() {

});
