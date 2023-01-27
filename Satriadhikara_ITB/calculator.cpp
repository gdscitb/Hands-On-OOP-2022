#include <iostream>
using namespace std;

class Calculator
{
private:
    float Number1, Number2;
    char Operator;

public:
    void setNumber1(float number1)
    {
        Number1 = number1;
    }
    void setNumber2(float number2)
    {
        Number2 = number2;
    }
    void setOperator(char operatorChar)
    {
        Operator = operatorChar;
    }

    float plus()
    {
        return Number1 + Number2;
    }
    float mines()
    {
        return Number1 - Number2;
    }
    float times()
    {
        return Number1 * Number2;
    }
    float divide()
    {
        return Number1 / Number2;
    }

    void outResult()
    {
        if (Operator == '+')
        {
            cout << Number1 << " + " << Number2 << " = " << plus() << endl;
        }
        else if (Operator == '-')
        {
            cout << Number1 << " - " << Number2 << " = " << mines() << endl;
        }
        else if (Operator == '*')
        {
            cout << Number1 << " * " << Number2 << " = " << times() << endl;
        }
        else
        {
            cout << Number1 << " / " << Number2 << " = " << divide() << endl;
        }
    }

    Calculator(float number1, float number2, char operatorChar)
    {
        Number1 = number1;
        Number2 = number2;
        Operator = operatorChar;
    }
};

int main()
{
    float number1, number2;
    char operatorChar;
    cout << "Enter the first number: ";
    cin >> number1;
    cout << "Enter the second number: ";
    cin >> number2;
    cout << "Enter the operator (+, -, *, /): ";
    cin >> operatorChar;
    Calculator calculator = Calculator(number1, number2, operatorChar);
    calculator.outResult();
    return 0;
}