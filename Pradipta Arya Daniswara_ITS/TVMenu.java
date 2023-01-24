import java.util.*;

public class TVMenu 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		TVSamsung tvsamsung = new TVSamsung();
		TVLG tvlg = new TVLG();
		TVPolytron tvpolytron = new TVPolytron();
		RemoteControl remote = new RemoteControl();

		Channel[] channel = new Channel[6];
		channel[1] = new Channel("RCTI", 14);
		channel[2] = new Channel("SCTV", 69);
		channel[3] = new Channel("INDOSIAR", 420);
		channel[4] = new Channel("ANTV", 721);
		channel[5] = new Channel("GLOBALTV", 823);
		
		for (int i = 1; i <= 5; i++) 
		{
			tvsamsung.setChannel(channel[i]);
			tvlg.setChannel(channel[i]);
			tvpolytron.setChannel(channel[i]);
		}
		
        while (true)
        {
            System.out.println("--------------------------------------\n" +
            "Television Menu\n" +
            "--------------------------------------");
            System.out.println("1. Turn On/Off Television\n" +
			"2. Move Channel\n" +
			"3. Increase Volume\n" +
			"4. Decrease Volume\n" +
            "5. Exit Application");
            System.out.println("Choose menu = ");
            int menuRemote = scanner.nextInt();
            scanner.nextLine();

			if (menuRemote == 5)
            {
                System.out.println("Sayonara!\n");
                scanner.close();
                break;
            }
            
			System.out.println("--------------------------------------\n" +
            "Available brand = samsung, lg, polytron\n" +
			"--------------------------------------");
			System.out.println("Brand name = ");
			String brandName = scanner.nextLine();

			if (menuRemote == 1)
			{
				if (brandName.equals("samsung")) 
				{
					if(tvsamsung.getStatus() == false) remote.sendActionToTV(1, tvsamsung, 1);
					else remote.sendActionToTV(1, tvsamsung, 0);
				}
				else if (brandName.equals("lg")) 
				{
					if(tvlg.getStatus() == false) remote.sendActionToTV(1, tvlg, 1);
					else remote.sendActionToTV(1, tvlg, 0);
				}
				else if (brandName.equals("polytron")) 
				{
					if(tvpolytron.getStatus() == false) remote.sendActionToTV(1, tvpolytron, 1);
					else remote.sendActionToTV(1, tvpolytron, 0);
				}
			}

			else if (menuRemote == 2)
			{
				System.out.println("--------------------------------------\n" +
				"Available channel = RCTI (14), SCTV (69),\n" + 
				"INDOSIAR (420), ANTV (721), GLOBALTV(823)\n" +
				"--------------------------------------");
				System.out.println("Input channel frequency = ");
				int input = scanner.nextInt();
				scanner.nextLine();

				if (brandName.equals("samsung")) 
				{
					if(tvsamsung.getStatus() == true) remote.sendActionToTV(2, tvsamsung, input);
					else System.out.println("Turn on Samsung TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("lg")) 
				{
					if(tvlg.getStatus() == true) remote.sendActionToTV(2, tvlg, input);
					else System.out.println("Turn on LG TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("polytron")) 
				{
					if(tvpolytron.getStatus() == true) remote.sendActionToTV(2, tvpolytron, input);
					else System.out.println("Turn on Polytron TV first!\n" +
					"--------------------------------------");
				}
			}

			else if (menuRemote == 3)
			{
				System.out.println("Increase volume by = ");
				int input = scanner.nextInt();
				scanner.nextLine();

				if (brandName.equals("samsung")) 
				{
					if(tvsamsung.getStatus() == true) remote.sendActionToTV(3, tvsamsung, input);
					else System.out.println("Turn on Samsung TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("lg")) 
				{
					if(tvlg.getStatus() == true) remote.sendActionToTV(3, tvlg, input);
					else System.out.println("Turn on LG TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("polytron")) 
				{
					if(tvpolytron.getStatus() == true) remote.sendActionToTV(3, tvpolytron, input);
					else System.out.println("Turn on Polytron TV first!\n" +
					"--------------------------------------");
				}
			}

			else if (menuRemote == 4)
			{
				System.out.println("Decrease volume by = ");
				int input = scanner.nextInt();
				scanner.nextLine();

				if (brandName.equals("samsung")) 
				{
					if(tvsamsung.getStatus() == true) remote.sendActionToTV(4, tvsamsung, input);
					else System.out.println("Turn on Samsung TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("lg")) 
				{
					if(tvlg.getStatus() == true) remote.sendActionToTV(4, tvlg, input);
					else System.out.println("Turn on LG TV first!\n" +
					"--------------------------------------");
				}
				else if (brandName.equals("polytron")) 
				{
					if(tvpolytron.getStatus() == true) remote.sendActionToTV(4, tvpolytron, input);
					else System.out.println("Turn on Polytron TV first!\n" +
					"--------------------------------------");
				}
			}
        }
    }
}