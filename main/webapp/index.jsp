<%@ include file="/core_content/header.jspp"%>

<c:url var="list" value="/person/list" />

<div class="container">
	<h1>Spring boot application</h1>
	<p>
		Message is
		<c:out value="${message}" />
	</p>
	<p>
		<a href="${list}">Course</a>
	</p>
</div>

<%@ include file="/core_content/footer.jspp"%>
