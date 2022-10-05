public class ComputerScienceStudent extends Student{


    public ComputerScienceStudent(int id, String name, String programingLanguages) {
        super(id, name);
        this.programingLanguages = programingLanguages;
    }



    private String programingLanguages;

    public String getProgramingLanguages(){

        return programingLanguages;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "programingLanguages='" + programingLanguages + '\'' +
                "} " + super.toString();
    }
}
