package creational.builder.example;

import creational.builder.example.Builder;

//its actually construct whole object
public class Director {
   private Builder builder;

   public void construct(Builder builder){
       this.builder=builder;
       builder.addWheel();
       builder.addHeadLights();
       builder.addGlass();

   }

}
