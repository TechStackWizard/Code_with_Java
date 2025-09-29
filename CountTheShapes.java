import java.util.*;

public class CountTheShapes {

    static class Point {
        int x, y;

        Point(int a, int b) {
            x = a;
            y = b;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Point))
                return false;
            Point p = (Point) o;
            return this.x == p.x && this.y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        // Graph
        Map<Point, List<Point>> graph = new HashMap<>();
        int edges = 0;

        for (int i = 0; i < N; i++) {
            String allIntegers = sc.nextLine().trim();
            String values[] = allIntegers.split(" ");

            int x1 = Integer.parseInt(values[0]);
            int y1 = Integer.parseInt(values[1]);
            int x2 = Integer.parseInt(values[2]);
            int y2 = Integer.parseInt(values[3]);

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);

            graph.putIfAbsent(p1, new ArrayList<>());
            graph.putIfAbsent(p2, new ArrayList<>());

            graph.get(p1).add(p2);
            graph.get(p2).add(p1);

            edges++;
        }

        int vertices = graph.size();

        Set<Point> visited = new HashSet<>();
        int components = 0;

        for (Point start : graph.keySet()) {
            if (!visited.contains(start)) {
                components++;

                Stack<Point> st = new Stack<>();
                st.push(start);
                while (!st.isEmpty()) {
                    Point curr = st.pop();
                    if (visited.contains(curr))
                        continue;
                    visited.add(curr);
                    for (Point nb : graph.get(curr)) {
                        if (!visited.contains(nb)) {
                            st.push(nb);
                        }
                    }
                }
            }
        }

        // Euler formula derived: Faces = E - V + C + 1

        int closedFigures = edges - vertices + components;

        System.out.println(closedFigures);
    }
}
