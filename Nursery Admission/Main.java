#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[100];
  int i=0; int l=0;
  cin>>str;
  while(str[i]!='\0')
  {
    l++;
    i++;
  }
  cout<<"The number of letters in the name is "<<l;
}