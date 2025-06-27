// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(37, 38, 89, 90, 84)));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    //difference between grade and next multiple of 5 is less than 3 then grade will be next multiple
    //difference between grade and next multiple of 5 is >=3 gradle will be the current grade
    // grade less than 38 result will be current grade

    //Time -> O(n) & Space -> O(n)
    // List<Integer> finalGrades = new ArrayList<>();
    // for(Integer grade :grades) {
    //     if(grade > 37) {
    //         int nextMultipleResidual = 5 - grade % 5;
    //         int finalGrade = grade + nextMultipleResidual;
    //         if(finalGrade - grade  < 3 ) {
    //             finalGrades.add(finalGrade);
    //         }else {
    //             finalGrades.add(grade);
    //         }     
    //     }else {
    //         finalGrades.add(grade);
    //     }
    // }
    // return finalGrades;

    //Java 8
    return grades.stream().map(grade -> {
        if (grade < 38)  return grade;
        int nextMultipleOf5 = ((grade / 5) + 1) * 5;
        return (nextMultipleOf5 - grade < 3) ? nextMultipleOf5 : grade;
    }).collect(Collectors.toList());
    }

}
