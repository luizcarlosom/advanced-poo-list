import Enemies.Enemy;
import Enemies.EnemyFactory;

public class App {
    public static void main(String[] args) throws Exception {
        EnemyFactory enemyFactory = new EnemyFactory();

        Enemy mutantAnimal = enemyFactory.createEnemy("Amazônia");
        mutantAnimal.attack();

        Enemy cangaceiro = enemyFactory.createEnemy("Sertão Brasileiro");
        cangaceiro.attack();

        Enemy criminal = enemyFactory.createEnemy("Rio de Janeiro");
        criminal.attack();
    }
}
