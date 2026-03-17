class Animal{
    
    void sound(){
        System.out.println("Animal makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("Lion is Roaring");
    } 
}

public class Third{
  public static void main(String[] args){
      Animal animal=new Animal();
      animal.sound();
      
      animal = new Dog();
      animal.sound();
      
      animal = new Lion();
      animal.sound();
  }
}
