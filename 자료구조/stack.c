#include<stdlib.h>
#include<stdio.h>
#define STACK_SIZE 100

//������ element �� int �� ����
typedef int element;

//���� �迭 ����, �ʱ�ȭ
element stack[STACK_SIZE];
int top = -1;
//������ ��������
int isEmpty() {
	if (top == -1)return 1;
	else return 0;
}
//������ ��ȭ����
int isFull() {
	if (top == STACK_SIZE - 1) return 1;
	else return 0;
}
//������ top�� ���Ҹ� �����ϴ� ����
void push(element item) {
	if (isFull()) {
		printf("stack is Full");
		return;
	}
	else stack[++top] = item;
}
//������ top ���� ���Ҹ� �����ϴ� ����
element pop() {
	if (isEmpty()) {
		printf("Stack is Empty");
		exit(1);
	}
	else return stack[top--];
}
//������
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