<div class="bg-content"> 
    <div class="row-1">
        <div class="container">
    		<div class="row-2">
<table border="1" width="100%">
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
</div>
</div>
</div>
</div>