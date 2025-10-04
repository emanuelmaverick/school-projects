//PTASK5.cpp
#include <iostream>
using namespace std;
int main ()
{
	string itemCode;
	int numberOfItems = 0;
	double itemPrice = 0;
	double total;
	double totalcost;
	double VAT;
	double totalWithVAT;
	double amountTendered;
	double change;
	
	cout<<"\n\tEnter Item Code\t\t: ";
	cin>>itemCode;
	cout<<"\tEnter No. of Items\t: ";
	cin>>numberOfItems;
	cout<<"\tEnter Item Price\t: ";
	cin>>itemPrice;
	cout<<"\tEnter Amount Tendered\t: ";
	cin>>amountTendered;
	
	VAT = itemPrice*0.10;
	totalcost = numberOfItems*itemPrice + VAT;
	total = totalcost;
	
	cout<<"\n";
	cout<<"\tSummary: ""\n\n";
	cout<<"\t\tItem Code\tNo. of Item\tItem Price\tTotal\n";
	cout<<"\t====================================================================\n";
	cout<<"\t\t"<<itemCode<<"\t\t"<<numberOfItems<<"\t\t"<<itemPrice<<"\t\t"<<total<<endl;
	
	cout<<"\n\n";
	    cout<<"\tVAT 10%: " <<VAT<< "\n";
	    cout<<"\tTotal Cost: ";
	    cout<<total;
	    cout<<"\n";
	    cout<<"\tAmount Tendered: " <<amountTendered<< "\n";
	    change = amountTendered - totalcost;
	    cout<<"\tAmount Change: " <<change<<endl;
	
	return 0;
}
