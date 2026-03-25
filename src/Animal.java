class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    @override
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
