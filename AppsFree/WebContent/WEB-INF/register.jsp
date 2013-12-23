<form method="post" style="text-align:center;" class="register" action="/FreeArt/newUser" >
						<h3>Enregistrez-vous</h3>
						<h5> <c:out value="${errorMessage }"></c:out> </h5>
						<div class="column">
							<div>
								<label>Prénom:</label>
								<input type="text" name="userPrenom"/>
							</div>
							<div>
								<label>Nom:</label>
								<input type="text" name="userNom"/>
							</div>
							<div>
								<label>Website:</label>
								<input type="text" name="userWebsite"/>
							</div>
						</div>
						<div class="column">
							<div>
								<label>Pseudo:</label>
								<input type="text" name="userPseudo"/>
							</div>
							<div>
								<label>Email:</label>
								<input type="text" name="userEmail"/>
							</div>
							<div>
								<label>Mot de passe:</label>
								<input type="password" name="userPassword"/>
							</div>
						</div>
						<div class="bottom">
							<input type="submit" value="Register" />
							<a href="login.jsp" rel="login" class="linkform">Vous avez déjà un compte?</a>
							<div class="clear"></div>
						</div>
					</form>