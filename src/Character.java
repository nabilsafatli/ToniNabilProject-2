public class Character implements BasicCharacterActions{

    String name;
    int hp;
    int stamina;


    public Character(String name, int hp, int stamina){

        this.name = name;
        this.hp = hp;
        this.stamina = stamina;

    }

    public void sayHello(){

        System.out.println("Hello, my name is " + this.name);
    }

    public void attack(Character character) {

        character.hp--;

    }

    public void walk() {

        this.stamina--;

    }

    @Override
    public void statusUpdate() {
        System.out.println(name + " Current stats are hp:" + this.hp + " and stamina: " + this.stamina);
    }


}
