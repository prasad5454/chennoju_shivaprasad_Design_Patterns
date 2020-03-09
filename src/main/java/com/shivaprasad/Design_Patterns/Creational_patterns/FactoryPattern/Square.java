package com.shivaprasad.Design_Patterns.Creational_patterns.FactoryPattern;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}