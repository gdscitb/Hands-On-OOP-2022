public class RemoteControl 
{ 
	public void sendActionToTV(int action, Control television, int input) 
    {
        if (action == 1) television.turnOnOff(input);
        else if (action == 2) television.moveChannel(input);
        else if (action == 3) television.setVolumeUp(input);
        else if (action == 4) television.setVolumeDown(input);
	}
}