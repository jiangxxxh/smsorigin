function newer_open(title, url) {
    let index = layer.open({
        type: 2,
        title: title,
        content: url
    });
    layer.full(index);
}

/**
 * 弹出层
 * @param title 标题
 * @param url 请求的url
 * @param w 弹出层高度（缺省调默认值）
 * @param h 弹出层宽度（缺省调默认值）
 * @param id 弹出层需要操作的数据id
 */
function layer_show(title, url, w, h, id) {
    if (title == null || title == '') {
        title = false;
    }
    if (url == null || url == '') {
        url = "404.html";
    }
    if (w == null || w == '') {
        w = 800;
    }
    if (h == null || h == '') {
        h = ($(window).height() - 50);
    }
    layer.open({
        type: 2,
        area: [w + 'px', h + 'px'],
        fix: false, //不固定
        maxmin: true,
        shade: 0.4,
        skin: 'layui-layer-rim',
        title: [title, 'background-color:#009688;color:#fff'],
        content: url + '?id=' + id
    });
}

/**
 * 获得layer_show传过来的id
 * @returns {number|string}
 */
function getLayerShowId() {
    let url = window.location.href;
    let index = url.indexOf("id");
    let id;
    if (index !== -1) {
        let start = url.indexOf("=");
        id = url.substring(start + 1);
    } else {
        id = 0;
    }
    return id;
}
