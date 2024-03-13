package defense.system;

public interface Observer {
    public MainController mainController = DefenseSystem.mainControler;
    
    public int getSoldierCount();
    public int getAmmoAmount();
    public int getFualValue();
    
    public void getMessage(String message);   
    
    public void SetAreaClearance(String Situation);
    
    @Override
    public String toString();
   
}
