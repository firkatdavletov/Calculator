/*****************************
Обработчик ввода/вывода данных
*****************************/

import java.util.Scanner;

public class Console
{
    public static Boolean numbersIsInt = false; //объявление маркера типа данных: Арабские числа, либо Римские
    
    public static void read() //метод обработки вводных данных
    {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim(); //распознование строки, введенной в консоли
        String[] inputElements = input.split(" "); //создание массива строк данных
        
        
        try 
        {
            String strA = inputElements[0]; //первый элемент массива строк - первый операнд
            String strB = inputElements[2]; //третий элемент массива строк - второй операнд
            String strOp = inputElements[1]; //второй элемент массива строк - оператор мат.выражения
            
            Main.operator = strOp.charAt(0); //сохранение оператора
            
            Main.a = Converter.convToInt(strA); //преобразование операндов в целые числа
            Main.b = Converter.convToInt(strB);
            
            
            if (numbersIsInt == true) // если числа арабские проверяем условие: входные числа должны быть больше 0, меньше 10 
            {
                int a = Integer.parseInt(strA);
                if (a > 0 && a <= 10) Main.a = a;
                else a = a / 0;
                
                int b = Integer.parseInt(strB);
                if (b > 0 && b <= 10) Main.b = b;
                else b = b/ 0;
            }
            
            
        } 
        catch(Exception e) //выбрасываем исключение в случае неверного ввода
        {
            System.out.println("Ошибка ввода: введите формулу в виде a + b");
            System.out.println("0 < (a, b) < 10; a, b - integer");
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно");
        } 
        
    }
    
    public static void output() //метод вывода результата
    {
        if (numbersIsInt == false) // если цифры Римские, сначала преобразуем результат в Римские цифры
        
        {   
            int resultInt = (int)Calculator.result;
            String resultStr = Converter.convToRomanNumerals(resultInt);
            System.out.println(resultStr);
        }
        else System.out.println(Calculator.result);
    }
}
    