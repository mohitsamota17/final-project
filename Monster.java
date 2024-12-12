import java.io.*;

public abstract class Monster {
    protected String name;
    protected String color;
    protected int strength;
    protected int speed;

    public Monster(String name, String color, int strength, int speed) {
        this.name = name;
        this.color = color;
        this.strength = strength;
        this.speed = speed;
    }

    public abstract void performSpecialAbility();

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(this.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving monster: " + e.getMessage());
        }
    }

    public static Monster loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                String[] data = line.split(",");
                // For simplicity, assume it's a FlyingMonster
                return new FlyingMonster(data[0], data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]));
            }
        } catch (IOException e) {
            System.out.println("Error loading monster: " + e.getMessage());
        }
        return null;
    }

    @Override
    public String toString() {
        return name + "," + color + "," + strength + "," + speed;
    }
}
