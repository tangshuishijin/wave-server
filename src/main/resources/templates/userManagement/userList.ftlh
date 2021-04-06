<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
    <#include "../head.html">
</head>
<body>
    <ul>
        <#list users as user>
            <li>${user.name} password ${user.password}</li>
        </#list>

    </ul>
<#include "../foot.html">
</body>
</html>