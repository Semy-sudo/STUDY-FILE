#include<stdlib.h>
#include<stdio.h>
#define STACK_SIZE 100

//스택의 element 를 int 로 선언
typedef int element;

//스택 배열 선언, 초기화
element stack[STACK_SIZE];
int top = -1;
//스택이 공백인지
int isEmpty() {
	if (top == -1)return 1;
	else return 0;
}
//스택이 포화인지
int isFull() {
	if (top == STACK_SIZE - 1) return 1;
	else return 0;
}
//스택의 top에 원소를 삽입하는 과정
void push(element item) {
	if (isFull()) {
		printf("stack is Full");
		return;
	}
	else stack[++top] = item;
}
//스택의 top 에서 원소를 삭제하는 과정
element pop() {
	if (isEmpty()) {
		printf("Stack is Empty");
		exit(1);
	}
	else return stack[top--];
}
//스택의
void printStack() {
	int i;
	for (i = 0; i <= top; i++) printf("%d : %d \n", i, stack[i]);
}

void main(void) {
	element item;

	push(1);
	push(2);
	pop();
	push(5);
	push(4);

	printStack();


}