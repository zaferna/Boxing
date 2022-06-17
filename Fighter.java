public class Fighter {

    String name;
    int health;
    int damage;
    int weight;
    int dodge;



    Fighter (String name,int health, int damage,int weight,int dodge) {

        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;


        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;

        }
    }

    int hit(Fighter foe){

        System.out.println(this.name + " ==>"+ foe.name+  "'e "+ this.damage+ "  Hasar Vurdu..");
        if(foe.isDodge()){

            System.out.println(foe.name+ " gelen hasari blockladi  ");
            return foe.health;
        }

        if(foe.health - this.damage<=0){
            return 0 ;

        }
        return foe.health - this.damage;
    }

    boolean isDodge(){

        double randomNum = Math.random()*100; // deneme yaptim ifli olursa//
        if(randomNum<= this.dodge){
            return true;
        }
        return false;
    }



}
