package chapter11.farm;

public class Duck extends Animal{
    private String sound;

    public Duck(String sound) {
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
