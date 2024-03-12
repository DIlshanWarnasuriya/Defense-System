package defense.system;

public enum strengthLevels {
    LOW(40), MEDIUM(60), HIGH(80), STRONG(100), CLOSED(20);
    
    private int strengthLevel;
    
    strengthLevels(int strengthLevel){
        this.strengthLevel=strengthLevel;
    }
}
