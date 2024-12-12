import java.util.ArrayList;

public class MonsterManager {
    private ArrayList<Monster> monsters;

    public MonsterManager() {
        monsters = new ArrayList<>();
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
        System.out.println("Monster added: " + monster);
    }

    public void displayMonsters() {
        if (monsters.isEmpty()) {
            System.out.println("No monsters available.");
        } else {
            for (Monster monster : monsters) {
                System.out.println(monster);
            }
        }
    }

    public void saveAllMonsters(String filename) {
        for (Monster monster : monsters) {
            monster.saveToFile(filename);
        }
        System.out.println("All monsters saved to file.");
    }

    public void loadAllMonsters(String filename) {
        Monster loadedMonster = Monster.loadFromFile(filename);
        if (loadedMonster != null) {
            monsters.add(loadedMonster);
            System.out.println("Monster loaded: " + loadedMonster);
        }
    }
}
