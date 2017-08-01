<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/26
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
  <meta charset="UTF-8">
  <meta content="yes" name="apple-mobile-web-app-capable" />
  <meta content="black" name="apple-mobile-web-app-status-bar-style" />
  <meta content="telephone=no" name="format-detection" />
  <meta   content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0"
          name="viewport">
  <!-- 主文件 -->
  <link rel="stylesheet"
        href="https://a.alipayobjects.com/g/antui/antui/10.0.18/dpl/antui-all.css" />
  <!-- 组件 -->
  <link rel="stylesheet"
        href="https://a.alipayobjects.com/g/antui/antui/10.0.18/dpl/??widget/message.css,widget/notice.css,widget/page-result.css" />
  <link rel="stylesheet" type="text/css"
        href="../static/css/weui.custom.css?v=20170616" />
  <!-- js -->
  <script src="https://a.alipayobjects.com/g/antui/antui/10.0.18/antui.js"></script>
  <script src="https://a.alipayobjects.com/g/h5-lib/alipayjsapi/3.0.5/alipayjsapi.min.js"></script>
  <script type="text/javascript" src="../static/js/zepto/zepto.min.js"></script>
  <script type="text/javascript" src="../static/js/lrz.bundle.js"></script>
  <script type="text/javascript">
    $(function() {

    });

    function commit(){
      var certNo = document.getElementById("certNo").value;
      var certName = document.getElementById("certName").value;
      var mobile = document.getElementById("mobile").value;

       $.ajax({
             url: "${pageContext.request.contextPath}/my/saveUserInfo",
             type: 'post',
             data: {certNo:certNo,certName:certName,mobile:mobile},
             dataType: 'text',
             timeout: 200000,
             success: function(data){
               alert(data);
             }
       });
    }
  </script>
  <title></title>
</head>
<body>
<div class="head " id="head">
  <div class="head-back" id="back"></div>
  <div>身份证认证</div>
</div>
<div class="am-list am-list-form head-top">
  <div class="am-list-body">
    <div class="am-list-item">
      <div class="am-list-label">姓名</div>
      <div class="am-list-control">
        <input placeholder="请输入真实姓名" value="" type="text" id="certName">
      </div>
    </div>
    <div class="am-list-item">
      <div class="am-list-label">身份证号</div>
      <div class="am-list-control">
        <input placeholder="请输入真实身份证号" value="" type="text" id="certNo">
      </div>
    </div>
    <div class="am-list-item">
      <div class="am-list-label">联系方式</div>
      <div class="am-list-control">
        <input placeholder="请输入您的联系方式" value="" type="text" id="mobile" required="true">
      </div>
    </div>
  </div>
</div>
<div class="am-button-wrap">
  <button id="uploadImg" class="am-button blue" onclick="commit()">保存</button>
  <div></div>
</div>
</body>
</html>
