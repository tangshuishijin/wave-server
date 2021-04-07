<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<#include "../head.html">
<body>
    <div class="container">
        <form action="/user/addUser" method="post">
            <table>
                <tr>
                    <td><label class="col-sm1">用户名</label></td>
                    <td> <input class="col-sm1" type="text" name="nickName"/></td>
                </tr>
                <tr>
                    <td> <label class="col-sm1">密码</label></td>
                    <td><input class="col-sm1" type="text" name="password"/></td>
                </tr>
                <tr>
                    <td> <label class="col-sm1">确认密码</label></td>
                    <td><input class="col-sm1" type="text" name="confirmPassword"/></td>
                </tr>
                <tr>
                    <td><input class="col-sm1" type="submit" name="submit"/></td>
                    <td><input class="col-sm1" type="reset" name="reset"/></td>
                </tr>
            </table>

        </form>
    </div>
<#include "../foot.html">
</body>
</html>