<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<script type="text/javascript">
	function showName() {
		document.getElementById("germmyApplet").showName();
	}
</script>
</head>
<body>
	<input type="button" value="showName" onclick="showName()" />
	<applet alt="" code="com.baoshan.applet.WaitingPicApplet" height="100"
		width="200" codebase="pluign"
		archive="test_applet.jar,log4j-1.2.14.jar,commons-logging.jar,printName.jar"
		name="germmyApplet" id="germmyApplet">
</body>
</html>