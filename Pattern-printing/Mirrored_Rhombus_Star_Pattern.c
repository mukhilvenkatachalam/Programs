#include <stdio.h>

int main() {
    int x;
    scanf("%d",&x);
    for(int i=0;i<x;i++){
        for(int k=x-1;k>i;k--){
            printf(" ");
        }
        for(int j=0;j<x;j++){
                printf("*");
        }
        printf("\n");
    }

    return 0;
}
