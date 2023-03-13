package controller;

import interfaces.iController;
import interfaces.iGUI;
import interfaces.iRepoCompetition;
import interfaces.iRepoGimnast;
import util.Utils;

public class Controller implements iController {

	private iGUI gui;
	private iRepoGimnast repoGimnast;
	private iRepoCompetition repoCompetition;
	
	public void start() {
		mainMenuRun();		
	}

	public void mainMenuRun() {
		int option;
		
		do {
			gui.mainMenuShow();;
			option = Utils.intInput("Choose an option: ");
			mainMenuControl(option);	
		}while(option != 0);
	}

	public void mainMenuControl(int option) {
		switch(option) {
		case 1:
			
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		case 0:
			Utils.showMessage("");
			Utils.showMessage("Closing App...");
			break;
			
		default: 
			 Utils.showMessage("Incorrect");
	}
	}

}
