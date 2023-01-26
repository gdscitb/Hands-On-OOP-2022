public class Telur extends DecoratorMakanan {
    public Telur(Makanan decoratedMakanan){
        super(decoratedMakanan);
    }
    
    @Override
    public double getHarga(){
        return super.getHarga() + 3000;
    }
    
    @Override
    public String getKomposisi(){
        return super.getKomposisi() + " Telur : ";
    }
}
