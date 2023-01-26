public class Original extends DecoratorMakanan {
    public Original(Makanan decoratedMakanan){
        super(decoratedMakanan);
    }
    
    @Override
    public double getHarga(){
        return super.getHarga();
    }
    
    @Override
    public String getKomposisi(){
    return super.getKomposisi() + " Original : ";
}
}
