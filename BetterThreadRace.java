class AnimalRunner extends Thread{
    protected String name;
    protected String animal;
    public AnimalRunner(String name, String animal){
        this.name = name;
        this.animal = animal;
    }

    protected void RunAnimal(String name){
        System.out.println(name + "correndo");
    }

    public void run(){
        for (int pos = 10; pos > 0; pos--) {
            RunAnimal(name);
            System.out.println(name + " is at position " + pos);
        }
        System.out.println(name + " " + animal + " finished the race!");
    }
}

class Rabbit extends AnimalRunner {
    public Rabbit(String name, String animal) {
        super(name, animal);
    }
    @Override
    public void RunAnimal(String name) {
        System.out.println(name + " is running fast");
    }
}

class Turtle extends AnimalRunner {
    public Turtle(String name, String animal) {
        super(name, animal);
    }

    @Override
    public void RunAnimal(String name) {
        System.out.println(name + " is running slow");
    }
}

class Golden_Lion_Tamarin extends AnimalRunner{
    public Golden_Lion_Tamarin(String name, String animal){
        super(name, animal);
    }

    @Override
    public void RunAnimal(String name) {
        System.out.println(name + " is running medium");
    }
}

class ThreadRace {
    public static void main(String[] args) {
        Rabbit r = new Rabbit("Snowball", "Rabbit");
        Thread t = new Thread(new Turtle("Donatello", "Turtle"));
        Thread glt = new Thread(new Golden_Lion_Tamarin("Lilith", "Golden_Lion_Tamarin"));
        r.start();
        t.start();
        glt.start();
    }
}