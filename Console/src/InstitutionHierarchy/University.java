package InstitutionHierarchy;

public class University extends Institution{
    int FacultiesNumber;
    String AccreditationLevel;
    public University(String name, String address, int foundationYear, int facultiesNumber, String accreditationLevel) throws IllegalArgumentException {
        super(name, address, foundationYear);
        if(facultiesNumber < 0){
            throw new IllegalArgumentException("Not correct faculty number");
        }
        FacultiesNumber = facultiesNumber;
        AccreditationLevel = accreditationLevel;
    }
    public int getFacultiesNumber(){
        return FacultiesNumber;
    }
    public String getAccreditationLevel(){
        return AccreditationLevel;
    }
}
