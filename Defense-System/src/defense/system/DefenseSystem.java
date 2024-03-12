
package defense.system;

public class DefenseSystem {

    public static MainController mainControler = new MainController();
    
    public static void main(String[] args) {
        
        
        
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        
        mainControler.addComponent(helicopter);
        mainControler.addComponent(tank);
        mainControler.addComponent(submarine);
        
        
        
        
        
    }
    
}
