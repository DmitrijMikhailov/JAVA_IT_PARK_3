





<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>


<!doctype html>

<html lang="en">
<head>
    <title>News- Регистрация</title>

    <link rel="stylesheet" href="/css/style.css">

</head>
<body>

<#include 'common/header.ftl'/>
    <#--<#if model.user??>-->
        <#--<div>-->
            <#--${model.user.surname}-->
            <#--<br>-->
            <#--${model.user.name}-->
        <#--</div>-->
    <#--<#else >-->
    <#--<div>-->
        <#--<a href="/login">Войти</a>-->
    <#--</div>-->
    <#--</#if>-->
<div class="container">
<blockquote class="blockquote">
    <p class="mb-0">Меня зовут Шерлок Холмс.Моя профессия - знать то,чего не знают другие.</p>
    <footer class="blockquote-footer">"Записки о Шерлоке Холмсе"<cite title="Source Title">Артур Конан Дойл</cite></footer>
</blockquote>
</div>



<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img class="d-block w-100" src="/images/1.png" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="/images/1.png" alt="Second slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="/images/1.png" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<#--<img src="/images/1.png" class="img-fluid" alt="Responsive image">-->
<#--<p><img src="/images/1.png" width="200px" height="200px" alt="1.png"></p>-->

<div class="container">
<#include 'common/footer.ftl'/>
</div>

</body>
</html>