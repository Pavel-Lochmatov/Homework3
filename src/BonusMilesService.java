public class BonusMilesService {
    public int calculate(int cost) {
        // количество потраченных рублей для одной бонусной милли
        int summforOneMile = 20;
        //количество бонусных миль за билет
        int countBonusMiles = cost / summforOneMile;
        return countBonusMiles;
    }
}
