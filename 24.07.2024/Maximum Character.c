#include <stdio.h>
#include <string.h>

int main() {
    char str[100], max_char;
    int i;
    printf("Enter a string: ");
    scanf("%s", str);
    max_char = str[0];
    for (i = 1; i < strlen(str); i++) {
        if (str[i] > max_char) {
            max_char = str[i];
        }
    }
    printf("Maximum character in the string: %c\n", max_char);
    return 0;
}
