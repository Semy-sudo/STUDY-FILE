����   4 G  com/calculator/CalculatorTest  java/lang/Object cal Lcom/calculator/Calculator; <init> ()V Code
     LineNumberTable LocalVariableTable this Lcom/calculator/CalculatorTest; setup RuntimeVisibleAnnotations Lorg/junit/Before;  com/calculator/Calculator
  	    	    java/lang/System   out Ljava/io/PrintStream;  before
 ! # " java/io/PrintStream $ % println (Ljava/lang/String;)V oneadd Lorg/junit/Test;        + 1,2,3
  - & . (Ljava/lang/String;)I
 0 2 1 org/junit/Assert 3 4 assertEquals (JJ)V & mixadd 8 1,2;3
  : 6 . 6 
anotheradd > 	//;
1;2;3
  @ < . < teardown Lorg/junit/After; B 
SourceFile CalculatorTest.java !                	   /     *� 
�                                    	   F     *� Y� � � �  �                             &        '   	   K      (*� *� ,�� /� 5�  �                             6        '   	   K      (*� 7� 9�� /� ;�  �                             <        '   	   K      (*� =� ?�� /� A�  �           "  #  $              B        C   	   7     	� D�  �       
    )  *        	      E    F