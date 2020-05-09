#include <stdio.h>
#include <stdlib.h>
#define Q_SIZE 4

//����: ���� �ڷᱸ���� ���� ť ����

typedef char element;//char�� element�� ��Ī
//��ĪQueueType�� ����ü �����

typedef struct {
	element queue[Q_SIZE];
	int front, rear;
}QueueType;//����ü ��Ī

//���� ���� ť�� �����ϴ� ����
QueueType *createQueue() {
	QueueType* Q;//Queuetype�� ����ü�� ����Ű�� ������ Q ����
	Q = (QueueType*)malloc(sizeof(QueueType));
	Q->front = -1;
	Q->rear = -1;
	return Q;
}
//���� ť�� ���� �������� �˻��ϴ� ����
int isEmpty(QueueType* Q) {
	if (Q->front == Q->rear) {
		printf("Q is empty!");
		return 1;
	}

	else return 0;
	
}
//���� ť�� ��ȭ �������� �˻��ϴ� ����
int isFull(QueueType* Q) {
	if (Q->rear == Q_SIZE - 1) {
		printf("Q is full");
		return 1;
	}
	else return 0;
	
}
//���� ť�� rear�� ���Ҹ� �����ϴ� ����
void enQueue(QueueType* Q, element item) {
	if (isFull(Q)) return;
	else {
		Q->rear++;
		Q->queue[Q->rear] = item;
	}
}
//���� ť�� front�� ���Ҹ� �����ϴ� ����
element deQueue(QueueType* Q) {
	if (isEmpty(Q)) return 0;
	else {
		Q->front++;
		return Q->queue[Q->front];
	}
	
}

//���� ť�� ���� �տ� �ִ� ���Ҹ� �˻��ϴ� ����
element peek(QueueType* Q) {
	if (isEmpty(Q)) exit(1);
	else {
		return Q->queue[Q->front + 1];
	}
}

//���� ť�� ���Ҹ� ����ϴ� ����
void printQ(QueueType* Q) {
	int i;
	printf("Q:");
	for (i = Q->front + 1; i <= Q->rear; i++) {
		printf("%3c", Q->queue[i]);
	}
}

int main(void) {
	QueueType* Q1 = createQueue();//ť ����
	element data=0;
	printf("\n****���� ť ����****\n");
	printf("\n����A>>"); enQueue(Q1, 'A'); printQ(Q1);
	printf("\n����B>>"); enQueue(Q1, 'B'); printQ(Q1);
	printf("\n����C>>"); enQueue(Q1, 'C'); printQ(Q1);
	printf("\n����>>"); data = deQueue(Q1); printQ(Q1);
	printf("���� ������: %c", data);
	printf("\n����>>"); data = deQueue(Q1); printQ(Q1);
	printf("���� ������ %c", data);
	
	

	
}




