����   = N  Questao3/Aplicacao  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LQuestao3/Aplicacao; main ([Ljava/lang/String;)V  Questao3/Aluno
  	  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # $Digite o nome e as 3 notas do aluno:
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - nextLine ()Ljava/lang/String;	  / 0 1 nome Ljava/lang/String;
  3 4 5 
nextDouble ()D	  7 8 9 nota1 D	  ; < 9 nota2	  > ? 9 nota3
 % A ( B (Ljava/lang/Object;)V
  D E  close args [Ljava/lang/String; aluno LQuestao3/Aluno; scan Ljava/util/Scanner; 
SourceFile Aplicacao.java !               /     *� �    
                    	       �     G� Y� L� Y� � M� "� $+,� *� .+,� 2� 6+,� 2� :+,� 2� =� +� @,� C�    
   * 
     
     #  +  3  ;  B  F          G F G    ? H I   4 J K   L    M