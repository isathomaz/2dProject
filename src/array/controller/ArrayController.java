package array.controller;

import array.model.MarshmallowMonster;
import array.view.GridView;

public class ArrayController
{
	private int[][] favoriteNumbs;
	private String[][] storyNames;
	private GridView consoleView;
	private MarshmallowMonster[][] myMonster;
	
	public ArrayController()
	{
		storyNames = new String[4][4];
		favoriteNumbs = new int[3][3];
		consoleView =  new GridView();
		myMonster = new MarshmallowMonster[4][4];
		
		fillNumbs();
		fillNames();
	}
	
	public ArrayController(int[][] favoriteNumbs, String[][] storyNames)
	{
		this.consoleView = consoleView;
		this.favoriteNumbs = favoriteNumbs;
		this.storyNames = storyNames;
		this.myMonster = myMonster;
	}
	
	private void fillNames()
	{
		storyNames[0][0] = "Samwise";
		storyNames[0][1] = "Gandalf";
		storyNames[0][2] = "Legolas";
		storyNames[0][3] = "Gimili";
		
		storyNames[1][0] = "Wolverine";
		storyNames[1][1] = "Deadpool";
		storyNames[1][2] = "Spiderman";
		storyNames[1][3] = "StanLee";
		
		storyNames[2][0] = "Aang";
		storyNames[2][1] = "Sokka";
		storyNames[2][2] = "Toph";
		storyNames[2][3] = "Momo";
		
		storyNames[3][0] = "Simba";
		storyNames[3][1] = "Timon";
		storyNames[3][2] = "Pumba";
		storyNames[3][3] = "Mufasa";
	}
	
	private void fillNumbs()
	{
		favoriteNumbs[0][0] = 18;
		favoriteNumbs[0][1] = 24;
		favoriteNumbs[0][2] = 22;

		favoriteNumbs[1][0] = 28;
		favoriteNumbs[1][1] = 48;
		favoriteNumbs[1][2] = 12;
		
		favoriteNumbs[2][0] = 7;
		favoriteNumbs[2][1] = 42;
		favoriteNumbs[2][2] = 2;
	}
	
	
	
	public void start()
	{
		consoleView.printStringInformation(storyNames);
		consoleView.printIntInformation(favoriteNumbs);
		consoleView.printMonsterInformation(myMonster);
	}

	public int[][] getFavoriteNumbs()
	{
		return favoriteNumbs;
	}

	public String[][] getStoryNames()
	{
		return storyNames;
	}

	public void setFavoriteNumbs(int[][] favoriteNumbs)
	{
		this.favoriteNumbs = favoriteNumbs;
	}

	public void setStoryNames(String[][] storyNames)
	{
		this.storyNames = storyNames;
	}
}
