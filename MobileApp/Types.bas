﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'Program  custom types
	Type Order(ID As Int,OrderCode As String,OrderTotalPrice As Double,Goods As List)
	Type Customer (ID As Int,username As String,password As String,email As String,FirstName As String, _
	LastName As String,Phone As String,City As String,Country As String,Address As String,Orders As List)
	
	Type GoodDetail(ID As Int,PLU As Int,Name As String,Price As Double,Description As String,Is_Discontinued As Int)
	Type Supplier (ID As Int,SupplierName as String,SupploerPhone as String)
	Type Good (ID As Int , Qtty As Int , Detail As GoodDetail, Supplier As Supplier) 
	
End Sub