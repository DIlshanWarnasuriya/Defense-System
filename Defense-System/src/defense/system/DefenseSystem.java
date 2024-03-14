
package defense.system;

public class DefenseSystem {    
    
    public static void main(String[] args) {  
        
        MainController mainControler = MainController.getInstence();
        
        Helicopter helicopter = new Helicopter();
        Tank tank = new Tank();
        Submarine submarine = new Submarine();
        
        mainControler.addComponent(helicopter);
        mainControler.addComponent(tank);
        mainControler.addComponent(submarine);      
        
    }    
}
