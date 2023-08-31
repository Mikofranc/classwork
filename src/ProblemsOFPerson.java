import java.security.SecureRandom;

public class ProblemsOFPerson {

    public  enum Types{
        FINANCIAL, SPIRITUAL, EDUCATION, BUSINESS
    }
    private String nameOfProblem;
    private Boolean isSolved;
    private  Types typesOfProblem;

    public String getNameOfProblem() {
        return nameOfProblem;
    }
    public void setNameOfProblem(String name) {
        this.nameOfProblem = name;
    }
    public Boolean getSolved() {
        return isSolved;
    }
    public void setSolved(Boolean solved) {
        isSolved = solved;
    }
    public Types getTypes() {
        return typesOfProblem;
    }
    public void setTypes(Types types) {
        this.typesOfProblem = types;
    }

//
//    public Types addProblem(){
//        return SecureRandom(Types);
//    }

}
