public class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa){
        setId(id);
        setName(name);
        setGpa(gpa);
    }

    public void setId(int id){
        if (id<=0){
            throw new IllegalArgumentException("ID must be positive");
        }
        this.id = id;
    }
    public void setName(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        for (char c : name.toCharArray()){
            if (!Character.isLetter(c)){
                throw new IllegalArgumentException("Name must contain on;y alphabet");
            }
        }
        this.name = name;
    }

    public void setGpa(double gpa){
        if (gpa < 0.0 || gpa > 4.0){
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
        }
        this.gpa = gpa;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public double getGpa() {return gpa;}
}
