import java.util.*;

public class MagicStatIntensity {

    static class Line {
        int x1, y1, x2, y2;

        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }

    // Function to check intersection and return point
    static int[] getIntersection(Line l1, Line l2) {
        // Check vertical lines
        if (l1.x1 == l1.x2 && l2.y1 == l2.y2) {
            if (l2.x1 <= l1.x1 && l1.x1 <= l2.x2 &&
                    l1.y1 <= l2.y1 && l2.y1 <= l1.y2) {
                return new int[] { l1.x1, l2.y1 };
            }
        }
        return null;
    }

    static List<Integer> cellsTouched(Line line, int[] star) {
        List<Integer> result = new ArrayList<>();
        int x = star[0], y = star[1];

        if ((line.x1 == x && line.y1 == y) || (line.x2 == x && line.y2 == y)) {
            result.add(Math.max(Math.abs(line.x2 - x), Math.abs(line.y2 - y)));
        }

        else {
            int left = Math.max(Math.abs(line.x1 - x), Math.abs(line.y1 - y));
            int right = Math.max(Math.abs(line.x2 - x), Math.abs(line.y2 - y));
            result.add(left);
            result.add(right);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine().trim());

        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String allIntegers = sc.nextLine().trim();
            String values[] = allIntegers.split(" ");

            int x1 = Integer.parseInt(values[0]);
            int y1 = Integer.parseInt(values[1]);
            int x2 = Integer.parseInt(values[2]);
            int y2 = Integer.parseInt(values[3]);
            lines.add(new Line(x1, y1, x2, y2));
        }

        int K = sc.nextInt();

        Map<String, List<Line>> intersections = new HashMap<>();

        // Step 1: Find intersections of all line pairs
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int[] pt = getIntersection(lines.get(i), lines.get(j));
                if (pt != null) {
                    String key = pt[0] + "," + pt[1];
                    intersections.putIfAbsent(key, new ArrayList<>());
                    intersections.get(key).add(lines.get(i));
                    intersections.get(key).add(lines.get(j));
                }
            }
        }

        int totalIntensity = 0;

        // Step 2: For each intersection point, check star type
        for (String key : intersections.keySet()) {
            List<Line> lns = intersections.get(key);
            Set<Line> unique = new HashSet<>(lns);
            if (unique.size() == K) {
                String[] parts = key.split(",");
                int[] star = { Integer.parseInt(parts[0]), Integer.parseInt(parts[1]) };

                List<Integer> values = new ArrayList<>();
                for (Line line : unique) {
                    values.addAll(cellsTouched(line, star));
                }
                int intensity = Collections.min(values);
                totalIntensity += intensity;
            }
        }

        System.out.println(totalIntensity);
    }
}
