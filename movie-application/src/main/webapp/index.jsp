<html>
<head>
    <meta charset="UTF-8">
    <title>Movie Application - Home</title>
    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom Styles -->
    <style>
        body {
            background-color: #121212;
            color: #ffffff;
            font-family: 'Segoe UI', sans-serif;
        }
        .navbar {
            background-color: #1f1f1f;
        }
        .navbar-brand {
            color: #ff4c4c;
            font-weight: bold;
        }
        .navbar-brand:hover {
            color: #ff9999;
        }
        .movie-card {
            background-color: #1f1f1f;
            border: 1px solid #333;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 10px #000;
        }
        .movie-card img {
            height: 300px;
            object-fit: cover;
        }
        .movie-card .card-body {
            padding: 10px;
        }
        .section-title {
            margin: 30px 0 15px;
            border-bottom: 2px solid #ff4c4c;
            display: inline-block;
        }
        .footer {
            margin-top: 50px;
            padding: 20px;
            background-color: #1f1f1f;
            text-align: center;
            color: #aaa;
        }
    </style>
</head>
<body>

    <!-- Navbar -->
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">Movie Application</a>
            <div class="collapse navbar-collapse">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <!-- Hero Section -->
    <div class="container text-center mt-5">
        <h1>Welcome to Movie Application</h1>
        <p class="lead">Explore, search and manage your favorite movies with ease!</p>
    </div>

    <!-- Categories Section -->
    <div class="container">
        <h2 class="section-title">Popular Categories</h2>
        <div class="row">
            <div class="col-md-3">
                <div class="movie-card">
                    <img src="images/action.jpg" class="img-fluid" alt="Action">
                    <div class="card-body text-center">
                        <h5 class="card-title">Action</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="movie-card">
                    <img src="images/comedy.jpg" class="img-fluid" alt="Comedy">
                    <div class="card-body text-center">
                        <h5 class="card-title">Comedy</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="movie-card">
                    <img src="images/drama.jpg" class="img-fluid" alt="Drama">
                    <div class="card-body text-center">
                        <h5 class="card-title">Drama</h5>
                    </div>
                </div>
            </div>
            <div class="col-md-3">
                <div class="movie-card">
                    <img src="images/scifi.jpg" class="img-fluid" alt="Sci-Fi">
                    <div class="card-body text-center">
                        <h5 class="card-title">Sci-Fi</h5>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>