package wrapping.controller;

import wrapping.model.Thingy;
import wrapping.view.PopupDisplay;

public class WrappingController

{
	private PopupDisplay myView;
	private Thingy myTestThing;

	public WrappingController()
	{
		myView = new PopupDisplay();
	}

	public void start()
	{
		String myName = myView.grabAnswer("Type in you name");
		myView.showResponse("You typed in: " + myName);
		String temp = myView.grabAnswer("Type in your age");
		int myAge;
		if (isInteger(temp))
		{
			myAge = Integer.parseInt(temp);
		}
		else
		{
			myAge = -99999999;
		}
		myView.showResponse("You typed in: " + myAge);
		String tempWeight = myView.grabAnswer("Type in your weight");
		double myWeight = Double.parseDouble(tempWeight);
		myView.showResponse("You typed in: " + myWeight);

		myTestThing = new Thingy(myName, myAge, myWeight);
	}

	private boolean isInteger(String input)
	{
		boolean isInt = false;

		try
		{
			int temp = Integer.parseInt(input);
			isInt = true;
		}
		catch (NumberFormatException error)
		{
			myView.showResponse("not an int - bad value will be used");
		}

		return isInt;
	}

	private boolean isDouble(String input)
	{
		boolean isDouble = false;

		try
		{
			double temp = Double.parseDouble(input);
			isDouble = true;
		}
		catch (NumberFormatException error)
		{
			myView.showResponse("not a double - bad value will be used");
		}

		return isDouble;
	}
}
