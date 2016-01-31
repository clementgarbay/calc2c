#include <stdio.h> 
#include <stdbool.h> 

int test(x, y) {
    return x + 3;
}

int main() {
    return printf("%i\n", test(10, 0));
}