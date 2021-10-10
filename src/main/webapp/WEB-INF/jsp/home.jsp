<%@ include file="layout.jsp" %>

<div class="container">
	<table class="table">
		<thead class="bg-primary">
			<tr style="text-align: center">
				<th>ID</td>
				<th>Judul</td>
				<th>Isi</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${berita}" var="B">
				<tr >
					<td>${B.id}</td>
					<td>${B.judul}</td>
					<td>${B.isi}</td>
					<td>
						<center>
							<button type="button" class="btn btn-success" 
							onClick="location.href='/${B.id} ' ">
	          					Detail
	          				</button>
						</center>
					</td>
	          		</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

</body>
</html>