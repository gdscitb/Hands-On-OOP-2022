public abstract class DecoratorMakanan extends Makanan {
    private final Makanan decoratedMakanan;
    
    public DecoratorMakanan(Makanan decoratedMakanan){
        this.decoratedMakanan = decoratedMakanan;
    }
    
    @Override
    public double getHarga(){
        return decoratedMakanan.getHarga();
    }
    
    @Override
    public String getKomposisi(){
        return decoratedMakanan.getKomposisi();
    }
}
