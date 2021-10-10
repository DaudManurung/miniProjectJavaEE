<%@ include file="layout.jsp" %>

<div class="container">
	<div class="row">
		<div class="col-sm-4">
      		<div class="panel panel-primary">
      			<div class="panel-heading">
      				${berita.id} - ${berita.judul}
      			</div>
      			<div class="panel-body">
      				<p>ID : ${berita.id}  </p>
      				<p>Judul : ${berita.judul}  </p>
      				<p>Isi : ${berita.isi}  </p>
      			</div>
      		</div>
      	</div>
	</div>
</div>

</body>
</html>