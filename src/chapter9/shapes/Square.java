package chapter9.shapes;

public class Square extends Rectangle{
    @Override
    public double calculatePerimeter(){
        return numberOfSides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
