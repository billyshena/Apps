<h2>Liste des produits contenant '${modele.motClef }'</h2>
<table border="1" width="80%">
	<tr>
		<th> Id </th> <th> Nom </th> <th> Prix </th>
	</tr>
		<c:forEach items="${modele.listProduits }" var="produit">
	<tr>
		<td> <c:out value="${produit.idProduit }"/> </td>
		<td> <c:out value="${produit.nomProduit }"/> </td>
		<td> <c:out value="${produit.prixProduit }"/> </td>
	</tr>
</c:forEach>
</table>