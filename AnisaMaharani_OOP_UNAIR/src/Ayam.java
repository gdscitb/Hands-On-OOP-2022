public class Ayam extends DecoratorMakanan{
    public Ayam(Makanan decoratedMakanan){
        super(decoratedMakanan);
    }
    
    @Override
    public double getHarga(){
        return super.getHarga() + 4500;
    }
    
    @Override
    public String getKomposisi(){
    return super.getKomposisi() + " Ayam : ";
}
}
