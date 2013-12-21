<div class="wrapper">
			<div class="content">
				<div id="form_wrapper" class="form_wrapper">
					<form class="login active" method="post" action="/FreeArt/auth">
						<h3>Login</h3>
							<h5> <c:out value="${message }"></c:out> </h5>
						<div>
							<label>Pseudo:</label>
							<input type="text" name="userPseudo"/>
						</div>
						<div>
							<label>Password: <a href="/FreeArt/forgotp" rel="forgot_password" class="forgot linkform">Oubli du mot de passe?</a></label>
							<input type="password" name="userPassword" />
						</div>
						<div class="bottom">
							<input type="submit" value="Login"></input>
							<a href="/FreeArt/register" rel="register" class="linkform">Pas encore de compte ? Enregistrez-vous</a>
							<div class="clear"></div>
						</div>
					</form>
					
				</div>
				<div class="clear"></div>
			</div>
		</div>
		
