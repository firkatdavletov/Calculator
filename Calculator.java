/***********************************
Вычислитель
***********************************/

public class Calculator
{
    public static float result;
    public static void sum() //метод суммирования чисел
    {
        Calculator.result = Main.a + Main.b; 
    }
    
    public static void diff() //метод нахождения разницы
    {
        Calculator.result = Main.a - Main.b;
    }
    
    public static void mult() //метод произведения
    {
        Calculator.result = Main.a * Main.b;
    }
    
    public static void div() //метод деления
    {
        Calculator.result = Main.a / Main.b;
    }
    
    public static void calculate() //метод вычисления
    {   int d = 0;
        try 
        {
            if (Main.operator == '+')
                Calculator.sum();
            else if (Main.operator == '-')
                Calculator.diff();
            else if (Main.operator == '*')
                Calculator.mult();
            else if (Main.operator == '/')
                Calculator.div();
            else d = 2/0;    
        } 
        catch(Exception e) //выбрасываем исключение в случае неверного ввода
        {
            System.out.println("Ошибка ввод оператора: введите математический оператор +, -, * или / ");
        } 
        
    }
}