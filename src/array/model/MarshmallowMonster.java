package array.model;


public class MarshmallowMonster
{
	
	//Declaration Section
		private String name;
		private int legs;
		private int arms;
		private int eyes;
		private boolean hasButton;
		
		/*
		 * default constructor - should not be used to make a MarshmallowMonster.
		 */
		public MarshmallowMonster()
			{
				name = "nameless";
				eyes = -70;
				legs = -500;
				arms = -10;
				hasButton = false;
			}
		
		/**
		 * Create a MarshmallowMonster
		 * @param name The name of the monster.
		 * @param eyes The number of eyes the monster has.
		 * @param legs The number of legs the monster has.
		 * @param arms The number of arms the monster has.
		 * @param hasButton Whether or not the monster has a button.
		 */
		public MarshmallowMonster(String name, int eyes, int legs, int arms, boolean hasButton)
			{
				this.name = name;
				this.eyes = eyes;
				this.arms =arms;
				this.legs = legs;
				this.hasButton = hasButton;
				
			}
		
		public void setName()
			{
				this.name = name;
			}
		public void setLegs()
			{
				this.legs = legs;
			}
		public void setArms()
			{
				this.arms = arms;
			}
		public void setEyes()
			{
				this.eyes = eyes;
			}
		public void setHasButton()
			{
				this.hasButton = hasButton;
			}
		
		public String getName()
			{
				return name;
			}
		public int getLegs()
			{
				return legs;
			}
		public int getArms()
			{
				return arms;
			}
		public int getEyes()
			{
				return eyes;
			}
		public boolean getHasButton()
			{
				return hasButton;
			}
		
}
