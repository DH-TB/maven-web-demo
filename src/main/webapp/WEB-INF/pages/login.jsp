<%@ page import="demo.views.LoginPageServlet" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>


<div>
 <span>
     <%if(session.getAttribute("message")!=null){%>
        <%=session.getAttribute("message")%>
     <%}else{%>
         <%="please login"%>
     <%}%>
 </span>

</div>
<div>
    <h2>My Book System</h2>
    <form action="/logining" method="post">
        <div><label>userName:<input type="text" name="userName"></label></div>
        <div><label>password:<input type="password" name="password"></label></div>
        <button>login</button>
    </form>
</div>

</body>
</html>