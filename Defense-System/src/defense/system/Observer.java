package defense.system;

public interface Observer {
    public MainController mainController = DefenseSystem.mainControler;
    
    public int getSoldierCount();
    public int getAmmoAmount();
    public int getFualValue();
    
    public void getMessage(String message);   
    
    @Override
    public String toString();
   
}
