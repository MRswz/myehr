package com.myehr.acttest.test;

import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:activiti.cfg.xml")
public class ActivitiTest {

	@Autowired
	private org.activiti.engine.TaskService taskService;
	@Autowired
	private org.activiti.engine.HistoryService historyService;
	@Autowired
	private org.activiti.engine.RepositoryService repositoryService;
	@Autowired
	private org.activiti.engine.RuntimeService runtimeService;
	@Autowired
	private ProcessEngineConfiguration processEngineConfiguration;

	@Test
	public void deploymentProcessDefinition() {
		Deployment deployment = repositoryService.createDeployment() // 创建一个部署对象
				.name("测试流程")// 添加部署的名称
				.addClasspathResource("MyProcess.bpmn")// 从classpath的资源中加载，一次只能加载一个文件
				.addClasspathResource("MyProcess.png")// 从classpath的资源中加载，一次只能加载一个文件
				.deploy(); // 完成部署
		System.out.println("部署ID:" + deployment.getId()); // 1
		System.out.println("部署名称" + deployment.getName());
	}

	@Test
	public void startProcessInstance() {
		// 流程定义的key
		String processDefinitionKey = "myProcess";
		ProcessInstance pi = runtimeService.startProcessInstanceByKey(processDefinitionKey); // 使用流程定义的key启动流程实例,key对应helloworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动
		System.out.println("流程实例ID:" + pi.getId());
		System.out.println("流程定义ID:" + pi.getProcessDefinitionId());
	}

	@Test
	public void completeMyPersonalTask() {
		// 任务ID
		String taskId = "7504";
		taskService.complete(taskId);
		System.out.println("完成任务：任务ID:" + taskId);
	}

}
