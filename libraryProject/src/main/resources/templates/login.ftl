<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>News- Вход</title>
<#include 'common/header.ftl'/>

</head>
<body>


<#if model.error == true>
    <h1>Неверно введен имя пользователяи пароль</h1>
</#if>
<div class="container">
<form name="registrationForm"
       method="post"
        action="/login">
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="text" class="form-control col-md-4" name="email" aria-describedby="emailHelp" placeholder="Enter email">

    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control col-md-4" name="password" placeholder="Password">
    </div>
    <div class="form-check">
        <input type="checkbox" class="form-check-input" name="remember-me">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>