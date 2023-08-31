package problem;

public class Problem {
    private String problemName;
    private String problemDescription;
    private boolean isSolved = false;
    private ProbleType probleType;

    public String getProblemName() {
        return problemName;
    }

    public void setProblemName(String problemName) {
        this.problemName = problemName;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }
    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public ProbleType getProbleType() {
        return probleType;
    }

    public void setProbleType(ProbleType probleType) {
        this.probleType = probleType;
    }
}
