#include <stdio.h>
#include <string.h>

int main() {
    char str[100], min_char;
    int i;
    printf("Enter a string: ");
    scanf("%s", str);
    min_char = str[0];
    for (i = 1; i < strlen(str); i++) {
        if (str[i] < min_char) {
            min_char = str[i];
        }
    }
    printf("Minimum character in the string: %c\n", min_char);
    return 0;
}
