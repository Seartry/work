<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<html>
<title>添加用户</title>
</head>
<body>
    <h1>添加用户</h1>
    <form action="" name="sysUserForm">
        姓名：<input type="text" name="userName"><br>
         年龄：<input type="text" name="password"><br>
          <input type="button" value="添加"
            onclick="addSysUser()">
    </form>

    <script type="text/javascript">
        function addSysUser() {
            var form = document.forms[0];
            form.action = "<%=basePath %>sysUser/addSysUser";
            form.method = "post";
            form.submit();
        }
    </script>
</body>
</html>