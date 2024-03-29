/**************************************************************************************************************************
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. 
Данные передаются в одну строку 
Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числа.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. 
На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.
**************************************************************************************************************************/

public class Main
{
	public static float a; //число a, которое передадим калькулятору
	public static float b; //число b, которое передадим калькулятору
	public static char operator = '0'; //оператор математического выражения
	
	public static void main(String[] args) {
	    Console.read(); //запуск метода распознования строки с выражением в консоли, проверкой заданным условиям и преобразованием входных данных
	    Calculator.calculate(); //запуск метода расчета математического выражения
	    Console.output(); //метод преобразования и вывода результата
	}
}