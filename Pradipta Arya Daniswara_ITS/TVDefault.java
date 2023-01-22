public abstract class TVDefault
{
	private Channel[] channel = new Channel[6];
	private int arrayCounter;
	private int volume;
	private int activeChannel;
    private boolean isOn;

	public TVDefault()
	{
        this.arrayCounter = 1;
		this.activeChannel = 1;
		this.volume = 50;
        this.isOn = false;
	}

    public TVDefault(Channel[] channel, int arrayCounter, int volume, int activeChannel, boolean isOn) 
    {
        this.channel = channel;
        this.arrayCounter = arrayCounter;
        this.volume = volume;
        this.activeChannel = activeChannel;
        this.isOn = isOn;
    }

    public void setChannel(Channel channel)
    {
        this.channel[arrayCounter] = channel;
        arrayCounter++;
	}
	
	public void setVolume(int volume)
    {
        this.volume = volume;
    }

    public void setActiveChannel(int frequency)
    {
        for (int i = 1; i <= 5; i++) 
		{
            if (channel[i].getFrequency() == frequency) this.activeChannel = i;
        }
	}

    public void setStatus(boolean isOn)
    {
        this.isOn = isOn;
	}

    public Channel getChannel(int frequency)
    {
        int result = 0;
        for (int i = 1; i <= 5; i++) 
		{
            if (channel[i].getFrequency() == frequency) result = i;
        }
        return channel[result];
	}

	public int getVolume()
    {
        return volume;
    }

	public Channel getActiveChannel()
    {
        return channel[activeChannel];
    }

    public boolean getStatus()
    {
        return isOn;
    }
}