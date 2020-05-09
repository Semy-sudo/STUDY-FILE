#include <stdio.h>
#include <stdlib.h> //동적 메모리 관리함수 
#define cQ_SIZE 4

//순차 자료구조 이용해 원형 큐 구현

typedef char element;//char를 대신할 element
typedef struct {
	element queue[cQ_SIZE]; //1차원 배열 큐 선언
	int front, rear;
}QueueType;

//원형 큐 만들기
QueueType* createQueue() {
	QueueType* Q;
	Q = (QueueType*)malloc(sizeof(QueueType));
	//0으로 초기화하는 이유: 큐가 다 찻을때 배열의 크기로 나머지 연산을 하기 위해서
	Q->front = 0;
	Q->rear = 0;
	return Q;
}

//원형 큐가 공백 상태인지 검사하는 연산
int isEmpty(QueueType* Q) {
	if (Q->front == Q->rear) {
		printf("Circle Q is empty!");
		return 1;
	}
	else return 0;
}

//원형 큐가 포화 상태인지 확인하는 연산
int isFull(QueueType* Q) {
	if ((Q->rear + 1) % cQ_SIZE == Q->front) {
		printf("Circle Q is full!");
		return 1;
	}
	else return 0;
}

//원형 큐의 rear에 원소를 삽입하는 연산
void enQueue(QueueType* Q, element item) {
	if (isFull(Q)) return;
	else {
		Q->rear = (Q ->rear + 1)% cQ_SIZE;
		Q->queue[Q->rear] = item;
	}
}

//원형 큐의 front에 원소를 삭제하는 연산
element deQueue(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		Q->front = (Q->front + 1) % cQ_SIZE;
		return Q->queue[Q->front];
	}
}

//원형 큐의 가장 앞에 있는 원소 출력
element peek(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		return Q->queue[(Q->front + 1) % cQ_SIZE];
	}
}

//원형 큐의 원소를 출력하는 연산
void printQ(QueueType* Q) {
	int i, first, last;
	first = (Q->front + 1)% cQ_SIZE;
	last = (Q->rear + 1)% cQ_SIZE;
	printf("Circular Queue:");
	i = first;
	while (i != last) {
		printf("%c", Q->queue[i]);
		i = (i + 1) % cQ_SIZE;
	}
}

int main(void) {
	QueueType* Q = createQueue();
	element data;
	printf("****원형 큐 연산****");
	printf("삽입 A>>"); enQueue(Q, 'A'); printQ(Q);
	printf("삽입 B>>"); enQueue(Q, 'B'); printQ(Q);
	printf("삽입 C>>"); enQueue(Q, 'C'); printQ(Q);
	printf("삭제>>"); data = deQueue(Q); printQ(Q);

}



