����   = b  Questao1/Aplicacao  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LQuestao1/Aplicacao; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V  Questao1/Retangulo
  		     ! out Ljava/io/PrintStream; # +Entre com a largura e altura do retângulo:
 % ' & java/io/PrintStream ( ) println (Ljava/lang/String;)V
  + , - 
nextDouble ()D	  / 0 1 largura D	  3 4 1 altura
  6 7 - area   9 : ; makeConcatWithConstants (D)Ljava/lang/String;
  = > - diagonal  9
  A B - 	perimetro  9
  E F  close args [Ljava/lang/String; scan Ljava/util/Scanner; 	retangulo LQuestao1/Retangulo; 
SourceFile Aplicacao.java BootstrapMethods
 Q S R $java/lang/invoke/StringConcatFactory : T �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; P W area :  Y diagonal:  [ perimetro:  InnerClasses ^ %java/lang/invoke/MethodHandles$Lookup ` java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	       �     ]� Y� � L� Y� M� "� $,+� *� .,+� *� 2� ,� 5� 8  � $� ,� <� ?  � $� ,� @� C  � $+� D�    
   * 
   	       #  +  :  I  X  \          ] G H    R I J   J K L   M    N O     U  V U  X U  Z \   
  ] _ a 