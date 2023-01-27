namespace shape;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Masukkan banyaknya bangun datar:");
        int numShapes = int.Parse(Console.ReadLine());
        IShape[] shapes = new IShape[numShapes];
        for (int i = 0; i < numShapes; i++)
        {
            Console.WriteLine("Masukkan jenis bangun datar (pp untuk persegi panjang, l untuk lingkaran):");
            string shapeType = Console.ReadLine();
            if (shapeType.Equals("pp"))
            {
                Console.WriteLine("Masukkan panjang persegi panjang:");
                double length = double.Parse(Console.ReadLine());
                Console.WriteLine("Masukkan lebar persegi panjang:");
                double width = double.Parse(Console.ReadLine());
                shapes[i] = new Rectangle(length, width);
            }
            else if (shapeType.Equals("l"))
            {
                Console.WriteLine("Masukkan jari-jari lingkaran:");
                double radius = double.Parse(Console.ReadLine());
                shapes[i] = new Circle(radius);
            }
        }
        AreaCalculator calculator = new AreaCalculator(shapes);
        Console.WriteLine("Luas total: " + calculator.TotalArea());
    }
}

// Interface untuk objek-objek bangun datar
interface IShape
{
    double GetArea();
}

// Abstract class
abstract class GeometricShape : IShape
{
    public abstract double GetArea();
}

// Concrete class untuk persegi panjang
class Rectangle : GeometricShape
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public override double GetArea()
    {
        return length * width;
    }
}

// Concrete class untuk lingkaran
class Circle : GeometricShape
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public override double GetArea()
    {
        return Math.PI * radius * radius;
    }
}

// Class yang menggunakan strategy design pattern untuk menghitung luas total dari beberapa bangun datar
class AreaCalculator
{
    private IShape[] shapes;

    public AreaCalculator(IShape[] shapes)
    {
        this.shapes = shapes;
    }

    public double TotalArea()
    {
        double totalArea = 0;
        foreach (IShape shape in shapes)
        {
            totalArea += shape.GetArea();
        }
        return totalArea;
    }
}
