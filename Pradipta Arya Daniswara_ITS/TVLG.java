public class TVLG extends TVDefault implements Control 
{
	public TVLG()
	{
		super();
	}

	public TVLG(Channel[] channel, int arrayCounter, int volume, int activeChannel, boolean isOn)
	{
		super(channel, arrayCounter, volume, activeChannel, isOn);
	}

	public void turnOnOff(int input) 
	{
		if (input == 1) setStatus(true);
		else if (input == 0) setStatus(false);

		if (getStatus() == true) System.out.println("--------------------------------------\n" +
		"LG TV turned on!\n" +
		"Currently watching " + getActiveChannel().getName() + " with " + getVolume() + "% volume!\n" +
		"--------------------------------------");
		else System.out.println("--------------------------------------\n" +
		"LG TV turned off!\n" +
		"--------------------------------------");
	}

	public void moveChannel(int frequency) 
	{
		setActiveChannel(frequency);
		System.out.println("--------------------------------------\n" +
		"Set active channel to "+ getChannel(frequency).getName() + "!\n" +
		"--------------------------------------");
	}

	public void setVolumeUp(int intensity) 
	{
		if (getVolume() - intensity > 100) setVolume(100);
		else setVolume(getVolume() + intensity);
		System.out.println("--------------------------------------\n" +
		"Volume set to " + getVolume() + "%!\n" +
		"--------------------------------------");
	}

	public void setVolumeDown(int intensity) 
	{
		if (getVolume() - intensity < 0) setVolume(0);
		else setVolume(getVolume() - intensity);
		System.out.println("--------------------------------------\n" +
		"Volume set to " + getVolume() + "%!\n" +
		"--------------------------------------");
	}
}