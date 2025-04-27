#include <iostream>
using namespace std;

namespace myspace{
    int num  = 21;
    
    void greet(){
        cout<<"moshi mosh , orewa monkey.d.luffy, kaizoku ne orewa naru";
    }
}


using namespace myspace;

int main(){
    cout<<num<<endl;
    greet();
}