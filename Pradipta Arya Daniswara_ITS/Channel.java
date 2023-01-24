public class Channel 
{
    private String name;
    private int frequency;

    public Channel(String name, int frequency)
	{
        this.name = name;
        this.frequency = frequency;
	}

    public void setName(String name)
    {
        this.name = name;
    }

    public void setFrequency(int frequency)
    {
        this.frequency = frequency;
    }

    public String getName()
    {
        return name;
    }

    public int getFrequency()
    {
        return frequency;
    }
}
