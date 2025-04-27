#include <iostream>
using namespace std;

int main(){
    string fullname;
    cout<<"enter your full name :";
    getline(cin,fullname);
    cout<<"the entered full name is :"<<fullname<<endl;
    string fullname2;
    cout<<"thirumbavum un full perah sollu bro:";
    cin>>fullname2;
    cout<<"ippo full name vanthu :"<<fullname2<<endl;

    cout<<"ippo kata ennena ,\ncin vachu input vangunal : whitespace will be considered as termination ,\n so unnaku pathi per tan print agum ,\n athuve getline(cin, fullname )apdinu input vanguna :\nantha half per vara panchayathu illa,\n because It takes cin as the first parameter, and the string variable as second";

}