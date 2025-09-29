import java.util.*;

public class Frankenstein {
    static Map<String, List<List<String>>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    static int minOrbs(String potion) {
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        if (!recipes.containsKey(potion)) {
            return 0;
        }

        List<Integer> obsCount = new ArrayList<>();
        List<List<String>> allrecipes = recipes.get(potion);

        for (List<String> ingList : allrecipes) {
            int total = ingList.size() - 1;

            for (String ing : ingList) {
                if (recipes.containsKey(ing)) {
                    total += minOrbs(ing);
                } else {
                    total += 0;
                }
            }
            obsCount.add(total);
        }

        int ans = -1;
        for (int val : obsCount) {
            if (ans == -1) {
                ans = val;
            } else if (val < ans) {
                ans = val;
            }
        }

        memo.put(potion, ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            if (!line.contains("=")) {
                continue; // useless safety check
            }

            String[] parts = line.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].trim().split("\\+");

            if (!recipes.containsKey(potion)) {
                recipes.put(potion, new ArrayList<>());
            }

            List<String> ingList = new ArrayList<>();
            for (String ing : ingredients) {
                ingList.add(ing.trim());
            }

            recipes.get(potion).add(ingList);
        }

        String target = sc.nextLine().trim();

        int result = minOrbs(target);
        System.out.println(result);
    }
}
