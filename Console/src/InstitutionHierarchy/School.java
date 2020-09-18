package InstitutionHierarchy;

public class School extends Institution {
    int Number;
    int StudentsNumber;

    public School(String name, String address, int foundationYear, int number, int studentsNumber) throws IllegalArgumentException {
        super(name, address, foundationYear);
        if(Number < 0){
            throw new IllegalArgumentException("Not correct school number");
        }
        if(studentsNumber < 0){
            throw new IllegalArgumentException("Not correct students number");
        }
        Number = number;
        StudentsNumber = studentsNumber;
    }

    public int getNumber() {
        return Number;
    }

    public int getStudentsNumber() {
        return StudentsNumber;
    }

    @Override
    public String toString() {
        return "School{" +
                "Number=" + Number +
                ", StudentsNumber=" + StudentsNumber +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", FoundationYear=" + FoundationYear +
                '}';
    }
}
