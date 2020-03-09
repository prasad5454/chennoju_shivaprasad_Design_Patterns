package com.shivaprasad.Design_Patterns.Creational_patterns.FactoryPattern;

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}