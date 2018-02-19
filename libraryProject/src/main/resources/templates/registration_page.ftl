<#ftl encoding='UTF-8'>

<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
    <#include 'common/header.ftl'/>
</head>
<body>

<#--<form class="form-style-4" title="Регистрация"-->
      <#--name="registrationForm"-->
      <#--method="post"-->
      <#--action="/registration">-->
    <#--<input type="text" name="name" placeholder="Имя"/>-->
    <#--<br>-->
    <#--<input type="text" name="surname" placeholder="Фамилия"/>-->
    <#--<br>-->
    <#--<input type="text" name="email" placeholder="Почта"/>-->
    <#--<br>-->
    <#--<input type="password" name="password" placeholder="Пароль"/>-->
    <#--<br>-->

    <#--<input type="submit"/>-->
<#--</form>-->

<div class="container">
<form name="registrationForm"
      method="post"
      action="/registration">
    <div class="form-group">
        <label for="exampleInputEmail1">Name</label>
        <input type="text" class="form-control col-md-4" name="name" aria-describedby="emailHelp" placeholder="Name">

    </div>

    <div class="form-group">
        <label for="exampleInputEmail1">Surname</label>
        <input type="text" class="form-control col-md-4" name="surname" aria-describedby="emailHelp" placeholder="Surname">

    </div>
    <div class="form-group">
        <label for="exampleInputEmail1">Email address</label>
        <input type="text" class="form-control col-md-4" name="email" aria-describedby="emailHelp" placeholder="Email">

    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Password</label>
        <input type="password" class="form-control col-md-4" name="password" placeholder="Password">
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</body>
</html>