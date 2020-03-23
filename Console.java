/*****************************
Обработка ввода/вывода данных
*****************************/

import java.util.Scanner;

public class Console
{
    public static Boolean numbersIsInt = false; //маркер арабских цифр
    
    public static void read() //метод считывания данных с консоли
    {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim(); 
        String[] inputElements = input.split(" "); //создаем массив строк с операндами и оператором
        
        
        try 
        {
            String strA = inputElements[0];
            String strB = inputElements[2]; 
            String strOp = inputElements[1]; 
            
            Main.operator = strOp.charAt(0); //присваиваем оператору символ
            
            Main.a = Converter.convToInt(strA); //присваем числа а и б
            Main.b = Converter.convToInt(strB);
            
            
            if (numbersIsInt == true) // если числа арабские, проверяем условие
            {
                int a = Integer.parseInt(strA);
                if (a > 0 && a <= 10) Main.a = a;
                else a = a / 0;
                
                int b = Integer.parseInt(strB);
                if (b > 0 && b <= 10) Main.b = b;
                else b = b/ 0;
            }
            
            
        } 
        catch(Exception e) //в случае ошибки ввода выбрасываем исключение
        {
            System.out.println("Ошибка ввода: выражение должно быть в формате a + b");
            System.out.println("0 < (a, b) < 10; a, b - integer");
            System.out.println("Числа должны быть либо римскими, либо арабскими");
        } 
        
    }
    
    public static void output() //метод вывода данных
    {
        if (numbersIsInt == false) // если на вводе были римские цифры, результат тоже преобразуем в римские цифры
        
        {   
            int resultInt = (int)Calculator.result;
            String resultStr = Converter.convToRomanNumerals(resultInt);
            System.out.println(resultStr);
        }
        else System.out.println(Calculator.result);
    }
}
    
