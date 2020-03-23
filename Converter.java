/*********************************************
Конвертер цифр из Арабских в Римские и обратно
*********************************************/

public class Converter
{
    public static int convToInt(String str) //метод преобразования Римских в Арабские
    {
        if (str.equals("I")) return 1;
        else if (str.equals("II")) return 2;
        else if (str.equals("III")) return 3;
        else if (str.equals("IV")) return 4;
        else if (str.equals("V")) return 5;
        else if (str.equals("VI")) return 6;
        else if (str.equals("VII")) return 7;
        else if (str.equals("VIII")) return 8;
        else if (str.equals("IX")) return 9;
        else if (str.equals("X")) return 10;
        else 
        {
            Console.numbersIsInt = true;
            return 0;
        }
    }
    
    public static String convToRomanNumerals(int input) //метод преобразования Арабских цифр в Римские
    {
        if (input < 1)
        return " Неверный формат римских цифр";
        
        String s = "";
        
        while (input == 100) 
        {
            s += "C";
            input -= 100;
        }
        while (input >= 90) 
        {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) 
        {
            s += "L";
            input -= 50;
        }
        while (input >= 40) 
        {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) 
        {
            s += "X";
            input -= 10;
        }
        while (input >= 9) 
        {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) 
        {
            s += "V";
            input -= 5;
        }
        while (input >= 4) 
        {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) 
        {
            s += "I";
            input -= 1;
        }    
        return s;
    }
}