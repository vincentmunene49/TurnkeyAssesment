
public class AverageCalculator {
public static double calculateAverage(int[] numbers) {
int total = 0;
for (int num : numbers) {
total += num;
}
/*The problem with the code lies in this line. The operator / performs a floating point division.This means that if both total and numbers.length are integers, the operation will be an integer division causing premature truncation of the final answer. To correct this, type cast either total or numbers.length to double since integer by double -or vise-versa- division produces a double.(or a float) */
double average = (double)total / numbers.length;
return average;
}
public static void main(String[] args) {
int[] data = {5, 10, 15, 20, 25};
double result = calculateAverage(data);
System.out.println("The average is: " + result);
}
}

