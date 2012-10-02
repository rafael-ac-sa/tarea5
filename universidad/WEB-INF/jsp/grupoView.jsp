<%@ include file="/WEB-INF/jsp/include.jsp" %>
<html>
 <head><title><fmt:message key="title"/></title></head>
 <body>
   <h1><fmt:message key="heading"/></h1>
   <p><fmt:message key="mensaje"/> <c:out value="${model.now}"/></p>
   <h3>Grupos</h3>
   <table border="1">
     <tr><th>Nombre</th><th>Numero</th><th>Sigla</th></tr>
     <c:forEach items="${model.grupos}" var="grup">
       <tr><td><c:out value="${grup.nombGrup}"/></td>
       <td><c:out value="${grup.numGrup}"/></td>
       <td><c:out value="${grup.siglaGrup}"/></td></tr>
     </c:forEach>
   </table>
 </body>
</html>