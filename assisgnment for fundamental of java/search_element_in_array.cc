#include<bits/stdc++.h>
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int helper() {
    int n = 0;
    cin>>n;
    vector<int> v(n);
    for(int i = 0; i < n; i++)
        cin>>v[i];
    int target = 0;
    cin >> target;
    auto it = find(v.begin(),v.end(),target);
    if(it != v.end())
        return 1;
    else
        return 0;
}

int main(){
    // YOUR CODE GOES HERE
    // Please take input and print output to standard input/output (stdin/stdout)
    // E.g. 'cin' for input & 'cout' for output
    int t = 0;
    cin>>t;
    while(t--) {
        int i = helper();
        cout<<i<<endl;
    }
    return 0;
}