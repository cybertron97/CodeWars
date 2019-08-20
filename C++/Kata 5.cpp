/*Remove the first and last character from the string*/

#include <string>

using namespace std; 

string sliceString (string str )
{
 
          return str.substr(1,str.length()-2);
}
