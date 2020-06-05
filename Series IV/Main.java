#include<iostream>

using namespace std;

int main()

{
int n,x;
std::cin>>n;
for (int i = 1; i <= n; i++)
{
x=i*i;
if (x%2 == 0)
std::cout<< x - 2<<" ";
else
cout<< x - 1<<" ";
}
}

//Read more on Brainly.in - https://brainly.in/question/16964167#readmore