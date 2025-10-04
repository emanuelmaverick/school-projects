//PTASK3.cpp
#include <iostream>
using namespace std;
int main() 
{
    int addend1 =0;
    int addend2 =0;
    int sum =0;
    int difference =0;
    int minuend =0;
    int subtrahend =0;
    int multiplicand =0;
    int multiplier =0;
    int product =0;
    int quotient =0;
    int dividend =0;
    int divisor =0;

    cout<<"Input First Number:";
    cin>>addend1;
    cout<<"Input Second Number:";
    cin>>addend2;
    sum =addend1+addend2;
    cout<<"The sum is:";
	cout<<sum;
	cout<<"\n";
	
    cout<<"Input minuend:";
    cin>>minuend;
    cout<<"Input subtrahend:";
    cin>>subtrahend;
    difference =minuend-subtrahend;
    cout<<"The difference is: ";
	cout<<difference;
	cout<<"\n";

    cout<<"Input multiplicand:";
    cin>>multiplicand;
    cout<<"Input multiplier:";
    cin>>multiplier;
    product =multiplicand*multiplier;
    cout<<"The product is:";
	cout<<product;
	cout <<"\n";

    cout<<"Input dividend:";
    cin>>dividend;
    cout<<"Input divisor:";
    cin>>divisor;
	quotient =dividend/divisor;
    cout<<"The quotient is:"; 
	cout<<quotient;
	
    return 0;
}
