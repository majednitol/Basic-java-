#include <bits/stdc++.h>
using namespace std;
class Person {
    public:
        int age;
        Person() {
            cout<< "constructor called"<<endl;
        }
};


int main()
{
    Person *p1 = new Person();
    Person p2;
    Person p3;
    return 0;
}
