修改界面
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    String path = request.getContextPath();  
    String basePath = request.getScheme() + "://"  
            + request.getServerName() + ":" + request.getServerPort()  
            + path + "/";  
%>  
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>编辑用户</title>

<script type="text/javascript">
    function updateSysUser() {
        var form = document.forms[0];
        form.action = "<%=basePath %>sysUser/updateSysUser";
        form.method = "post";
        form.submit();
    }
</script>

</head>
<body>
    <h1>添加用户</h1>
    <form action="" name="sysUserForm">
        <input type="hidden" name="userId" value="${sysUser.userId }" /> 姓名：<input
            type="text" name="userName" value="${sysUser.userName }" /> 年龄：<input
            type="text" name="password" value="${sysUser.password }" /> <input type="button"
            value="编辑" onclick="updateSysUser()" />
    </form>
</body>

</html>