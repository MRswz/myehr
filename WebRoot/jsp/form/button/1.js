<div>
    <input type="text" readonly="readonly" id="filename" name="filename" placeholder="未选择任何文件" class="required" />
    <span id="uploadify"></span>
</div>



$('#uploadify').Huploadify({
    fileTypeExts: "*.xls;*.xlsx;", // 扩展名
    uploader: '../Handler/UploadExcel.ashx',           // 服务器端处理地址
    auto: true, // 选择之后，自动开始上传
    showUploadedPercent: false,
    //swf: '../../../Utility/Ueditor/plugins/uploadify/uploadify.swf',    // 上传使用的 Flash
    buttonText: "上传文件",                 // 按钮上的文字
    buttonCursor: 'hand',                // 按钮的鼠标图标
    fileObjName: 'Filedata',            // 上传参数名称
    fileTypeDesc: "请选择 xls xlsx 文件",     // 文件说明
    multi: false,               // 是否支持同时上传多个文件
    overrideEvents: ['onDialogClose'],
    fileSizeLimit: '2048',
    //文件选择后的容器ID
    queueID: 'uploadfileQueue',
    onUploadProgress: function (file, bytesUploaded, bytesTotal, totalBytesUploaded, totalBytesTotal) {
        //有时候上传进度什么想自己个性化控制，可以利用这个方法
        //使用方法见官方说明
    },
    //选择上传文件后调用
    onSelect: function (file) {
        layer.load();
    },
    //返回一个错误，选择文件的时候触发
    onSelectError: function (file, errorCode, errorMsg) {
        closeload();
        var str = '';
        switch (errorCode) {
            case -110:
                alert("上传失败，文件大小不能超过2M");
                break;
            case -120:
                alert("上传失败，文件大小不能超过2M");
                break;
            case -130:
                alert("您上传的文件格式不对，请重新选择");
                break;
        }
    },
    //检测FLASH失败调用
    onFallback: function () {
        $('.xubox_shade').remove();
        $('.xubox_layer').remove();
        alert("您未安装FLASH控件，无法上传文件！请安装FLASH控件后再试。");
    },
    //上传到服务器，服务器返回相应信息到data里
    onUploadSuccess: function (file, data, response) {
        $('.xubox_shade').remove();
        $('.xubox_layer').remove();
        if (data === "1") {
            layer.alert("文件格式不正确！");
        }
        else if (data === "0") {
            layer.alert("上传出错！");
        } else {
            $("#filename").val(data);
            GetImportData();
        }
    },
    onCancel: function (file) {
    }
});
