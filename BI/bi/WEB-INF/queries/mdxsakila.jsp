<%@ page session="true" contentType="text/html; charset=ISO-8859-1" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!--
// BIACTA 2009 - INTELIGENCIA DE NEGOCIOS CON SOFTWARE LIBRE
// This software is subject to the terms of the Common Public License
// Copyright (C) 2009 Angel R. Condori Coaquira, Inc.
// All Rights Reserved.
//
// Martes, 30 Junio, 2009
-->

<jp:mondrianQuery id="query01" jdbcDriver="com.mysql.jdbc.Driver" 
							   jdbcUrl="jdbc:mysql://localhost/cars_dwh?user=root&password=" 
							   catalogUri="/WEB-INF/queries/cubeventas.xml">
with member [Measures].[cantidad] as '([Measures].[cant_ventas])',format_string = IIf((((([Measures].[cant_ventas]))) > 0), "|#,##0.00|style='green'", IIf((((([Measures].[cant_ventas]))) < 0), "|#,##0.00|style='red'", "#,##0.00"))
				   
select {[Measures].[cantidad]} on columns, {([fechas].[todas_las_fechas],[carros].[todos_los_carros],[consesionarios].[todos_los_consesionarios],[clientes].[todos_los_clientes],[vendedores].[todos_los_vendedores])} on rows from ventas
		   
</jp:mondrianQuery>

<c:set var="title01" scope="session">Analisis de AutoMoviles</c:set>
