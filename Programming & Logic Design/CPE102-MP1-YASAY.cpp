//MP1.cpp
#include <iostream>
using namespace std;
int main ()
{
	cout<<"This program computes for the circumference and diameter of a circle"<<endl;
	
	const float PI = 3.1416;

	float radius;
	cout<<endl;
	
	cout<<"Input radius: ";
	cin>>radius;

	float circumference = 2 * PI * radius;
	float diameter = 2 * radius;
	cout.setf(ios::fixed);
	cout.precision(2);

	cout<<"The circumference of the circle is: "<<circumference<<endl;
	cout<<"The diameter of the circle is: "<<diameter<<endl;	
	
	cout<<endl;
	cout<<"This code is created by: Emanuel Maverick G. Yasay";
	
	return 0;
}
