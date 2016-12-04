<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="demo.views.ListBooksPageServlet" %>
<%@ page import="demo.models.Book" %>
<%@ page import="demo.actions.CreateBookServlet" %>
<%@ page import="demo.views.LoginPageServlet" %>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>book</title>
</head>
<body>

<div>
    <span>Welcome,
        <span><%=session.getAttribute("userName")%></span>
    </span>
    <span><a href="#">logout</a></span>
</div>

<div>
    <h2>List All Books</h2>
    <table border="1">
        <thead>
        <tr>
            <td>Id</td>
            <td>Title</td>
            <td>Description</td>
        </tr>
        </thead>
        <tbody>
        <% for(Book item:new CreateBookServlet().getBooks() ){ %>
        <tr>
            <td><%= item.getId() %></td>
            <td><%= item.getTitle() %></td>
            <td><%= item.getDescription() %></td>
        </tr>
        <% } %>

        </tbody>
    </table>
</div>

<div>
    <h2>Create New Book</h2>
    <form action="/create-book" method="post">
        <div>
            <label>Title</label>
            <input type="text" name="title">
        </div>
        <div>
            <label>Description </label>
            <textarea name="description"></textarea>
        </div>
        <button>Create</button>
    </form>
</div>

</body>
</html>