package com.bilqees.calculator_app

sealed class CalculatorOperation (val symbol: String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("*")
    object Divide: CalculatorOperation("/")
}
