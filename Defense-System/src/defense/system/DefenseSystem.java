
package defense.system;

public class DefenseSystem {    
    
    public static void main(String[] args) {     
        MainController mainControler = new MainController();
        
        Helicopter helicopter = new Helicopter(mainControler);
        Tank tank = new Tank(mainControler);
        Submarine submarine = new Submarine(mainControler);
        
        mainControler.addComponent(helicopter);
        mainControler.addComponent(tank);
        mainControler.addComponent(submarine);      
        
    }    
}
