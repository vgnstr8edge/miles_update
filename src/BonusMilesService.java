public class BonusMilesService {
    public int calculate(int price) {
        int bonus = 20;
        int cost = price / bonus;
        return cost;
    }
}
