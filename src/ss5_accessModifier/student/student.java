package ss5_accessModifier.student;

public class student {
    private String name ="John";
    private String classes="C02";
    public student(){
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
