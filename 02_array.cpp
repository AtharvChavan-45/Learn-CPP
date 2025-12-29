#include <iostream>
using namespace std;

int main() 
{
    int n; // take how much numeber contain in array ex = 5
    cin>>n;
    
    int a[n];// take input ex= 10 20 30 40 50
    for(int i=0;i<n;i++){
      cin>>a[i];
    }
     for(int i=0;i<n;i++){
       cout << i<<"-"<<a[i]<<endl;
     }
    
    return 0;
}