public class Teacher {
    private String name;
    private String surname;
    private String sphereOfDuty;
    private Integer id;

    public Teacher(String name, String surname, String sphereOfDuty, int id){
        this.name = name;
        this.surname = surname;
        this.sphereOfDuty = sphereOfDuty;
        this.id = id;
    }

    public String[] getInfo(){
        String[] lst = {name, surname, sphereOfDuty, id.toString()};
        return lst;
    }
}
