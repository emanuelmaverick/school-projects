//PTASK8.cpp
#include <iostream>
using namespace std;
int main ()
{
  int number;

    cout.setf(ios::fixed);
    cout.precision(2);
    
    cout<<"Input integer: ";
    cin>>number;

    if (number % 2 == 0) {
        cout <<"EVEN number: " << number << endl;
    } else {
        cout <<"ODD number: " << number << endl;
    }
    
    cout<<endl;
    
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
	
    
    return 0;
}

