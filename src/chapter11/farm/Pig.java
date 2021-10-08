package chapter11.farm;

public class Pig extends Animal{
    private String sound;

    public Pig(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    String makeSound() {
        return sound;
    }
}
