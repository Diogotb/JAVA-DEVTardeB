package RevisaoFPOO.Cadastro;

public class Cachorro extends Animais{
    boolean pulgas;

    
    public Cachorro(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    
}
