<html >
<head>
    <meta charset="UTF-8">
    <title>Simple PureCss dropdown menu with following subnav</title>
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


    <link rel="stylesheet" href="/css/style.css">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</head>

<body>
<!-- not responsive yet -->
<nav class="navbar navbar-dark bg-dark">
    <div class="container-fluid col-md-10">
        <div class="row">
            <a href="/" class="navbar-brand"> Books</a>
            <div class="col">
                <ul class="nav nav-pills">
                    <li class="nav-item ">
                        <a class="nav-link" href="/">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button"
                           aria-haspopup="true" aria-expanded="false">Log/Reg</a>
                        <div class="dropdown-menu">
                                <a class="dropdown-item" href="/profile">Profile</a>
                                <a class="dropdown-item" href="/registration/">Registration</a>
                                <a class="dropdown-item" href="/login/">Login</a>
                                <a class="dropdown-item" href="/logout/">Logout</a>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/addBook">Add Book</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/allBook">All Books</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="form-inline">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <a href="" onclick=" this.href='/search?value=' + document.getElementById('search').value"><button class="btn btn-outline-success my-2 my-sm-0">Search</button></a>
        </div>
    </div>

</nav>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>