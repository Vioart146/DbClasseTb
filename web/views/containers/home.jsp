<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body">
                        <h3 class="card-title">Framework - Generate Project</h3>
                        <div class="col-md-6 p-3 my-2">
                            <div id="notification"><p class="text-primary">.Net MVC</p></div>
                            <form action="Controller_Csharp" method="get" class="user">
                                <div class="form-group p-3">
                                    <input type="text" class="form-control form-control-user"
                                    id="emplacement" aria-describedby="emailHelp"
                                    placeholder="Emplacement du projet" name="emplacement" required>
                                </div>
                                <div class="form-group p-3">
                                    <input type="text" class="form-control form-control-user"
                                    id="base" aria-describedby="emailHelp"
                                    placeholder="Nom de la Base" name="base" required>
                                </div>
                                <button type="submit" class="btn btn-outline-primary btn-icon-text">
                                    <i class="flag-icon flag-icon-fr"></i>Creer le projet .net
                                </button>            
                            </form>
                        </div>
                        <div class="col-md-6 p-3 my-2">
                            <div id="notification"><p class="text-warning">React</p></div>
                            <form action="Controller_React" method="get" class="user">
                                <div class="form-group p-3">
                                    <input type="text" class="form-control form-control-user"
                                    id="emplacement" aria-describedby="emailHelp"
                                    placeholder="Emplacement du projet" name="emplacement" required>
                                </div>
                                <div class="form-group p-3">
                                    <input type="text" class="form-control form-control-user"
                                    id="base" aria-describedby="emailHelp"
                                    placeholder="Nom de la Base" name="base" required>
                                </div>
                                <button type="submit" class="btn btn-outline-warning btn-icon-text">
                                    <i class="flag-icon flag-icon-fr"></i>Creer le projet React
                                </button>            
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
