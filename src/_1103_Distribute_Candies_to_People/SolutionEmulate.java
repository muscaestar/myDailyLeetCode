package _1103_Distribute_Candies_to_People;

/**
 * Created by muscaestar on 3/5/20
 *
 * @author muscaestar
 */
class SolutionEmulate implements Solution {
    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int i = 0;
        while (candies > 0) {
            int round = i / num_people + 1;
            int index = i % num_people;
            int temp = index + 1 + num_people * (round - 1);

            res[index] += Math.min(candies, temp);

            candies -= temp;
            i++;
        }
        return res;
    }
}
