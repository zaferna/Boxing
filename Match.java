public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
     int firstStart;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight, int firstStart) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstStart = firstStart;

    }

    void run() {

        if (isCheck()) {
            if(isFirstPunch()) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println(" =========Yeni Round=========");

                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + " Cani==> " + this.f2.health);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + " Cani==> " + this.f1.health);
                    if (isWin()) {
                        break;
                    }

                }
            }
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println(" =========Yeni Round=========");

                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name+" Cani==> "+this.f1.health);
                if(isWin()){
                    break;
                }
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name+" Cani==> "+this.f2.health);
                if(isWin()){
                    break;
                }



            }
        } else {

            System.out.println(" sporcularin siklti uyusmuyor");
        }
    }


    boolean isCheck() {

        return ((this.f1.weight <= maxWeight && this.f1.weight >= minWeight) && (this.f2.weight <= maxWeight && this.f2.weight >= minWeight));
    }

    boolean isWin() {
       if(f1.health == 0){
           System.out.println(f2.name+ " Kazandi ");
           return true;
       }
       if(f2.health== 0){
           System.out.println(f1.name +" Kazandi ");
           return true;
       }
       return false;

    }

    boolean isFirstPunch() {
         double randomStart = Math.random()*100;
         return randomStart<= this.firstStart;


    }


}



