package Lab6;
class Faculty {
    String name;
    String department;
    int experienceYears;

    Faculty(String name, String department, int experienceYears) {
        this.name = name;
        this.department = department;
        this.experienceYears = experienceYears;
    }

    void display() {
        System.out.println(name + " " + department + " " + experienceYears);
    }
}

public class facultyarray {
    public static void main(String[] args) {

        Faculty[] faculty = new Faculty[4];

        faculty[0] = new Faculty("Amit", "CSE", 5);
        faculty[1] = new Faculty("Riya", "ECE", 7);
        faculty[2] = new Faculty("Karan", "ME", 4);
        faculty[3] = new Faculty("Neha", "IT", 6);

        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i].name.equals("Riya")) {
                faculty[i].department = "CSE";
            }
        }

        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i] != null && faculty[i].name.equals("Karan")) {
                faculty[i] = null;
            }
        }

        for (int i = 0; i < faculty.length; i++) {
            if (faculty[i] != null) {
                faculty[i].display();
            }
        }
    }
}
