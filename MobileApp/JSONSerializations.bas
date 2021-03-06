﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub


Public Sub SerializeGood(jstring As String) As Good
	Dim JSON As JSONParser
	Dim Map1 As Map
	Dim good As Good
	Map1.Initialize
	good.Initialize
	
	JSON.Initialize(jstring)
	Map1 = JSON.NextObject
	
	good.ID = Map1.Get("id")
	good.PLU = Map1.Get("plu")
	good.Name = Map1.Get("name")
	good.Price = Map1.Get("price")
	good.Description = Map1.Get("description")
	good.Is_Discontinued = Map1.Get("is_Discontinued")
	good.SupplierID = Map1.Get("supplierID")

	Return good	
End Sub

Public Sub SerializeSupplier(jstring As String) As Supplier
	Dim JSON As JSONParser
	Dim Map1 As Map
	Dim supplier As Supplier
	Map1.Initialize
	supplier.Initialize
	
	JSON.Initialize(jstring)
	Map1 = JSON.NextObject
	
	supplier.ID =  Map1.Get("id")
	supplier.SupplierName =  Map1.Get("supplierName")
	supplier.SupploerPhone =  Map1.Get("supplierPhone")
	
	Return supplier
End Sub

Public Sub SerializeLoginCustomer(jstring As String) As Customer
	Dim JSON As JSONParser
	Dim Map1 As Map
	Dim customer As Customer
	Map1.Initialize
	customer.Initialize
	
	JSON.Initialize(jstring)
	Map1 = JSON.NextObject
	
	customer.ID =  Map1.Get("id")
	customer.username =  Map1.Get("username")
	customer.password =  Map1.Get("password")
	customer.FirstName =  Map1.Get("firstName")
	customer.LastName =  Map1.Get("lastName")
	customer.email =  Map1.Get("email")
	customer.City =  Map1.Get("city")
	customer.Phone =  Map1.Get("phone")
	
	Return customer
End Sub

Public Sub LoginJson(username As String , password As String)As JSONGenerator 
	Dim JsonData As Map
	JsonData.Initialize
	JsonData.Put("username", username)
	JsonData.Put("password", password)
	
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(JsonData)
	Log(JSONGenerator.ToPrettyString(0))
	Return JSONGenerator
End Sub

Public Sub CustomerID(ID As Int) As JSONGenerator 
	Dim JsonData As Map
	JsonData.Initialize
	JsonData.Put("id", ID)
	
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(JsonData)
	Log(JSONGenerator.ToPrettyString(0))
	Return JSONGenerator
End Sub

Public Sub OrderToJSON(o As Order) As JSONGenerator
	Dim JsonData As Map
	Dim JsonArray As List
	JsonData.Initialize
	JsonArray.Initialize
		
	JsonData.Put("id",o.ID)
	JsonData.Put("orderCode",o.OrderCode)
	JsonData.Put("customerID",o.CutomerID)
	JsonData.Put("orderTotalPrice",o.OrderTotalPrice)
	JsonData.Put("orderStatus",o.OrderStatus)
	For Each og As OrderedGood In o.OrderedGoods
		Dim JsonData2 As Map
		JsonData2.Initialize
		JsonData2.Put("order",Null)
		JsonData2.Put("orderID",og.OrderID)
		JsonData2.Put("goodID",og.GoodID)
		JsonData2.Put("qtty",og.Qtty)
		JsonArray.Add(JsonData2)
	Next
	JsonData.Put("orderedGoods",JsonArray)
		
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(JsonData)
	Log(JSONGenerator.ToPrettyString(0))
	Return JSONGenerator
End Sub

Public Sub CustomerToJSON(c As Customer)As JSONGenerator
	Dim JsonData As Map
	JsonData.Initialize
	JsonData.Put("id",c.ID)
	JsonData.Put("username", c.username)
	JsonData.Put("password",c.password )	
	JsonData.Put("email",c.email )
	JsonData.Put("firstName",c.FirstName )
	JsonData.Put("lastName",c.LastName )
	JsonData.Put("phone",c.Phone )
	JsonData.Put("city",c.City )
	JsonData.Put("country",c.Country )
	JsonData.Put("address",c.Address )
	
	Dim JSONGenerator As JSONGenerator
	JSONGenerator.Initialize(JsonData)
	Log(JSONGenerator.ToPrettyString(0))
	Return JSONGenerator
	
End Sub

Public Sub SerializeCustomerOrders(jstring As String) As List
	Dim JSON As JSONParser	
	Dim list1 As List
	Dim result As List
	
	result.Initialize
	JSON.Initialize(jstring)
	list1 = JSON.NextArray
	
	For i = 0 To list1.Size - 1
		Dim Ordertmp As Order
		Dim Map1 As Map
		Dim OrderedGoods As List

		Map1 = list1.Get(i)
		Ordertmp.Initialize
		Ordertmp.ID = Map1.Get("id")
		Ordertmp.OrderCode = Map1.Get("orderCode")
		Ordertmp.CutomerID = Map1.Get("customerID")
		Ordertmp.OrderTotalPrice = Map1.Get("orderTotalPrice")
		Ordertmp.OrderStatus = Map1.Get("orderStatus")
		OrderedGoods = Map1.Get("orderedGoods")
		Ordertmp.OrderedGoods = OrderedGoods
		result.Add(Ordertmp)
	Next
	
	Return result
		
End Sub

Public Sub SerializeOrderedGoods(jstring As String) As List
	Dim JSON As JSONParser
	Dim list1 As List
	Dim result As List
	
	result.Initialize
	JSON.Initialize(jstring)
	list1 = JSON.NextArray
	
	For i = 0 To list1.Size - 1
		Dim OrderedGood As OrderedGood
		Dim Map1 As Map
		OrderedGood.Initialize

		Map1 = list1.Get(i)
		
		OrderedGood.OrderID = Map1.Get("orderID")
		OrderedGood.GoodID = Map1.Get("goodID")
		OrderedGood.Order = Null
		OrderedGood.Qtty = Map1.Get("qtty")
		
		result.Add(OrderedGood)
	Next
	
	Return result
End Sub