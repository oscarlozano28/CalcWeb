<%-- 
    Document   : calcjsp
    Created on : 23/03/2021, 08:13:02 AM
    Author     : osmal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form action="CalcServlet" method="POST">
            Ingrese número:
            <input type="text" name="t1">
            <br>
            Ingrese número:
            <input type="text" name="t2">
            <br>
            <br>
            <input type="button" value="1" name="number1" disabled="disabled" />
            <input type="button" value="2" name="number2" disabled="disabled" />
            <input type="button" value="3" name="number3" disabled="disabled" />
            <input type="button" value="+" name="suma" disabled="disabled" />
            <input type="button" value="-" name="resta" disabled="disabled" />
            <br>
            <input type="button" value="4" name="number4" disabled="disabled" />
            <input type="button" value="5" name="number5" disabled="disabled" />
            <input type="button" value="6" name="number6" disabled="disabled" />
            <input type="button" value="*" name="multiplicar" disabled="disabled" />
            <input type="button" value="/" name="dividir" disabled="disabled" />
            <br>
            <input type="button" value="7" name="number7" disabled="disabled" />
            <input type="button" value="8" name="number8" disabled="disabled"/>
            <input type="button" value="9" name="number9" disabled="disabled" />
            <input type="button" value="%" name="modulo" disabled="disabled" />
            <input type="button" value="^2" name="potencia" disabled="disabled" />
            <br>
            <input type="button" value="0" name="number0" disabled="disabled"/>
            <br>
            <input type="submit" name="btnSuma" value="Sumar">
            <input type="submit" name="btnResta" value="Restar">
            <input type="submit" name="btnMultiplicacion" value="Multiplicar">
            <input type="submit" name="btnDividir" value="Dividir">
            <input type="submit" name="btnModulo" value="Módulo">
            <input type="submit" name="btnPotencia" value="Cuadrado">
        </form>
    </body>
</html>
