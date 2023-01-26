public class Daging extends DecoratorMakanan {
    public Daging(Makanan decoratedMakanan){
        super(decoratedMakanan);
    }
    
    @Override
    public double getHarga(){
        return super.getHarga() + 6500;
    }
    
    @Override
    public String getKomposisi(){
        return super.getKomposisi() + " Daging : ";
    }
}
