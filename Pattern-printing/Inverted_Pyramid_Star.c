#include <stdio.h>

int main() {
    int x;
    scanf("%d",&x);
    for(int i=x-1;i>=0;i--){
            for(int k=i;k<x;k++){
            printf(" ");
        }
        for(int j=0;j<(2*i)+1;j++){
            printf("*");
        }

        printf("\n");
    }

    return 0;
}
