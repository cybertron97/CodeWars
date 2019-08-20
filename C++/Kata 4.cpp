/*
Convert number to reversed array of digits
Given a random number:

C#: long;
C++: unsigned long;
You have to return the digits of this number within an array in reverse order.
*/

#include <iostream> 
#include <vector> 

std::vector<int> digitize(unsigned long n) 
{          std::vector<int> digits;
  for(;n>0;digits.push_back(n%10),n/=10);
  return digits;

}
