public enum Model {
    HP("hp"),
    APPLE("ap"),
    ;
    private String name;

    Model(String name){
    this.name = name;
}
public String getName(){
        return name;
}
}
