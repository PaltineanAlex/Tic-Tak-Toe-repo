public class Players{
    private String name1, name2;

    public Players() {
    }

    public String getName1() {

        return name1;
    }

    public void setName1(String name1) {

        this.name1 = name1;
    }

    public String getName2() {

        return name2;
    }

    public void setName2(String name2) {

        this.name2 = name2;
    }

    public void turnP1() {
        System.out.println("It's your turn, " + name1 + ". What tile do you choose?");
    }

    public void turnP2(){
        System.out.println("It's your turn, " + name2 + ". What tile do you choose?");
    }
}