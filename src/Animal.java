public enum Animal {
    DOG("Paco"), CAT("Pepe");

    private String name;

    Animal (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
