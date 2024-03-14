package defense.system;

public interface Observer {    
    
    public int getSoldierCount();
    public int getAmmoAmount();
    public int getFualValue();
    
    public void getMessage(String message);   
    
    public void SetAreaClearance(String Situation);
    
    public String getposition();
    public void buttonEnable(int level);
    
    @Override
    public String toString();
   
}
