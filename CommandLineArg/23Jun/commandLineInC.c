#include <stdio.h>

void main(int argc, char** argv) {
      printf("Argument count = %d\n",argc);
      printf("argv[0] = %s\n", *(argv+0));
      printf("argv[1] = %s\n",*(argv+1));
      printf("argv[2] = %s\n",*(argv+2));
      printf("argv[3] = %s\n",*(argv+3));
      printf("argv[4] = %s\n",*(argv+4));
}
