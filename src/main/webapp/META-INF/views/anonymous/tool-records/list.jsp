 
<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="anonymous.tool-records.list.label.title" path="title" width="25%"/>
	<acme:list-column code="anonymous.tool-records.list.label.activitySector" path="activitySector" width="15%"/>
	<acme:list-column code="anonymous.tool-records.list.label.stars" path="stars" width="15%"/>	
</acme:list>