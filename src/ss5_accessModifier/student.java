package ss5_accessModifier;

public class student {
    private String name ="John";
    private String classes="C02";
    public Student(){
    }
    public void setName(String name){
        this.name=name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getInfo() {
        return "Tên: " + name + ", Lớp: " + classes;
    }
}
