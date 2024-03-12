package defense.system;

public interface Observer {
    public MainController mainController = DefenseSystem.mainControler;
    
    public int getSoldierCount();
    public int getAmmoAmount();
    
    public void getMessage(String message);   
   
   
}
