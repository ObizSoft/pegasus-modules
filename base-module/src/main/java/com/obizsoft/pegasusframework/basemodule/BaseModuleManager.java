package com.obizsoft.pegasusframework.basemodule;

import java.util.List;

import org.apache.wicket.model.Model;
import org.springframework.stereotype.Component;

import com.obizsoft.pegasusframework.basemodule.ui.UserSearchPage;
import com.obizsoft.pegasusframework.common.MenuItem;
import com.obizsoft.pegasusframework.common.ModuleManager;

@Component
public class BaseModuleManager implements ModuleManager {

	public static MenuItem USER_SEARCH = 
			new MenuItem(Model.of("用户管理"), 
					Model.of("BASE::USER"), UserSearchPage.class);
	
	protected static MenuItem ROOT = 
			new MenuItem(Model.of("Base"), 
					Model.of("BASE"), USER_SEARCH);
	
	@Override
	public List<MenuItem> getMenus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MenuItem getRootMenu() {
		return ROOT;
	}

}
