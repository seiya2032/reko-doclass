package function;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {
        // 5人分のStudentを作成してListの格納
        List<Student> students = Arrays.asList(
          new Student("Alice", 80),
          new Student("Bob", 75),
          new Student("Charlie", 90),
          new Student("David", 70),
          new Student("Eve", 85)
        );

        // スコアの合計値を出力
        int totalScore = students.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("Total score" + totalScore);

        // スコアが80以上を出力
        System.out.println("Scores >= 80:");
        students.stream()
                .filter(s -> s.getScore() >= 80)
                .forEach(s -> System.out.println(s.getName() + "; " + s.getScore()));

        // スコアが高い順に並び替えて出力
        System.out.println("Scores sorted:");
        students.stream()
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .forEach(s -> System.out.println(s.getName() + "; " + s.getScore()));
    }
}
