<%@ include file="common/header.jspf" %>
<%@ include file="common/navigationBar.jspf" %>
   <div class="container">
   <h1>Enter the todo</h1>
   <form:form method="post"  modelAttribute="todo">
   <fieldset class="mb-3">
   <form:label path="Description"> Description :</form:label>
   <form:input type="text" path="description" required="required"/>
   <form:errors path="Description" cssclass="btn btn-waring"/>
   </fieldset>
    <form:input type="hidden" path="id" />
    <fieldset class="mb-3">
        <form:label path="targetdate">Target Date</form:label>
         <form:input type="calendar" path="targetdate"  />
          
    </fieldset>
     
    <form:input type="hidden" path="done" /> <input class="btn btn-success" type="submit"/>
   </form:form>
   </div>
   
<%@ include file="common/footer.jspf" %>