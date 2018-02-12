<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link href="glDatePicker.default.css" rel="stylesheet" type="text/css">
</head>
<body>

<f:view>
<center>
	<h:form>
		<h:panelGrid border="1" columns="2">
			<h:outputText value="Account number"></h:outputText>
			<h:inputText id="txtAccNumber" value="#{accountBean.accountNumer}"></h:inputText>
			<h:outputText value="Customer Name"></h:outputText>
			<h:inputText id="txtName" value="#{accountBean.customerName}"></h:inputText>
			<h:outputText value="Date fo Birth"></h:outputText>
			<h:inputText id="txtDate" value="#{accountBean.dateOfBirth}">
				<f:convertDateTime pattern="dd-MMM-yyyy"/>
			</h:inputText>
			<h:outputText value="Gender"></h:outputText>
			<h:selectOneRadio id="rbGender" value="#{accountBean.gnder}">
			<f:selectItem itemLabel="Male" itemValue="Male"/><f:selectItem itemLabel="Female" itemValue="Female"/></h:selectOneRadio>
			<h:outputText value="Account Type"></h:outputText>
			<h:selectOneMenu id="ddlAccnttype" value="#{accountBean.accountType}">
				<f:selectItems value="#{accountBean.listAccountType}"/>
			</h:selectOneMenu>
			<h:outputText value="Address"></h:outputText>
			<h:inputTextarea id="taAddress" value="#{accountBean.address}"></h:inputTextarea>
			<h:outputText value="Email"></h:outputText>
			<h:inputText id="txtEmail" value="#{accountBean.email}"></h:inputText>
		</h:panelGrid><br>
		All fields are Mandatory<h:commandButton type="submit" id="btnSubmit" action="#{accountBean.saveData}" value="Submit"></h:commandButton>
		<h:commandButton type="reset" id="btnReset" value="Reset"></h:commandButton>
	</h:form>
	
	
		
	<div class="Wrapper">
  <h1 class="Title">CSS Only Floated Labels!</h1>
  <div class="Input">
    <h:inputText id="input" styleClass="Input-text"/>
    <label for="input" class="Input-label">Name</label>
  </div>
</div>

	</center>
</f:view>
</body>
</html>