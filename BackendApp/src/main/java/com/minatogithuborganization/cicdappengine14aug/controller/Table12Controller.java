package com.minatogithuborganization.cicdappengine14aug.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogithuborganization.cicdappengine14aug.base.controller.Table12BaseController;
import com.minatogithuborganization.cicdappengine14aug.service.ITable12Service;
import com.minatogithuborganization.cicdappengine14aug.service.Table12Service;
import com.minatogithuborganization.cicdappengine14aug.model.Table12;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/table12s/", produces = "application/json")
public class Table12Controller extends Table12BaseController<ITable12Service<Table12>, Table12> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(Table12Controller.class);
	public Table12Controller(Table12Service table12Service) {
		super(table12Service);
	}
}
