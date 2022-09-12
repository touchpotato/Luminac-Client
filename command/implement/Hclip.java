package luminac.command.implement;

import org.lwjgl.input.Keyboard;

import luminac.Client;
import luminac.command.Command;
import luminac.modules.Module;

public class Hclip extends Command {

	public Hclip() {
		super("Info", "Displays client information", "info", "i");
	}

	@Override
	public void onCommand(String[] args, String command) {
		if(args.length > 0) {
			String time = args[0];
			
			boolean foundModule = false;
			
			if(time.equalsIgnoreCase("1")) {
				for(int i = 3; i < 10; i++) {
					mc.theWorld.setWorldTime(0);
				}
				
				Client.addChatMessage("set time to: day");
			}else if(time.equalsIgnoreCase("night")) {
				for(int i = 3; i < 10; i++) {
					mc.theWorld.setWorldTime(14000);
				}
				
				Client.addChatMessage("set time to: night");
			}
		}
	}
}