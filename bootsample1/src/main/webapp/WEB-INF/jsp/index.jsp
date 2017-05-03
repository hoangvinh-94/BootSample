<!DOCTYPE HTML>
<html>
<body>
	<h2>Hello World from JSP Page</h2>
	<form action="getTinTuc" method="get" name="fromTinTuc">
		<table border="1" >
			<tr>
				<td>Title: </td>
				<td style="width: 500px;"><input style="width: 500px;" type="text" name="txtTitle"></td>
			</tr>
			<tr>
				<td>Content: </td>
				<td><textarea rows="10" style="width: 500px;" name="txtContent"></textarea></td>
			</tr>
			<tr>
				<td>Title: </td>
				<td><input type="file" name="fileUpload"></td>
			</tr>
			<tr>
				<td><input type="submit"  value="Add"></td>
				<td><input type="reset"  value="Cancel"></td>
			</tr>
		</table>
		
	</form>


</body>
</html>
