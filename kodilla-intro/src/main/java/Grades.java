public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (size == 0) {
            throw new IllegalStateException("No grades in array.");
        }
        return grades[size - 1];
    }
    public double calculateAverage() {
        if (size == 0) {
            throw new IllegalStateException("No grades in array");
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += grades[i];
        }
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Grades gradesList = new Grades();

        gradesList.add(3);
        gradesList.add(5);
        gradesList.add(2);
        gradesList.add(5);
        gradesList.add(5);
        gradesList.add(3);
        gradesList.add(3);
        gradesList.add(4);
        gradesList.add(2);
        gradesList.add(5);

        try {
            int lastGrade = gradesList.getLastGrade();
            System.out.println("Last grade: " + lastGrade);
            double average = gradesList.calculateAverage();
            System.out.println("Average grade: " + average);
        } catch (IllegalStateException e) {
            System.out.println("No grades.");
        }
    }
}





