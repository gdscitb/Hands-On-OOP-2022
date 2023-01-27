using System;

class Kendaraan
{
    public string PlatNomor { get; set; }
    public double Durasi { get; set; } //lama parkir per jam

    public virtual double HitungBiaya()
    {
        double biaya = Durasi * 2000;
        return biaya;
    }
}

class Motor : Kendaraan
{
    public double UkuranCC { get; set; }
}

class Mobil : Kendaraan
{
    public string Jenis { get; set; }
}

class Bus : Kendaraan
{
    public double Panjang { get; set; }
    public double Berat { get; set; }

    public override double HitungBiaya()
    {
        double biaya = Durasi * 5000;
        return biaya;
    }
}

class Program
{
    static void Main(string[] args)
    {
        Motor motor = new Motor() { PlatNomor = "F1223JZ", UkuranCC = 125 };

        Mobil mobil = new Mobil() { PlatNomor = "D2828HN", Jenis = "Sedan" };
        
        Bus bus = new Bus() { PlatNomor = "D4756PP", Panjang = 9, Berat = 12000 }; 
    }
}
