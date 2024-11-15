import java.util.ArrayDeque;
import java.util.Deque;

public class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        int ableToEat = 0;

        Deque<Integer> studQueue = new ArrayDeque<>();
        Deque<Integer> sandQueue = new ArrayDeque<>();


        for (int student : students) {
            studQueue.add(student);
        }
        for (int sandwich : sandwiches) {
            sandQueue.add(sandwich);
        }

        int changes = 0;
        while (!studQueue.isEmpty() && !sandQueue.isEmpty()) {
            if (studQueue.getFirst().equals(sandQueue.getFirst())) {
                studQueue.removeFirst();
                sandQueue.removeFirst();
                ableToEat++;
                changes = 0;
            } else {
                studQueue.addLast(studQueue.removeFirst());
                changes++;
                if (changes == studQueue.size()) {
                    break;
                }
            }
        }

        return students.length - ableToEat;
    }
}
