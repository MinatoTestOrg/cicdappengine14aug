package com.minatogithuborganization.cicdappengine14aug.service;

import com.vs.rappit.base.acl.IPerimeterManager;
import com.minatogithuborganization.cicdappengine14aug.base.service.Table12BaseService;
import com.minatogithuborganization.cicdappengine14aug.model.Table12;
import com.minatogithuborganization.cicdappengine14aug.service.Table12PerimeterImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service("Table12")
public class Table12Service extends Table12BaseService<Table12> implements ITable12Service<Table12>{

		@Autowired
		private  Table12PerimeterImpl  table12PerimeterImpl;

		public Table12Service(ChangelogService changelogService) {
		super(Table12.class);	
		setChangelogService(changelogService); 
		
	}
	
	
	protected IPerimeterManager<Table12> getPerimeterManager() {
		return table12PerimeterImpl;
	}
}