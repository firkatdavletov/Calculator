/*****************************
���������� �����/������ ������
*****************************/

import java.util.Scanner;

public class Console
{
    public static Boolean numbersIsInt = false; //���������� ������� ���� ������: �������� �����, ���� �������
    
    public static void read() //����� ��������� ������� ������
    {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().trim(); //������������� ������, ��������� � �������
        String[] inputElements = input.split(" "); //�������� ������� ����� ������
        
        
        try 
        {
            String strA = inputElements[0]; //������ ������� ������� ����� - ������ �������
            String strB = inputElements[2]; //������ ������� ������� ����� - ������ �������
            String strOp = inputElements[1]; //������ ������� ������� ����� - �������� ���.���������
            
            Main.operator = strOp.charAt(0); //���������� ���������
            
            Main.a = Converter.convToInt(strA); //�������������� ��������� � ����� �����
            Main.b = Converter.convToInt(strB);
            
            
            if (numbersIsInt == true) // ���� ����� �������� ��������� �������: ������� ����� ������ ���� ������ 0, ������ 10 
            {
                int a = Integer.parseInt(strA);
                if (a > 0 && a <= 10) Main.a = a;
                else a = a / 0;
                
                int b = Integer.parseInt(strB);
                if (b > 0 && b <= 10) Main.b = b;
                else b = b/ 0;
            }
            
            
        } 
        catch(Exception e) //����������� ���������� � ������ ��������� �����
        {
            System.out.println("������ �����: ������� ������� � ���� a + b");
            System.out.println("0 < (a, b) < 10; a, b - integer");
            System.out.println("����������� ����� �������� ������ � ��������� ��� �������� ������� ������������");
        } 
        
    }
    
    public static void output() //����� ������ ����������
    {
        if (numbersIsInt == false) // ���� ����� �������, ������� ����������� ��������� � ������� �����
        
        {   
            int resultInt = (int)Calculator.result;
            String resultStr = Converter.convToRomanNumerals(resultInt);
            System.out.println(resultStr);
        }
        else System.out.println(Calculator.result);
    }
}
    