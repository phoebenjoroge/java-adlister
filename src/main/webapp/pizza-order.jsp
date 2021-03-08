<%--
  Created by IntelliJ IDEA.
  User: artemis
  Date: 3/8/21
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza-Order</title>
</head>
<body>
<h1>Order your Pizza here</h1>
<h3>Please Select Crust Type</h3>
<form>
    <input type="radio" id="thin" name="crust" value="thin">
    <label for="thin">Thin</label><br>
    <input type="radio" id="pan" name="crust" value="pan">
    <label for="pan">Pan</label><br>
    <input type="radio" id="traditional" name="crust" value="traditional">
    <label for="traditional">Traditional</label>
</form>
<h3>Please Select Sauce </h3>
<form>
    <input type="radio" id="regular" name="sauce" value="regular">
    <label for="regular">Regular</label><br>
    <input type="radio" id="light" name="sauce" value="light">
    <label for="light">Light</label><br>
    <input type="radio" id="extra" name="sauce" value="extra">
    <label for="extra">Extra</label>
</form>
<h3>Please Select Size </h3>
<form>
    <input type="radio" id="small" name="size" value="small">
    <label for="small">Small</label><br>
    <input type="radio" id="medium" name="size" value="medium">
    <label for="medium">Medium</label><br>
    <input type="radio" id="large" name="size" value="large">
    <label for="large">Large</label>
</form>
<h3>Toppings</h3>
<form>

    <input name="topping" type="checkbox" value="Sausage">
<label>Sausage </label>
    <input name="topping"
           type="checkbox"
           value="Pepperoni">

    Pepperoni

</label>
<label>
    <input name="topping"
           type="checkbox"
           value="Mushrooms">

    Mushrooms

</label>
<label>
    <input name="topping"
           type="checkbox"
           value="Onions">

    Onions

</label>
<label>
    <input name="topping"
           type="checkbox"
           value="Green Peppers">

    Green Peppers

</label>
<label>
    <input name="topping"
           type="checkbox"
           value="Black Olives">

    Back Olives

</label>
<label>
    <input name="topping"
           type="checkbox"
           value="Extra Cheese">

    Extra cheese</label>
</form>
<form>

    <label for="id-name">Name</label>
<input id="id-name" type="text" size="30">
<label for="id-address"> Address </label>
<input id="id-address" type="text" size="40">
<label for="id-phone"> Phone </label>
<input id="id-phone" type="text" size="14">
    <br>
    <button>Submit</button>
</form>
</body>
</html>
