
<%@page import="java.text.DecimalFormat"%>
<%@page import="entities.Item"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entities.Category"%>
<%@page import="entities.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="util.Const"%>
<%
@SuppressWarnings("unchecked")
ArrayList<Category> categories = (ArrayList<Category>) request.getAttribute("categories");
%>

<jsp:include page="<%=Const.PATH_HEAD_JSP%>"/>
<jsp:include page="<%=Const.PATH_MENU_JSP%>"/>
   <div class="container">
	 <div class="row">
         <div class="col-md-12">
         <a type="button" class="btn btn-primary" href="add-category">Add Category</a>
         </div>
         </div>
        <div class="row">
         <div class="col-md-12">
         <div class="table-responsive">
  <table class="table">
  	<thead class="thead-dark">
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Order Of Appearance</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
<%
DecimalFormat df = new DecimalFormat("####0.00");
	
if(categories.size() > 0) {
	for(Category category : categories) {
%>
		 <tr>
		<td><%=category.getName()%></td>
		<td><%=category.getOrderOfAppearance()%></td>
		<td>
		<a type="button"  href="delete?id=<%= category.getId() %>" class="btn btn-primary" onclick="return confirm('Are you sure you want to delete this item?');"  >Modify</a>
		<button type="button" class="btn btn-outline-danger">Remove</button>
		</td>
		</tr>
<%
		}
	}
	else {
%>
		<tr>
		<td colspan="3">No Products Found</td>
		</tr>
<%
	}
%>
            </table>
            </div>
		</div>
    </div>
    </div>
<jsp:include page="<%=Const.PATH_FOOTER_JSP%>"/>