package _1103_Distribute_Candies_to_People;


/**
 * Created by muscaestar on 3/5/20
 *
 * @author muscaestar
 */
public class SolutionMath implements Solution {
    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        // AP(arithmetic progression with common difference 1) + remaining
        int lenOfAP = (int) (Math.sqrt(2 * candies + 0.25) - 0.5);
        int numOfFullRound = lenOfAP / num_people;

        for (int i = 0; i < num_people; i++) {
            // sum for full round
            res[i] = (i + 1) * numOfFullRound + num_people * (numOfFullRound * (numOfFullRound - 1) / 2);
//            for (int j = 0; j < numOfFullRound; j++) {
//                res[i] += (i + 1) + num_people * j;
//            }

            // add last round value
            if (i < lenOfAP % num_people) {
                // += from AP
                res[i] += (i + 1) + num_people * (numOfFullRound);
            } else if (i == lenOfAP % num_people) {
                // += remaining
                res[i] += candies - (1 + lenOfAP) * lenOfAP / 2;
            }
        }
        return res;
    }

}
