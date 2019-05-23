package Models;

import Interfaces.Addable;
import Interfaces.CheckInable;
import Interfaces.CheckOutable;
import Interfaces.Removeable;
import Interfaces.Updateable;

public class Newspaper extends Item implements Updateable, CheckOutable, CheckInable, Addable, Removeable {

	private static int newspaperRefID = 444;

	@Override
	public void update(int ID) {
		// TODO Auto-generated method stub

	}

	public static int getNewspaperRefID() {
		return newspaperRefID;
	}

}
