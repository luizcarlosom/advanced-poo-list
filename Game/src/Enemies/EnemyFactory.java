package Enemies;

public class EnemyFactory {
    public Enemy createEnemy(String scenario) {
        Enemy enemy = null;

        if(scenario.equals("Amazônia")) {
            enemy = new MutantAnimal();
        } else if (scenario.equals("Sertão Brasileiro")) {
            enemy = new Cangaceiro();
        } else if (scenario.equals("Rio de Janeiro")) {
            enemy = new Criminal();
        }
        return enemy;
    }
}
