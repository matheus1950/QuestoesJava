����   = Q  Questao2/Aplicacao  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LQuestao2/Aplicacao; main ([Ljava/lang/String;)V  Questao2/Empregado
  	  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     ! out Ljava/io/PrintStream; # BDigite nome, salário e taxa de imposto do empregado(nesta ordem):
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - next ()Ljava/lang/String;	  / 0 1 nome Ljava/lang/String;
  3 4 5 
nextDouble ()D	  7 8 9 salarioBruto D	  ; < 9 taxa > +Digite o percentual de incremento salarial:
  @ A B incrementarSalario (D)V
 % D ( E (Ljava/lang/Object;)V
  G H  close args [Ljava/lang/String; 	empregado LQuestao2/Empregado; scan Ljava/util/Scanner; 
SourceFile Aplicacao.java !               /     *� �    
                    	       �     Q� Y� L� Y� � M� "� $+,� *� .+,� 2� 6+,� 2� :� =� $,� 2J+)� ?� +� C,� F�    
   2    	       #  +  3  ;  @  E  L  P     *    Q I J    I K L   > M N  @  < 9   O    P