 <div class="container" style="display: none;">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12"><button id="button"><span  class="glyphicon glyphicon-remove" style="color: red;"></span></button>
                                    <form id="login-form" action="Page" method="post" role="form" style="display: block;"> 
                                        <h2>LOGIN</h2>
                                        <div class="form-group">
                                            <input type="email" name="mail" id="mail" tabindex="1" class="form-control" placeholder="Email address" required>
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password" required>
                                        </div>
                                        <div class="col-xs-6 form-group pull-left checkbox">
                                            <input id="checkbox1" type="checkbox" name="remember">
                                            <label for="checkbox1">Remember Me</label>   
                                        </div>
                                        <div class="col-xs-6 form-group pull-right">     
                                            <input type="submit" name="login-submit" id="login-submit" tabindex="4" class="form-control btn btn-login" value="Log In">
                                        </div>
                                         <div style="color: red">${error}</div>
                                          <div style="color: red">${regError}</div>
                                    </form>
                                    <form id="register-form" action="index" method="post" role="form" style="display: none;">
                                        <h2>REGISTER</h2>
                                        <div class="form-group">
                                            <input type="text" name="name" id="name" tabindex="1" class="form-control" placeholder="Name" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="lastname" id="lastname" tabindex="1" class="form-control" placeholder="Lastname" value="">
                                        </div>
                                        <div class="form-group">
                                            <select id="country" name="country"class="form-control" required>
                                                <option value="">--Select country--</option>
                                                <option value="Serbia">Serbia</option>
                                                <option value="Germany">Germany</option>
                                                <option value="Macedonia">Maceodonia</option>
                                                <option value="Sweeden">Sweeden</option>
                                                <option value="Italy">Italy</option>
                                                <option value="Romania">Romania</option>
                                                <option value="Hungary">Hungary</option>
                                                <option value="France">France</option>
                                                <option value="Russia">Russia</option>
                                                <option value="Norway">Norway</option>
                                                <option value="Netherlands">Netherlands</option>
                                                <option value="Belgium">Belgium</option>
                                                <option value="Spain">Spain</option>
                                                <option value="Greece">Greece</option>
                                                <option value="United Kingdom">United Kingdom</option>
                                                <option value="Poland">Poland</option>
                                                <option value="Portugal">Portugal</option>
                                                
                                            </select>
                                        </div>
                                        <div class="form-group">
                                            <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="confirm-password" id="confirm-password" tabindex="2" class="form-control" placeholder="Confirm Password">
                                        </div>
                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-sm-6 col-sm-offset-3">
                                                    <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" value="Register Now">
                                                </div>
                                                
                                            </div>
                                        </div>
                                        <div style="color: red">${regError}</div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-6 tabs">
                                    <a href="#" class="active" id="login-form-link"><div class="login">LOGIN</div></a>
                                </div>
                                <div class="col-xs-6 tabs">
                                    <a href="#" id="register-form-link"><div class="register">REGISTER</div></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>