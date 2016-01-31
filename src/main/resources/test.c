#include <stdio.h> 
#include <stdbool.h> 

int test() {
    return 3;
}

int main() {
    int a = test();
    return printf("%i\n", a);
}