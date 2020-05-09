#include <stdio.h>
#include <stdlib.h>
#define Q_SIZE 4

//문제: 순차 자료구조로 원형 큐 구현

typedef char element;//char를 element로 별칭
//별칭QueueType의 구조체 만들기

typedef struct {
	element queue[Q_SIZE];
	int front, rear;
}QueueType;//구조체 별칭

//공백 순차 큐를 생성하는 연산
QueueType *createQueue() {
	QueueType* Q;//Queuetype의 구조체를 가리키는 포인터 Q 선언
	Q = (QueueType*)malloc(sizeof(QueueType));
	Q->front = -1;
	Q->rear = -1;
	return Q;
}
//순차 큐가 공백 상태인지 검사하는 연산
int isEmpty(QueueType* Q) {
	if (Q->front == Q->rear) {
		printf("Q is empty!");
		return 1;
	}

	else return 0;
	
}
//순차 큐가 포화 상태인지 검사하는 연산
int isFull(QueueType* Q) {
	if (Q->rear == Q_SIZE - 1) {
		printf("Q is full");
		return 1;
	}
	else return 0;
	
}
//순차 큐의 rear에 원소를 삽입하는 연산
void enQueue(QueueType* Q, element item) {
	if (isFull(Q)) return;
	else {
		Q->rear++;
		Q->queue[Q->rear] = item;
	}
}
//순차 큐의 front에 원소를 삭제하는 연산
element deQueue(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		Q->front++;
		return Q->queue[Q->front];
	}
	
}

//순차 큐의 가장 앞에 있는 원소를 검색하는 연산
element peek(QueueType* Q) {
	if (isEmpty(Q)) exit(1);
	else {
		return Q->queue[Q->front + 1];
	}
}

//순차 큐의 원소를 출력하는 연산
void printQ(QueueType* Q) {
	int i;
	printf("Q:");
	for (i = Q->front + 1; i <= Q->rear; i++) {
		printf("%3c", Q->queue[i]);
	}
}

int main(void) {
	QueueType* Q1 = createQueue();//큐 생성
	element data=0;
	printf("\n****순차 큐 연산****\n");
	printf("\n삽입A>>"); enQueue(Q1, 'A'); printQ(Q1);
	printf("\n삽입B>>"); enQueue(Q1, 'B'); printQ(Q1);
	printf("\n삽입C>>"); enQueue(Q1, 'C'); printQ(Q1);
	printf("\n삭제>>"); data = deQueue(Q1); printQ(Q1);
	printf("삭제 데이터: %c", data);
	printf("\n삭제>>"); data = deQueue(Q1); printQ(Q1);
	printf("삭제 데이터 %c", data);
	
	

	
}




