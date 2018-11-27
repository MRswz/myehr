package com.myehr.rest.diagram.services;

import org.apache.shiro.authz.annotation.RequiresUser;
import org.codehaus.jackson.node.ObjectNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ProcessInstanceDiagramLayoutResource extends BaseProcessDefinitionDiagramLayoutResource {

	@RequiresUser
	@RequestMapping(value = "/act/service/process-instance/{processInstanceId}/diagram-layout", method = RequestMethod.GET, produces = "application/json")
	public ObjectNode getDiagram(@PathVariable String processInstanceId) {
		return getDiagramNode(processInstanceId, null);
	}
	
}
