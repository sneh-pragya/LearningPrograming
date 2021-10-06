#include<iostream>

using namespace std;

int main()  {
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    int n;
    cin>>n;
    for(int i = 1; i <=n; i++){
        for(int j = 0; j <i; j++)
            cout<<i;
        cout<<endl;
    }
    
    return 0;
}