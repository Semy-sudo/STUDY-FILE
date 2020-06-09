#include <stdio.h>
#include <stdlib.h> //���� �޸� �����Լ� 
#define cQ_SIZE 4

//���� �ڷᱸ�� �̿��� ���� ť ����

typedef char element;//char�� ����� element
typedef struct {
	element queue[cQ_SIZE]; //1���� �迭 ť ����
	int front, rear;
}QueueType;

//���� ť �����
QueueType* createQueue() {
	QueueType* Q;
	Q = (QueueType*)malloc(sizeof(QueueType));
	//0���� �ʱ�ȭ�ϴ� ����: ť�� �� ������ �迭�� ũ��� ������ ������ �ϱ� ���ؼ�
	Q->front = 0;
	Q->rear = 0;
	return Q;
}

//���� ť�� ���� �������� �˻��ϴ� ����
int isEmpty(QueueType* Q) {
	if (Q->front == Q->rear) {
		printf("Circle Q is empty!");
		return 1;
	}
	else return 0;
}

//���� ť�� ��ȭ �������� Ȯ���ϴ� ����
int isFull(QueueType* Q) {
	if ((Q->rear + 1) % cQ_SIZE == Q->front) {
		printf("Circle Q is full!");
		return 1;
	}
	else return 0;
}

//���� ť�� rear�� ���Ҹ� �����ϴ� ����
void enQueue(QueueType* Q, element item) {
	if (isFull(Q)) return;
	else {
		Q->rear = (Q ->rear + 1)% cQ_SIZE;
		Q->queue[Q->rear] = item;
	}
}

//���� ť�� front�� ���Ҹ� �����ϴ� ����
element deQueue(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		Q->front = (Q->front + 1) % cQ_SIZE;
		return Q->queue[Q->front];
	}
}

//���� ť�� ���� �տ� �ִ� ���� ���
element peek(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		return Q->queue[(Q->front + 1) % cQ_SIZE];
	}
}

//���� ť�� ���Ҹ� ����ϴ� ����
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
	printf("****���� ť ����****");
	printf("���� A>>"); enQueue(Q, 'A'); printQ(Q);
	printf("���� B>>"); enQueue(Q, 'B'); printQ(Q);
	printf("���� C>>"); enQueue(Q, 'C'); printQ(Q);
	printf("����>>"); data = deQueue(Q); printQ(Q);

}



